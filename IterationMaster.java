package ejercicosMouredev;

public class IterationMaster {

	public static void main(String[] args) {
		
		
							/*
							 * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
							 * ¿De cuántas maneras eres capaz de hacerlo?
							 * Crea el código para cada una de ellas.
							 */
		
		System.out.println("Metodo FOR");

						for (int i = 1; i <= 100; i++) {
							System.out.println(i);
						}
		
		System.out.println();
		System.out.println("Metodo WHILE");
		
						int num = 0;
						while (num  < 100) {
							num ++;
							System.out.println(num);
						}	
						
		System.out.println();
		System.out.println("Metodo DO WHILE");
		
						int num1 = 0;
						do {
							num1++;
							System.out.println(num1);
						} while (num1  < 100);
		
		System.out.println();
		System.out.println("Metodo IF");
	
						int num2 = 0;
						do {
						if (num2 >= 0 && num2 < 100 ) {
							num2++;
							System.out.println(num2);
						}
						}while (num2  < 100);
		
	}
}
						
						
		
			
	
			
			
		
		
	


