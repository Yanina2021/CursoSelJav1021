package ejmplos_if;

public class IfAnidado_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 27;
		
		if (temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("vamos a la playa");			
			}else {
				System.out.println("vamos a la montana");
			}
		}else {
			System.out.println("A descansar");      
		}

	}

}
