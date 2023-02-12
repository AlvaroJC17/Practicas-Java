package ejercicosMouredev;

import java.util.Scanner;

public class ConversorTiempo {

	public static void main(String[] args) {
		
		
							/*
							 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
							 * y retorne su resultado en milisegundos.
							 */
		
		Scanner sc = new Scanner(System.in);
		
		int dias = 0, horas = 0, minutos = 0, segundos = 0, ResultadoMili = 0;
		
		System.out.print("Ingrese los dias: ");
		dias = sc.nextInt();
		
		System.out.print("Ingrese Horas: ");
		horas = sc.nextInt();
		
		System.out.print("Ingrese Minutos: ");
		minutos = sc.nextInt();
		
		System.out.print("Ingrese segundos: ");
		segundos = sc.nextInt();
		
		
		
		ResultadoMili = milisegundos(dias, horas, minutos, segundos);
		
		System.out.println("El resultado en milisegundos es: " + ResultadoMili + " ms");
		
		
		
		
		
		
		sc.close();

	}

	public static int milisegundos(int diasMili, int horasMili, int minutosMili, int segundosMili) {
		return ((diasMili * 86400000) + (horasMili * 3600000) + (minutosMili * 60000) + (segundosMili * 1000));
				
	}
}
