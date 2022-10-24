package funciones;

public class Principal {
	
	//Funcion precio Total
	public static float precioTotal(float precioUd,int uds) {
		//Varaibles
		float precioT;
		
		System.out.println("----- Funcion de calculo de precio total de un producto -----");
		precioT=precioUd*uds;
		System.out.println("PRECIO TOTAL= "+precioT);
		
		return precioT;
		
	}

	public static void main(String[] args) {
		float precioDeProducto=0f;
		
		//Calculo el precioTotal
		precioDeProducto=precioTotal(52.87f,4);
		System.out.println("PRECIO TOTAL= "+precioDeProducto);
		

	}

}
