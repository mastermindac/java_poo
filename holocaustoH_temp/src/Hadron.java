

public class Hadron extends Personaje{
	//Propiedades
	private boolean visible=true;

	public Hadron() {
		this.setLetraMapa('H');
	}
	
	public boolean cambioVisibilidad() {
		if(this.visible) this.visible=false;
		else this.visible=true;
		
		return this.visible;
	}

}
