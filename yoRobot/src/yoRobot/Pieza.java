package yoRobot;

public class Pieza {
	//Propiedades
	private float peso;
	private String numSerie;
	private boolean activo;
	
	public Pieza() {
		System.out.println("Se crea una nueva pieza");
		this.peso=0;
		this.numSerie="";
		this.activo=true;
	}
	
	public Pieza(String numSerie) {
		System.out.println("Se crea una nueva pieza con num Serie");
		this.peso=0;
		this.numSerie=numSerie;
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
