package yoRobot;

public class Robot {
	//Propiedades
	private float peso;
	
	//Piezas del robot
	Pieza sinIdentificar;
	CPU cpu;
	Bateria bateria;

	public Robot() {
		this.cpu=new CPU();
		this.cpu.setNumSerie("rx5500ART");
		this.bateria=new Bateria();
		this.bateria.setPeso(250f);
	}
	
	//GETTERS & SETTERS
	public void setPeso(float p) {
		if(p<0) this.peso=0;
		else this.peso=p;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
}
