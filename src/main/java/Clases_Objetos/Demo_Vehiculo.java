package Clases_Objetos;

public class Demo_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo ();
		
		//Asignar valores a las propiedades del objeto minivan
		minivan.pasajeros= 11 ;
		minivan.capacidad= 15 ;
		minivan.kmh = 20 ;
		
		//calcular el rango asumiendo el tanque lleno
		int rango = minivan.capacidad * minivan.kmh ;
		
		System.out.println("la minivan puede llevar" + minivan.pasajeros + " pasajeros,con un rango de" + rango + " kilometros");
		

	}

}
