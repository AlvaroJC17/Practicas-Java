package ejercicosMouredev;

import java.util.Scanner;

public class PrimeraLetraEnMayuscula {

	public static void main(String[] args) {
		
		/*
		 * Crea una función que reciba un String de cualquier tipo y se encargue de
		 * poner en mayúscula la primera letra de cada palabra.
		 * - No se pueden utilizar operaciones del lenguaje que
		 *   lo resuelvan directamente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String frase1;
		
		System.out.println("Ingrese una frase en minuscula:");
		frase1 = sc.nextLine();
		
		PrimeraLetraMayuscula(frase1);
		
		sc.close();
	}
		
	/**
	 * Devuelve la primera letra de cada palabra en Mayuscula
	 * @param frase1
	 */
	
	public static void PrimeraLetraMayuscula(String frase1) {
		
		String [] frase2;
		String frase3 = "";
		frase2 = frase1.split(" ");
		
		for (int i = 0; i < frase2.length; i++) {
			frase3 = frase3 +  (frase2[i].toUpperCase().charAt(0))  + (frase2[i].substring(1, frase2[i].length())) + " ";
		}
		System.out.println(frase3);
	}
}

		
		
		

			
			
		
		
		
		
	
	


