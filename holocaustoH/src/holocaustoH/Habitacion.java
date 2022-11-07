package holocaustoH;

public class Habitacion {
	//Tamaño de la habitacion
	public static final int ANCHO=30;
	public static final int ALTO=10;
	
	//Puertas
	//Las puertas deben estar en cualquiera de las cuatro paredes
	//Por lo tanto en su posición deberán siempre contener un 0 o un ANCHO-1 o un ALTO-1
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	
	//Conjunto de Objetos de Juego
	private ObjetoJuego[] objetosJ=new ObjetoJuego[20];
	private int numObjetos=0;
	
	//Hacemos una copia del jugador
	private Personaje j;
	

	public Habitacion() {
	}
	
	public Habitacion(Posicion puertaIn,Posicion puertaOut,Personaje j) {
		this.puertaEntrada=puertaIn;
		this.puertaSalida=puertaOut;
		this.j=j;
		this.j.setPos(this.puertaEntrada);
	}

	public void setObjetoJ(ObjetoJuego obj) {
		objetosJ[numObjetos]=obj;
		numObjetos++;
	}
	
	public ObjetoJuego getObjetoJ(int objPos) {
		return objetosJ[objPos];
	}
	
	public void eliminarObjetoJ(int objPos) {
		int posObjetos=0;
		for (int i=0;i<numObjetos;i++) {
			if(objPos!=i) {
				objetosJ[posObjetos]=objetosJ[i];
				posObjetos++;
			}
		}
		numObjetos--;
	}
	
	public int hayObjeto(Posicion p) {
		for (int i=0;i<numObjetos;i++) {
			ObjetoJuego obj=objetosJ[i];
			Posicion objPosicion=obj.getPos();
			if(p.esIgual(objPosicion)) return i;
		}
		return -1;
	}
	
	public int hayObjetoSinJugador(Posicion p) {
		for (int i=1;i<numObjetos;i++) {
			ObjetoJuego obj=objetosJ[i];
			Posicion objPosicion=obj.getPos();
			if(p.esIgual(objPosicion)) return i;
		}
		return -1;
	}
	
	
	//Versiones iniciales
	public void setPersonaje(Personaje p) {
	}
	
	public void setJugador(Jugador j) {
		this.j = j;
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
	
	public boolean esunaPuerta(Posicion p) {
		if(p.esIgual(puertaEntrada) || p.esIgual(puertaSalida)) return true;
		return false;
	}
	
	public boolean esunJugador(Posicion p) {
		if(p.esIgual(j.getPos())) return true;
		return false;
	}

}
