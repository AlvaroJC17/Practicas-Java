package ejercicosMouredev;

import java.util.Scanner;

public class DecimalBinario {

	public static void main(String[] args) {
		
		/* Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.*/
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 int num1 = 0;
		 
		System.out.println("Ingrese un numero decimal:");
		 num1 = sc.nextInt();
		 
		
		 System.out.println("El resultado en binario del valor ingresado es: " + decimalBinario(num1));
		 
		  sc.close();
 	}
 
			 
		 
	/*
	 * Devuelve un string de un numero binario a decimal
	 */
	public static String decimalBinario (int num1) {
		
			int total = 0;
			String binario = "";
		 
		do {
			 
			 total = (num1 % 2);
			 binario = binario + total;
			 num1 = (num1/2);
			 
		 } while (num1 >  0);
	 
		
		binario = new StringBuilder(binario).reverse().toString();   // invertir el sentido de los caracteres en el string
		System.out.println();
		
		return binario;
			
	}
	
}
				
		 
		 
		 
		 

