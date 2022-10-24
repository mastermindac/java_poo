package arrays;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		//Definición de arrays
		String nombres[]= {"Paco","Lucía","Marcos","Sandra","Nate","Arturo","David","Tomas","Hernan",""};
		float calificaciones[]=new float[10];
		String apellidos[]=new String[20];
		
		
		calificaciones[0]=3.45f;
		//System.out.println(nombres[0]);
		//System.out.println(nombres[1]);
		
		
		
		//Activo Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunto
		System.out.println("Cual es el nuevo nombre?");
		//Responde el usuario
		String nombreFinal=sc.nextLine();
		nombres[nombres.length-1]=nombreFinal;
		
		//Recorrer los elementos de un array
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}

	}

}
