package estructurasControlDecision;

public class Principal {

	public static void main(String[] args) {
		//estructura de repeticion
		for(int i=10;i<=30;i=i+2) {
			System.out.print(i+",");
		}
		System.out.println();
		//estructuras control
		for(int edad=10;edad<=20;edad=edad+2) {
			
			if(edad>18) {
				System.out.println("Tiene mas de 18 años");
			}else if(edad>=16){
				System.out.println("Tiene mas de 16 años");
			}else {
				System.out.println("Tiene menos de 16 años");
			}
		}

	}

}
