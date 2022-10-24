package holocaustoH;

public class Principal {

	public static void main(String[] args) {
		Posicion posInicial=new Posicion();
		posInicial.setPosX(3);
		posInicial.setPosY(0);
		//Generaremos los dos primerso objetos
		
		Habitacion hab1=new Habitacion();

		Personaje jugador=new Personaje();
		jugador.setPos(posInicial);
	}

}
