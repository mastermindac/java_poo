package holocaustoH;

public class Principal {

	public static void main(String[] args) {

		
		//Posicionamos las puertas de entrada y salida
		Posicion puertaIn=new Posicion(0,3);
		Posicion puertaOut=new Posicion(5,Habitacion.ALTO-1);
		
		//Generaremos el jugador y lo almacenamos en la Habitacion
		Personaje jugador=new Personaje();
		//Generamos una habitación y sus elementos
		Habitacion habInicial=new Habitacion(puertaIn,puertaOut,jugador);
		

		
		//Pintamos la habitacion
		Juego.pintarHabitacion(habInicial);
	}

}
