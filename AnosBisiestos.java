package ejercicosMouredev;

import java.util.Scanner;

public class AnosBisiestos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano = 0;
		
		
		
		System.out.print("Introducir un ano bisiesto:");
		ano = sc.nextInt();
		
		
		System.out.println("Los proximos anos bisiestos seran...");
		
		for (int i = 0; i < 30; i++) {
			
			if (ano % 4 ==0) {
				
			ano = ano + 4;
			System.out.println(ano);
			}else {
				System.out.println(ano + " No es un ano bisiesto");
				break;
			}
		}
		sc.close();
		
	}
	
}
		
		
		
		
