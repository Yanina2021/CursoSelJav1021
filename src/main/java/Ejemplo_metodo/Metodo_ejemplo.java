package Ejemplo_metodo;

public class Metodo_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = suma(4,8);
		System.out.println(resultado);
		
		int resultado2= suma(18,99);
		System.out.println(resultado2);
		
		String marca= aut (3);
		System.out.println(marca);
		
	}
	
	public static int suma(int a ,int b) {
		int c = a + b ;
		return c ;
	}
	
	public static String aut(int a) {
		String [] cars = {"volvo" , "BMW" , "Ford" , "Mazda"};
		return cars[a];
		
	}

}
