package ejercicosMouredev;

import java.util.Arrays;

public class ElementosComunesyNoComunesEntreArrays {

	public static void main(String[] args) {
		
		/*
		 * Crea una función que reciba dos array, un booleano y retorne un array.
		 * - Si el booleano es verdadero buscará y retornará los elementos comunes
		 *   de los dos array.
		 * - Si el booleano es falso buscará y retornará los elementos no comunes
		 *   de los dos array.
		 * 
		 */
		
		
		String [] array1 = {"gris", "blanco", "rojo", "azul", "verde"};
		String [] array2 = {"marron", "celeste", "amarillo", "gris", "rojo"};
		String [] array3;
		
		String palabraComun ="";
		boolean opcion = false, existe = false;
	
		
		
		opcion = true;
		
		
		if (opcion == true) {
			
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i].equals(array2[j])) {
						palabraComun = palabraComun + array1[i] + "/";
					}
				}
			}
			array3  = palabraComun.split("/");
			System.out.println(Arrays.toString(array3)); // DEVUELVE ELEMENTOS COMUNES
						
		}else if (opcion == false) { 
			
			for (int i = 0; i < array1.length; i++) {
				existe = false;
				
				for (int j = 0; j < array2.length; j++) {
					if (array1[i].equals(array2[j])) {
						existe = true;
						break;
					}
				}
				if (existe == false) {
					palabraComun = palabraComun + array1[i] + "/";
				}
			}
			
			for (int i = 0; i < array2.length; i++) {
				existe = false;
				
				for (int j = 0; j < array1.length; j++) {
					if (array2[i].equals(array1[j])) {
						existe = true;
						break;
					}
				}
				if (existe == false) {
					palabraComun = palabraComun + array2[i] + "/";
				}	
			}
			array3  = palabraComun.split("/");
			System.out.println(Arrays.toString(array3)); // DEVUELVE ELEMENTOS NO COMUNES
		}
	}
	
}
						
						
			
			
			
						
					
						
				
					
						
			
			
						
						
			
			
			
		
		
						
			
			
						
			
			
			
			
			

	
		
		
