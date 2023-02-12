package ejercicosMouredev;


import java.util.Arrays;
import java.util.Scanner;

public class ContandoPalabras {

	public static void main(String[] args) {
		
		
													/*Crea un programa que cuente cuantas veces se repite cada palabra
													 * y que muestre el recuento final de todas ellas.
													 * - Los signos de puntuación no forman parte de la palabra.
													 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
													 * - No se pueden utilizar funciones propias del lenguaje que
													 *   lo resuelvan automáticamente.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String frase = " "; 
		String [] fraseDividida;
		String conteoDeFrases;
		int contador = 0;
		boolean YaLoConto = false;
		
		System.out.println("Ingrese una frase");
		frase = sc.nextLine();
		
		fraseDividida = frase.split(" ");
		
		System.out.println(Arrays.toString(fraseDividida));
		
		for (int i = 0; i < fraseDividida.length; i++) {
			conteoDeFrases = fraseDividida[i];
			contador = 0;
			YaLoConto = false;
			
			
						for (int k = 0; k < i ; k++) {
							if (conteoDeFrases.equalsIgnoreCase(fraseDividida[k])) {  // VERIFICACION PARA QUE LAS PALABRAS REPETIDAS NO PASEN AL CONTADOR, SE COLOCA i PARA QUE SOLO EVALUE DESDE EL VALOR DE I HACIA ATRAS
								YaLoConto = true;
								break;
								
							}
						}
								if (!YaLoConto) {
									for (int j = 0; j < fraseDividida.length; j++) {
										if (fraseDividida[j].equalsIgnoreCase(conteoDeFrases)) { // HACE LA COMPARACION DE LAS PALABRAS PARA SABER CUANTAS VECES SE REPITE
											contador++;
										}
									}
									System.out.println("La palabra " + conteoDeFrases + " se repite " + contador + " veces");
								}
		}
		sc.close();
	}
	
}
						
											

				
				
				
					
					
				
		
		
		
		
