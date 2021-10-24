package Arrays_ejemplos;

public class Arreglo_ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Ambas son declaraciones validas
	int intArray[];
	int [] intArray2;
	
	//Declarar un array de strings
	String[] arr;
	
	//Asignar memoriapara 6 espacios
	arr= new String [6];
	
	//Inicializar el primer elemento del array
	arr[0]= "cero" ;
	
	//inicializar el segundo elemento
	arr [1]= "uno" ;
	
	arr [2]= "dos" ;
	arr [3]= "tres" ;
	arr [4]= "cuatro" ;
	arr [5]= "cinco" ;
	
	//System.out.println(arr[4]);
	
	//acceder a todos los elementos del array
	for(int i = 0 ; i <arr.length ; i++) {//'arr.length calcula la longitud del arreglo
		System.out.println("Elemento en el indice" + i +":"+ arr[i]);
	}
	
	 
	
	

	}

}
