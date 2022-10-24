package yoRobot;

public class Principal {

	public static void main(String[] args) {
		int edad=40;
		
		Robot r=new Robot();
		Robot paquito=new Robot();
		
		//Objetos
		//r.peso=120.67f;
		r.setPeso(120.67f);
		System.out.println(r.getPeso());
		//paquito.peso=-198.50f;
		paquito.setPeso(-198.50f);
		System.out.println(paquito.getPeso());
		
	}

}
