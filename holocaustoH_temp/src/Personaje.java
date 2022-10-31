

public class Personaje extends ElementoJuego{


	public Personaje() {
		System.out.println("Creación de un personaje");
	}
	public Personaje(Posicion pos,char letraMapa) {
		super(pos,letraMapa);
	}

	//Movimientos de jugador
	public void movX(int movX) {
		Posicion pos=super.getPos();
		pos.setPosX(pos.getPosX()+movX);
	}
	public void movY(int movY) {
		Posicion pos=super.getPos();
		pos.setPosY(pos.getPosY()+movY);
	}


}
