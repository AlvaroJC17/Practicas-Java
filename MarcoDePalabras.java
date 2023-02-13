package ejercicosMouredev;

import java.util.Scanner;

public class MarcoDePalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String texto;
		System.out.println("Ingrese un texto:");
		texto = sc.nextLine();
		
		
		System.out.println(marcoPalabras(texto));
		
sc.close();

	}
	
	/*
	 * Devuelve string enmarcado en esteriscos.
	 */
	public static String marcoPalabras (String texto) {
		
		String [] texto1;
		texto1 = texto.split(" ");
		int maxWordsLength = 0;
		
		for (int i = 0; i < texto1.length; i++) {
			if (texto1[i].length() > maxWordsLength) {
				maxWordsLength = texto1[i].length();
			}
		}
		System.out.println("*".repeat(maxWordsLength + 4));
		
		for (int i = 0; i < texto1.length; i++) {
			System.out.println("* " + texto1[i] + (" ".repeat(maxWordsLength - texto1[i].length())) + " *" );
		}
			
		System.out.println("*".repeat(maxWordsLength + 4));
		
		return "";
	}
	
}

				
		
		
		
		
		



