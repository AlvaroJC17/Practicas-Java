package ejercicosMouredev;


import java.util.Scanner;

public class NumeroDeArmstrong {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int number1 = 0;
	char[] digitos;
	int expo = 0, suma = 0, number2 = 0;
	
	
			System.out.println("Ingrese un numero Entero");
			number1 = sc.nextInt();
			
			        String number = String.valueOf(number1);
		
			        digitos = number.toCharArray();
		
			        for(int i = 0; i < digitos.length; i++) {
			        	
			        	number2 = Integer.parseInt(String.valueOf(digitos[i]));
			        	expo = (int) Math.pow(number2, digitos.length);
			        	suma = suma + expo;
			        	}
			           
			        if (number1 == suma) {
			        	System.out.println("El numero " + number1 + " es un numero de Armstrong");
			        	
			        }else {
			        	System.out.println("El numero " + number1 + " no es un numero de Armstrong");
			        	
			        }
			        sc.close();
	}
	
}

			
			        	
			            
			      
			           
			          
			          
			            
			            
		
	     
	        
