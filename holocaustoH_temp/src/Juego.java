import java.util.concurrent.ThreadLocalRandom;

public class Juego {
	final static int LANZAR_DADO=1;
	final static int SALIR_JUEGO=0;

	public Juego() {
		
	}
	
	public static void pintarHabitacion(Habitacion h) {
		for(int fil=-1;fil<Habitacion.ALTO;fil++) {
			for (int col=0;col<=Habitacion.ANCHO;col++){
				Posicion posicionActual=new Posicion(col,fil);
				
				if(h.esunJugador(posicionActual)) System.out.print("J");
				else if(fil==-1 && col!=Habitacion.ANCHO) System.out.print(col);
				else if(col==Habitacion.ANCHO && fil!=-1) System.out.print(fil);
				else if(h.esunaPuerta(posicionActual)) System.out.print(" ");
				else if(col==0 || col==Habitacion.ANCHO-1) System.out.print("|"); //Paredes izquierda y derecha
				else if(fil==0 || fil==Habitacion.ALTO-1) System.out.print("="); //Paredes primera y ultima fila
				else System.out.print(" "); //Mapa
				
				if(col==Habitacion.ANCHO) System.out.println();//Siguiente linea
			}
		}
	}
	
	public static int lanzarDado() {
		int dado=ThreadLocalRandom.current().nextInt(1,7);
		System.out.println("[DADO LANZADO] "+dado);
		return dado;
	}
	
	
	public static void pintarMenu() {
		System.out.println("-------------- HOLOCAUSTO H (HADRON) --------------");
		System.out.println("[1] LANZAR DADO DE MOVIMIENTO");
		
		
		System.out.println("[0] SALIR DEL JUEGO");
		System.out.println("---------------------------------------------------");
	}

	
}
