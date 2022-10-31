package holocaustoH;

public class Hadron extends Personaje{
	//Propiedades
	private boolean visible=true;

	public Hadron() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean cambioVisibilidad() {
		if(this.visible) this.visible=false;
		else this.visible=true;
		
		return this.visible;
	}

}
