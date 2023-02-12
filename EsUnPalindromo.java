package ejercicosMouredev;

import java.util.Scanner;

public class EsUnPalindromo {

	public static void main(String[] args) {
		
		/*
		 * Escribe una función que reciba un texto y retorne verdadero o
		 * falso (Boolean) según sean o no palíndromos.
		 * Un Palíndromo es una palabra o expresión que es igual si se lee
		 * de izquierda a derecha que de derecha a izquierda.
		 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
		 * Ejemplo: Ana lleva al oso la avellana.
		 */
		
		
Scanner sc = new Scanner(System.in);
		
		String  frase1, frase3 = "";
		char [] frase2;
		boolean esPolidromo = false;
		
		System.out.println("Ingrese una palabra: ");
		frase1 = sc.nextLine();
		frase2 = frase1.toCharArray();
		
		for (int i = frase2.length - 1; i >= 0; i--) {
			frase3 = frase3 + frase2[i];
		}
		
		frase1 = removePunctuations(frase1);
		frase3 = removePunctuations(frase3);
		
		if (frase3.equalsIgnoreCase(frase1)) {
			
			esPolidromo = true;
			System.out.println();
			System.out.println("La palabra ingresada es un palidromo: " + esPolidromo);
			
		}else {
			System.out.println();
			System.out.println("La palabra ingresada es un palidromo: " + esPolidromo);
		}
		
		sc.close();
	}
		
	/**
	 * Elimina signos de puntuacion de un String
	 * @param frase1
	 * @return
	 */
	
	public static String removePunctuations(String frase1) {
		return frase1.replaceAll("[!\"#$%&'()*+,-./:;<=>?¿@\\[\\]^_`´{|}~]|\\p{Space}", "");
	}
	
	
}

		
		
		

		
		
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		




