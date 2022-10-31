
public class ElementoJuego {
	
	//Propiedades
	private String nombre;
	private Posicion pos;
	//Letra en mapa
	private char letraMapa=' ';
	
	
	public ElementoJuego() {
		// TODO Auto-generated constructor stub
	}
	public ElementoJuego(Posicion pos) {
		this.pos=pos;
	}
	public ElementoJuego(Posicion pos,char letraMapa) {
		this.pos=pos;
		this.letraMapa=letraMapa;
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

	public char getLetraMapa() {
		return letraMapa;
	}

	public void setLetraMapa(char letraMapa) {
		this.letraMapa = letraMapa;
	}
	
}
