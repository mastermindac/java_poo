

public class Habitacion {
	//Tamaño de la habitacion
	public static final int ANCHO=10;
	public static final int ALTO=10;
	
	//Puertas
	//Las puertas deben estar en cualquiera de las cuatro paredes
	//Por lo tanto en su posición deberán siempre contener un 0 o un ANCHO-1 o un ALTO-1
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	
	//Hacemos una copia del jugador
	private Personaje j;
	//Elementos de la habitación
	private ElementoJuego[] elementos=new ElementoJuego[20];
	private int numElementos=0;
	

	public Habitacion() {
		System.out.println("Creación de una habitación");
	}
	
	public Habitacion(Posicion puertaIn,Posicion puertaOut,Personaje j) {
		this.puertaEntrada=puertaIn;
		this.puertaSalida=puertaOut;
		this.j=j;
		this.j.setPos(this.puertaEntrada);
	}
	public Habitacion(Posicion puertaIn,Posicion puertaOut,Posicion jugador) {
		this.setElemento(new Objeto(puertaIn,' '));
		this.setElemento(new Objeto(puertaOut,' '));
		this.setElemento(new Jugador(jugador,' '));
	}


	public Posicion getPuertaEntrada() {
		return puertaEntrada;
	}

	public void setPuertaEntrada(Posicion puertaEntrada) {
		this.puertaEntrada = puertaEntrada;
	}

	public Posicion getPuertaSalida() {
		return puertaSalida;
	}

	public void setPuertaSalida(Posicion puertaSalida) {
		this.puertaSalida = puertaSalida;
	}

	public void setElemento(ElementoJuego elemento) {
		elementos[numElementos]=elemento;
		numElementos++;
	}
	
	public void setJugador(Jugador j) {
		this.j = j;
	}
	
	public boolean esunaPuerta(Posicion p) {
		if(p.esIgual(puertaEntrada) || p.esIgual(puertaSalida)) return true;
		return false;
	}
	
	public boolean esunJugador(Posicion p) {
		if(p.esIgual(j.getPos())) return true;
		return false;
	}
	

}
