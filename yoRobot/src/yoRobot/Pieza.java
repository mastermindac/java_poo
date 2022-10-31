package yoRobot;

public class Pieza {
	//Propiedades
	private float peso;
	private String numSerie;
	private boolean activo;
	
	public Pieza() {
		this.peso=0;
		this.numSerie="";
		this.activo=true;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	
	public boolean activar() {
		return this.activo=true;
	}
	
	public boolean desactivar() {
		return this.activo=false;
	}
	

}
