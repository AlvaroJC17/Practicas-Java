package ejercicosMouredev;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramas {

	public static void main(String[] args) {
		
		
												/*Escribe una función que reciba dos palabras (String) y retorne
												 * verdadero o falso (Bool) según sean o no anagramas.
												 * - Un Anagrama consiste en formar una palabra reordenando TODAS
												 *   las letras de otra palabra inicial.
												 * - NO hace falta comprobar que ambas palabras existan.
												 * - Dos palabras exactamente iguales no son anagrama.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String palabra1, palabra2;
		char[] palabraOrden1 = null, palabraOrden2 = null;
		
		
		System.out.print("Ingrese una palabra: ");
		palabra1 = sc.nextLine();
		
		System.out.print("Ingrese otra palabra: ");
		palabra2 = sc.nextLine();
		
		if (palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales...");
			System.exit(0);
		}
			
			palabraOrden1 = palabra1.toCharArray();
			Arrays.sort(palabraOrden1);
			System.out.println(Arrays.toString(palabraOrden1));
			
			palabraOrden2 = palabra2.toCharArray();
			Arrays.sort(palabraOrden2);
			//System.out.println(Arrays.toString(palabraOrden2));
		
		
		if (Arrays.equals(palabraOrden1, palabraOrden2)) {
			System.out.println();
			System.out.println("Las palabras son anagramas...");
		}else {
			System.out.println();
			System.out.println("Las palabras no son anagramas...");
		}
			
			
			
		sc.close();
		}
}
			
	
	
			

	
				
				
		
			
			
			
			
			
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
		
		

