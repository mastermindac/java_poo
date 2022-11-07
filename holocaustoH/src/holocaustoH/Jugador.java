package holocaustoH;

public class Jugador extends Personaje{
	//Vida del Jugador
	final static int VIDA_INICIAL=5;
	
	private int vida=VIDA_INICIAL;
	private boolean piezaHabitacion=false;

	public Jugador() {
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean getPiezaHabitacion() {
		return piezaHabitacion;
	}

	public void setPiezaHabitacion() {
		this.piezaHabitacion = true;
	}

}
