package holocaustoH;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int accionJuego=-1;
		Scanner in =new Scanner(System.in);

		
		//Posicionamos las puertas de entrada y salida
		Posicion puertaIn=new Posicion(0,3);
		Posicion puertaOut=new Posicion(5,Habitacion.ALTO-1);
		
		//Generaremos el jugador y lo almacenamos en la Habitacion
		Jugador jugador=new Jugador();
		//Generamos una habitación y sus elementos
		Habitacion habInicial=new Habitacion(puertaIn,puertaOut,jugador);
		

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
