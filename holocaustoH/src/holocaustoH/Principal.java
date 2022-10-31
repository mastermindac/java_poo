package holocaustoH;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int accionJuego=-1;
		Scanner in =new Scanner(System.in);

		//Posicionamos las puertas de entrada y salida
		Posicion pIn=new Posicion(0,3);
		Posicion pOut=new Posicion(5,Habitacion.ALTO-1);
		ObjetoJuego puertaIn=new ObjetoJuego();
		puertaIn.setPos(pIn);
		puertaIn.setLetraMapa(' ');
		ObjetoJuego puertaOut=new ObjetoJuego();
		puertaOut.setPos(pOut);
		puertaOut.setLetraMapa(' ');
		
		//Generaremos el jugador y lo almacenamos en la Habitacion
		Jugador jugador=new Jugador();
		jugador.setPos(pIn);
		jugador.setLetraMapa('J');
		
		//Generamos una habitación y sus elementos
		Habitacion habInicial=new Habitacion();
		habInicial.setObjetoJ(jugador);
		habInicial.setObjetoJ(puertaIn);
		habInicial.setObjetoJ(puertaOut);
		

		while(accionJuego!=Juego.SALIR_JUEGO) {
			//Pintamos la habitacion
			Juego.pintarHabitacion(habInicial);
			Juego.pintarMenu();
			accionJuego=in.nextInt();
			
			switch(accionJuego) {
				case Juego.LANZAR_DADO:
					int numMov=Juego.lanzarDado();
					System.out.print("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes "+numMov+" movimientos");
					int numColumnas = in.nextInt();
					jugador.movX(numColumnas);
					numMov=numMov-numColumnas;
					System.out.print("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes "+numMov+" movimientos");
					int numFiles = in.nextInt();
					jugador.movY(numFiles);
					break;
			}

		}
	}

}
