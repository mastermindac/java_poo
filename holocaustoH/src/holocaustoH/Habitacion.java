package holocaustoH;

public class Habitacion {
	private Posicion puertaEntrada;

	public Habitacion() {
		System.out.println("Creación de una habitación");
	}

	public Posicion getPuertaEntrada() {
		return puertaEntrada;
	}

	public void setPuertaEntrada(Posicion puertaEntrada) {
		this.puertaEntrada = puertaEntrada;
	}

}
