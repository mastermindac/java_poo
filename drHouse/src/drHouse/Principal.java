package drHouse;
import java.util.Scanner;

public class Principal {
	
	public static String pregunta(String p) {
		//Activo Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunto
		System.out.println(p);
		//Responde el usuario
		String r=sc.nextLine();
		//DEvuelvo la respuesta
		return r;
	}
	
	//Funcion es la decision de donde redirigir al paciente
	public static void departTrauma(String nombre) {
		//Realizar proceso de preguntas trauma
	}
	
	//Funcion es la decision de donde redirigir al paciente
	public static void triage(String nombre) {
		String respuesta="";
		
		//Preguntamos si se ha caído
		respuesta=pregunta(nombre+" ¿Has sufrido una caída?[S,N]");
		while(!respuesta.equals("S")&&!respuesta.equals("N")) {
			respuesta=pregunta(nombre+" ¿Has sufrido una caída?[S,N]");
		}
		if(respuesta.equals("S")) {
			//TRAUMATOLOGIA
			System.out.println("A trauma");
			departTrauma(nombre);
		}else if(respuesta.equals("N")){
			//Preguntamos si tiene fiebre
			respuesta=pregunta(nombre+" ¿Has tenido fiebre?[S,N]");
			while(!respuesta.equals("S")&&!respuesta.equals("N")) {
				respuesta=pregunta(nombre+" ¿Has tenido fiebre?[S,N]");
			}
		}
		
	}
	

	public static void main(String[] args) {

		//Comienza el proceso
		triage("Paco");

	}

}
