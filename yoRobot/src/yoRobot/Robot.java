package yoRobot;

public class Robot {
	//Propiedades
	private float peso;

	public Robot() {
		
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
