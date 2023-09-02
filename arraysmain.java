package pakegearrays;

public class arraysmain {

	public static void main(String[] args) {
		//Dos formas de declarar el array.
		//int[] arrayDeEnteros;
		//String arrayDeStringsString[];
		
		//Creacion array
		//arrayDeEnteros = new int[10];//array que va desde la posicion 0 a la 9.
		//ATS
		int numeros[] = new int[3];//creacion array y numero de datos que almacena, si son 3 es del 0 al 2.
		//Doy valor a las posiciones
		numeros[0] = 5;
		numeros[1] = 7;
	    numeros[2] = 9;  

	    //Tambien podemos hacerlo asi que lo creamos y le damos valor a la vez.
	    int[]edad = {16,23,24,26}; 
	    
	    //System.out.println(numeros[0]);
	    //Para imprimir cuando sean muchos datos y no crear muchos system.out.
	    for(int i=0;i<3;i++) {
	    System.out.println(edad[i]);
	    
	  
	    
	    
	    
	    
	    
	    
	    } 
	}

}
