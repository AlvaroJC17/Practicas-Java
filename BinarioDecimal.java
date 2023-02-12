package ejercicosMouredev;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinarioDecimal {

	public static void main(String[] args) {

									/*
									 * Enunciado: Crea un programa se encargue de transformar un número binario
									 * a decimal sin utilizar funciones propias del lenguaje que 
									 * lo hagan directamente.
									 */
									
		Scanner sc = new Scanner(System.in);
		
		String decimal;
		Pattern patron = Pattern.compile("^[0-1]+$");
		boolean validacion = false;
		
		do {
			
			System.out.print("Ingrese un numero binario a convertir: ");
			decimal = sc.nextLine();
			System.out.println();
			
			Matcher val = patron.matcher(decimal);
			if (val.find()) {
				validacion = true;
			}else
				System.err.println("Solo se pueden ingresar 0 y 1... Intente nuevamente");
				System.out.println();
				System.out.println();
			
		} while (!validacion);

		System.out.println("La converion de binario a decimal quedaria: " + binarioDecimal(decimal));
		
		sc.close();
	}
				
				
				
				
	
	
	
				
				
	/*
	 * @param Convierte de binario a decimal
	 */
	static public int binarioDecimal(String decimal) {
		
		String num1 = "", cadenaInvertida;
		String [] cadenaNum;
		char [] arrayNum;
		int [] ArrayEnteros;
		int exp = 0, base = 0, binario = 0;
		
		
		//num = Integer.toString(decimal); // convertir entero a cadena, esta linea la elimine por que usando variable int como entrada se limitaba el programa a max 10 digitos
		
		cadenaInvertida = new StringBuilder(decimal).reverse().toString();
		
		arrayNum = cadenaInvertida.toCharArray(); // pasar la cadena a caracteres indivuduales
		
		for (int i = 0; i < arrayNum.length; i++) { // sumarle a cada caracter de la cadena un / para despues splitear
			num1 = num1 + arrayNum[i] + "/"; // se crea el string NUM1 con los caracteres del array CHAR y le agrego "/" a cada caracter
		}
		
		cadenaNum = num1.split("/"); //se pasa el String NUM1 a un array String
		
		ArrayEnteros = Arrays.stream(cadenaNum).mapToInt(Integer::parseInt).toArray(); // se pasa el Array STRING a Array INT
		
		for (int i = 0; i < ArrayEnteros.length; i++) { // se le calcula el exponencial a cada numero del Array INT
			exp = 0; // se coloca en cero para que se reinicio en cada ciclo
			exp = (int) (Math.pow(2, i)); // se calcula el valor de cada numero con su exponente
			base = exp * ArrayEnteros[i]; // se multiplica el valor exponencial con numero binario
			binario += base; // se suman los totales para obtener el numero decimal.
		}
		
		return binario;
	}

}
