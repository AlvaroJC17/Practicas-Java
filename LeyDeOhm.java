package ejercicosMouredev;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LeyDeOhm {

	public static void main(String[] args) {
		
		/*
		 * Enunciado: Crea una función que calcule el valor del parámetro perdido
		 * correspondiente a la ley de Ohm.
		 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
		 *   el valor del tercero (redondeado a 2 decimales).
		 * - Si los parámetros son incorrectos o insuficientes, la función retornará
		 *   la cadena de texto "Invalid values".
		 */
		
		double voltaje = 0, corriente = 0, resistencia = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un valor de Voltaje");
		voltaje = sc.nextDouble();
		
		System.out.println("Ingrese un valor de Corriente");
		corriente = sc.nextDouble();
		
		System.out.println("Ingrese un valor de resistencia");
		resistencia = sc.nextDouble();
		
		if (leyDeOhm(voltaje, corriente, resistencia) != 0) { // imprime la funcion leydeohm
			
		}else
			System.out.println("Invalid Values");
			
		
		
		sc.close();
		
	
	}
		
	public static double leyDeOhm(double voltaje, double corriente, double resistencia) {
		
		DecimalFormat formato1 = new DecimalFormat("0.00");
		
		if (voltaje == 0 && corriente != 0 && resistencia != 0) {
			
			voltaje = corriente * resistencia;
			System.out.println("El valor del voltaje es V = " + formato1.format(voltaje));
			return voltaje;
			
			
		} else if(corriente == 0 && voltaje != 0 && resistencia != 0 ) {
			corriente = voltaje / resistencia;
			System.out.println("El valor de la corriente es I = " + formato1.format(corriente));
			return corriente;
			
			
		}else if (resistencia == 0 && voltaje != 0 && corriente != 0) {
			resistencia = voltaje / corriente;
			System.out.println("El valor de la resistencia es R = " + formato1.format(resistencia));
			return resistencia;
			
			
		}else 
			
			return 0;
		
		
	}
}
		
		

	
		
				
		

