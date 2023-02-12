package ejercicosMouredev;


import java.util.Scanner;

public class InviertiendoCadenas {

	public static void main(String[] args) {

								/*
								 * Crea un programa que invierta el orden de una cadena de texto
								 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
								 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
								 */
		
		Scanner sc = new Scanner(System.in);
		
		String  frase1, frase3 = "";
		char [] frase2;
		
		
		
		
		System.out.println("Ingrese una cadena de texto");
		frase1 = sc.nextLine();
		frase2 = frase1.toCharArray();
		
		
		for (int i = frase2.length - 1; i >= 0; i--) {
			frase3 = frase3 + frase2[i];
		}

		
		System.out.println();
		System.out.println("La frase invertida quedaria de la siguiente manera: " + frase3);
		
		sc.close();
	}
	
}

		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
