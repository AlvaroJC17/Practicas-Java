package ejercicosMouredev;

import java.util.Arrays;
import java.util.Scanner;

public class ElSegundoMayor {

	public static void main(String[] args) {
		
						/*
						 * Dado un listado de números, encuentra el SEGUNDO más grande.
						 */
					
Scanner sc = new Scanner(System.in);
		
		int [] numeros;
		int cantidadNumeros = 0;
		
		
		
		System.out.print("Ingrese la cantidad de numeros a evaluar: ");
		cantidadNumeros = sc.nextInt();
		
		numeros = new int [cantidadNumeros];
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Ingrese un numero: ");
			numeros[i] = sc.nextInt();
			
		}
		
		System.out.println("Los numeros ingresados son " + Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		
		Arrays.toString(numeros);
		
		System.out.println("El segundo mayor numero es " + numeros[numeros.length-2]);
		
		sc.close();
		
	}
	
}
		
		
		
