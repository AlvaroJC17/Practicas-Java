package ejercicosMouredev;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
									
											/* Enunciado: Crea una función que transforme grados Celsius en Fahrenheit y viceversa.
							 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°" y su unidad ("C" o "F").
							 * - En caso contrario retornará un error.*/
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0, entero1 = 0, entero2 = 0;
		int total1 = 0, total2 = 0;
		String n1, n2;
		
		System.out.println("Ingrese el tipo de conversion que quiere realizar:" + "\n" + "1) Celsius a Fahrenheit" + "\n" + "2) Fahrenheit a Celsius");
		opcion = sc.nextInt();
		
		
			
			switch (opcion) {
			case 1:
				
				System.out.println();
				System.out.print("Ingrese el valor en Celsius :");
				n1 = sc.nextLine();	
				n1 = sc.nextLine();
				
				if (n1.contains("°C")) {
					n1 = n1.replace("°C", "");
					entero1 = Integer.valueOf(n1);
					//entero1 = entero1(double);
					total1 = (int) ((entero1 * 1.8) + 32);
					System.out.println("El valor en Fahrenheit es: " + total1 + "°F");
					break;
				}else {
					System.err.println("El numero debe tener la unidad correspondiente");
					break;
				}
					
			case 2:
				
				System.out.println();
				System.out.print("Ingrese el valor en Fahrenheit :");
				n2 = sc.nextLine();
				n2 = sc.nextLine();

				
				
				if (n2.contains("°F")) {
					n2 = n2.replace("°F", "");
					entero2 = Integer.valueOf(n2);
					total2 = (int) ((entero2 - 32) * 0.5556);
					System.out.println("El valor en Fahrenheit es: " + total2 + "°C");
					break;
				}else {
					System.err.println("El numero debe tener la unidad correspondiente");	
					break;
					}
				
			default:
				System.err.println("Solo se puede elegir entra la opcion 1 y 2");
				break;
			}
			
			sc.close();
	}
	
}
					
				
					
				
				


		
			
		
		
		
		
		
		
