package ejercicosMouredev;

public class Fibonacci {

	public static void main(String[] args) {
														
														/*Escribe un programa que imprima los 50 primeros números de la sucesión
														 * de Fibonacci empezando en 0.
														 * - La serie Fibonacci se compone por una sucesión de números en
														 *   la que el siguiente siempre es la suma de los dos anteriores.
														 *   0, 1, 1, 2, 3, 5, 8, 13...*/
		
		long a = 0, b = 1, c = 0;
		
		
		for (int i = 0; i <=50; i++) {
			
			System.out.println((long)a);
			c = a + b;
			a = b;
			b = c;
			
		}
				
				
				
			
			
		
	}
	
}
			
				
			
				
			
			
		
		

