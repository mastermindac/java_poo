package holocaustoH;

public class Personaje {
	//Propiedades
	private String nombre;
	private Posicion pos;

	public Personaje() {
		System.out.println("Creación de un personaje");
	}
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}


}
