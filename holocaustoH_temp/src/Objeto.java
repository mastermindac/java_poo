

public class Objeto extends ElementoJuego{

	public Objeto() {
		this.setLetraMapa('O');
	}
	
	public Objeto(Posicion pos,char letraMapa) {
		super(pos,letraMapa);
	}

}
