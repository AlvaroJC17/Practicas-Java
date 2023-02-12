package ejercicosMouredev;


import java.util.Scanner;

public class VocalMasComun {

	public static void main(String[] args) {
		
		/*
		 * Enunciado: Crea un función que reciba un texto y retorne la letra que
		 * más veces se repita.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		String texto;
		
		System.out.println("Ingrese un texo");
		texto = sc.nextLine();
		
		System.out.println("La letra que mas se repite es: " + "[" + letras(texto) + "]");
		
		
		sc.close();
		
		
		
	}
	
	public static char letras(String texto) {
		
		char [] letra;
		int contador = 0, numMayor = 0;
		char vocal = 0;
		
		
		letra = texto.toCharArray();
		
		for (int i = 0; i < letra.length; i++) {
			if (letra[i] != ' ') {
				contador = 0;
				for (int j = 0; j < letra.length; j++) {
					if (letra[j] != ' ') {
						
						if (letra[i] == letra[j]) {
							contador ++;
						}
						
						if (contador > numMayor) {
							numMayor = contador;
							vocal = letra[i];
						}
					}
				}
			}
		}
							
		return vocal;
	}
}
						
				
		
		
		
		
		
		
	
		
		
		
		
		
		

	
	
	
 	
	


