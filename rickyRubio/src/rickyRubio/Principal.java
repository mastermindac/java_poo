package rickyRubio;

public class Principal {

	public static void main(String[] args) {
		//Datos personales
		String nombre="Ricky";
		String apellido="Rubio";
		int altura=188;
		int edad=31;
		
		//Datos equipos
		short dorsal=13;
		String equipo="Cavaliers";
		
		//Temporada 21-22
		float puntosPartido=13.1f;
		float rebPartido=4.1f;
		float asistPartido=6.6f;
		boolean lesionado=true;
		
		//Datos por pantalla
		System.out.println("-------Datos Personales-------");
		System.out.println("nombre: "+nombre+" "+apellido);
		System.out.println("edad: "+edad);
		System.out.println("altura[cm]: "+altura);
		System.out.println();
		System.out.println("-------Datos Equipo-------");
		System.out.println("dorsal: "+dorsal);
		System.out.println("equipo: "+equipo);
		System.out.println();
		System.out.println("-------Estadísticas-------");
		System.out.println("PP: "+puntosPartido);
		System.out.println("RP: "+rebPartido);
		System.out.println("AP: "+asistPartido);
		System.out.println("¿Lesionado?: "+lesionado);
		
	}

}
