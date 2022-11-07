package holocaustoH;
import java.util.concurrent.ThreadLocalRandom;

public class Juego {
	final static int LANZAR_DADO=1;
	final static int SALIR_JUEGO=0;
	
	static Posicion[] posiciones=new Posicion[20];
	static int numPosiciones=0;

	public Juego() {
		
	}
	
	public static void pintarHabitacion(Habitacion h) {
		System.out.println("--------------         MAPA          --------------");
		for(int fil=-1;fil<Habitacion.ALTO;fil++) {
			for (int col=0;col<=Habitacion.ANCHO;col++){
				Posicion posicionActual=new Posicion(col,fil);
				int posObj=h.hayObjeto(posicionActual);
				if(posObj!=-1) {
					ObjetoJuego objJ=h.getObjetoJ(posObj);
					//Comprobamos si el jugador ha conseguido la pieza para pintar la salida
					//El jugador siempre estará en la posicion 0 de los objetos de la habitación
					if(objJ.getTipoObjeto()==ObjetoJuego.PUERTA_OUT)
						if(((Jugador)h.getObjetoJ(0)).getPiezaHabitacion()) {
							System.out.print(objJ.getLetraMapa());
						}else {
							if(col==0 || col==Habitacion.ANCHO-1) System.out.print("|"); //Paredes izquierda y derecha
							if(fil==0 || fil==Habitacion.ALTO-1) System.out.print("="); //Paredes primera y ultima fila							
						}
						else System.out.print(objJ.getLetraMapa());
				}
				else if(fil==-1 && col!=Habitacion.ANCHO) {
					if(col>9) System.out.print(col%10);
					else System.out.print(col);
				}
				else if(col==Habitacion.ANCHO && fil!=-1) System.out.print(fil);
				else if(col==0 || col==Habitacion.ANCHO-1) System.out.print("|"); //Paredes izquierda y derecha
				else if(fil==0 || fil==Habitacion.ALTO-1) System.out.print("="); //Paredes primera y ultima fila
				else System.out.print(" "); //Mapa
				
				if(col==Habitacion.ANCHO) System.out.println();//Siguiente linea
			}
		}
		System.out.println("---------------------------------------------------");
	}
	
	public static void pintarMenu() {
		System.out.println("-------------- HOLOCAUSTO H (HADRON) --------------");
		System.out.println("[1] LANZAR DADO DE MOVIMIENTO");
		System.out.println("[0] SALIR DEL JUEGO");
		System.out.println("---------------------------------------------------");
	}

	public static void resolverObjeto(ObjetoJuego obj) {
		System.out.println("--------------        OBJETO         --------------");
		System.out.println(obj.getClass().getName());
		System.out.println("---------------------------------------------------");
	}
	
	public static int explotaHadron(int vidaPerdida) {
		int muerte=-1;
		System.out.println("--------------        HADRON         --------------");
		System.out.println("¡¡¡¡¡¡HAS CHOCADO CONTRA UN HADRÓN!!!!!!");
		System.out.println("Has perdido "+vidaPerdida+" puntos de vida");
		if(vidaPerdida>=Jugador.VIDA_INICIAL) {
			System.out.println("----> Estas muerto <----");
			muerte=Juego.SALIR_JUEGO;
		}
		else System.out.println("Has tenido suerte puedes continuar");
		System.out.println("---------------------------------------------------");
		return muerte;

	}

	public static void habitacionSuperada(Habitacion h) {
		System.out.println("--------------  HABITACIÓN SUPERADA  --------------");
		Juego.pintarHabitacion(h);
		System.out.println("---------------------------------------------------");
	}
	
	public static int lanzarDado(int numCaras) {
		int dado=ThreadLocalRandom.current().nextInt(1, numCaras+1);
		System.out.println("[DADO LANZADO] "+dado);
		return dado;
	}
	
	public static Posicion posAleatoria() {
		int posX=ThreadLocalRandom.current().nextInt(2, Habitacion.ANCHO-2);
		int posY=ThreadLocalRandom.current().nextInt(2, Habitacion.ALTO-2);
		Posicion posTemp=new Posicion(posX,posY);
		//Comprobación de todas las posiciones diferentes
		if(numPosiciones>0) {
			for(int i=0;i<numPosiciones;i++) {
				if(posTemp.esIgual(posiciones[i])) {
					posX=ThreadLocalRandom.current().nextInt(2, Habitacion.ANCHO-2);
					posY=ThreadLocalRandom.current().nextInt(2, Habitacion.ALTO-2);
					posTemp.setPosX(posX);
					posTemp.setPosX(posY);
					i=0;
				}
			}
		}
		posiciones[numPosiciones]=posTemp;
		numPosiciones++;
		return posiciones[numPosiciones-1];
	}
	
}
