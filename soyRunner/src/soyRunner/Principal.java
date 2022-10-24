package soyRunner;
import java.util.Scanner;

public class Principal {
	
	//MENU DE TRABAJO PARA INTERACTUAR CON EL USUARIO
	public static int mostrarMenu(boolean error) {
		Scanner sc= new Scanner(System.in);
		if(error) System.out.println("INTRODUCE ÚNICAMENTE UNA VALOR [0,1,2,3]");
		System.out.println("---------MENU---------");
		System.out.println("[0] FINALIZAR");
		System.out.println("[1] NUEVO DATO");
		System.out.println("[2] MOSTRAR DATOS");
		System.out.println("[3] BORRAR ULTIMO DATO");
		System.out.println("----------------------");
		System.out.print("TU OPCION [0,1,2,3]-> ");
		int respuesta=sc.nextInt();
		while(respuesta<0||respuesta>3) respuesta=mostrarMenu(true);
		return respuesta;
	}
	
	//Solicitar un nuevo registro
	public static void nuevoRegistro(float tmpos[], int uReg) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Introducir el nuevo tiempo en min,seg: ");
		float nuevoDato=sc.nextFloat();
		tmpos[uReg]=nuevoDato;
	}

	//Mostrar registros
	public static void mostrarRegistros(float tmpos[], int uReg) {
		System.out.println("---------DATOS--------");
		for(int i=0;i<uReg;i++) {
			System.out.println("Dato["+i+"]: "+tmpos[i]);
		}
		System.out.println("----------------------");
	}


	public static void main(String[] args) {
		//Definir los arrays
		float tiempos[]= {0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		float distancias[]= {0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		String etiquetas[]= {"","","","","","","","","",""};
		int ultRegistro=0;
		
		//Inicialización de variables
		int respuesta=-1;
		
		respuesta=mostrarMenu(false);
		
		//Acciones sobre menu
		while(respuesta!=0) {
			switch(respuesta) {
				case 1:
					nuevoRegistro(tiempos,ultRegistro);
					ultRegistro++;
					break;
				case 2:
					mostrarRegistros(tiempos,ultRegistro);
					break;
				case 3:
					break;
			}
			respuesta=mostrarMenu(false);
		}

	}

}
