package holocaustoH;

/**
* Clase que nos permite definir cualquier objeto dentro de una habitación.
* 
* Los tipos de objetos que podemos usar son:
* <ul>

* <li>JUGADOR=0
* <li>HADRON=1
* <li>PIEZA=2
* <li>OBJETO=3
* <li>PUERTA_IN=4
* <li>PUERTA_OUT=5
* </ul>
* <p>
* 
* @author      Paco Gomez
* @author	   Mastermind
* @version     1.0
*/
public class ObjetoJuego {
	//Tipos de ObjetoJuego
	final static int JUGADOR=0;
	final static int HADRON=1;
	final static int PIEZA=2;
	final static int OBJETO=3;
	final static int PUERTA_IN=4;
	final static int PUERTA_OUT=5;
	
	//Propiedades
	private String nombre;
	private Posicion pos;
	private int tipoObjeto=-1;
	
	//Letra en mapa
	private char letraMapa=' ';

	public ObjetoJuego() {
	}
	
	//GETTERS & SETTERS
	/**
	 * getNombre Devolver el parametro nombre
	 * 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setNombre Coloca un nombre en la propiedad
	 * 
	 * @param nombre
	 */
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

	public int getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(int tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

}
