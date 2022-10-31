import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int accionJuego=-1;
		//Variables de movimiento
		int dadoMovimiento=0;
		Scanner in = new Scanner(System.in);

		
		//Posicionamos las puertas de entrada y salida
		Posicion puertaIn=new Posicion(0,3);
		Posicion puertaOut=new Posicion(5,Habitacion.ALTO-1);
		
		//Generaremos el jugador y lo almacenamos en la Habitacion
		Jugador jugador=new Jugador();
		jugador.setPos(puertaIn);
		//Generamos una habitación y sus elementos
		Habitacion habInicial=new Habitacion(puertaIn,puertaOut,puertaIn);
		

		//Lanzamos menu hasta que se introduzca salir
		while(accionJuego!=Juego.SALIR_JUEGO)
		{
			//Pintamos la habitacion
			Juego.pintarHabitacion(habInicial);
			Juego.pintarMenu();
			accionJuego=in.nextInt();
			switch(accionJuego) {
				case Juego.LANZAR_DADO:
						dadoMovimiento=Juego.lanzarDado();
						System.out.print("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes "+dadoMovimiento+" movimientos");
						int numColumnas=in.nextInt();
						jugador.movX(numColumnas);
						dadoMovimiento=dadoMovimiento-numColumnas;
						System.out.print("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes "+dadoMovimiento+" movimientos");
						int numFilas=in.nextInt();
						jugador.movY(numFilas);
						break;
			}
		}
	}

}
