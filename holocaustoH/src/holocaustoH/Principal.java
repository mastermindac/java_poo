package holocaustoH;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Variables del juego
		int accionJuego=-1;
		Scanner in =new Scanner(System.in);
		int objeto=0;

		//Posicionamos las puertas de entrada y salida
		Posicion pIn=new Posicion(0,3);
		Posicion pOut=new Posicion(5,Habitacion.ALTO-1);
		ObjetoJuego puertaIn=new ObjetoJuego();
		puertaIn.setPos(pIn);
		puertaIn.setLetraMapa(' ');
		puertaIn.setTipoObjeto(ObjetoJuego.PUERTA_IN);
		ObjetoJuego puertaOut=new ObjetoJuego();
		puertaOut.setPos(pOut);
		puertaOut.setLetraMapa(' ');
		puertaOut.setTipoObjeto(ObjetoJuego.PUERTA_OUT);
		
		//Generaremos el jugador
		Posicion pInJ=new Posicion(pIn.getPosX(),pIn.getPosY());
		Jugador jugador=new Jugador();
		jugador.setPos(pInJ);
		jugador.setLetraMapa('J');
		jugador.setTipoObjeto(ObjetoJuego.JUGADOR);
		
		//Generaremos el hadron
		Hadron hadron=new Hadron();
		Posicion pH=Juego.posAleatoria();
		hadron.setPos(pH);
		hadron.setLetraMapa('O');
		hadron.setTipoObjeto(ObjetoJuego.HADRON);
		
		//Generaremos una nueva pieza
		ObjetoJuego pieza=new ObjetoJuego();
		Posicion pPieza=Juego.posAleatoria();
		pieza.setPos(pPieza);
		pieza.setLetraMapa('P');
		pieza.setTipoObjeto(ObjetoJuego.PIEZA);
		
		//Generaremos un nuevo objeto Oculto
		ObjetoJuego objOculto=new ObjetoJuego();
		Posicion pobjOculto=Juego.posAleatoria();
		objOculto.setPos(pobjOculto);
		objOculto.setLetraMapa('O');
		objOculto.setTipoObjeto(ObjetoJuego.OBJETO);
		
		//Generamos una habitación y sus elementos
		Habitacion habInicial=new Habitacion();
		habInicial.setObjetoJ(jugador);
		habInicial.setObjetoJ(puertaIn);
		habInicial.setObjetoJ(puertaOut);
		habInicial.setObjetoJ(hadron);
		habInicial.setObjetoJ(pieza);
		habInicial.setObjetoJ(objOculto);
		

		//BUCLE PRINCIPAL DEL JUEGO
		while(accionJuego!=Juego.SALIR_JUEGO) {
			int numMov=0;
			//Pintamos la habitacion
			Juego.pintarHabitacion(habInicial);
			
			Juego.pintarMenu();
			accionJuego=in.nextInt();
			
			switch(accionJuego) {
				case Juego.LANZAR_DADO:
					numMov=Juego.lanzarDado(10);
					System.out.print("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes "+numMov+" movimientos");
					int numColumnas = in.nextInt();
					jugador.movX(numColumnas);
					numMov=numMov-numColumnas;
					System.out.print("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes "+numMov+" movimientos");
					int numFiles = in.nextInt();
					jugador.movY(numFiles);
					//Comprobamos si hay un objeto en la posición actual
					objeto=habInicial.hayObjetoSinJugador(jugador.getPos());
					break;
			}
			
			
			if(objeto>0) {
				//Se ha chocado contra un hadron
				if(habInicial.getObjetoJ(objeto).getTipoObjeto()==ObjetoJuego.HADRON) {
					int vidaPerdida=Juego.lanzarDado(2)*numMov;
					accionJuego=Juego.explotaHadron(vidaPerdida);
				}
				else if(habInicial.getObjetoJ(objeto).getTipoObjeto()==ObjetoJuego.PIEZA) {
					jugador.setPiezaHabitacion();
				}
				else if(habInicial.getObjetoJ(objeto).getTipoObjeto()==ObjetoJuego.PUERTA_OUT) {
					Juego.habitacionSuperada(habInicial);
					accionJuego=Juego.SALIR_JUEGO;
				}
				habInicial.eliminarObjetoJ(objeto);
				objeto=-1;
			}
		}
	}

}
