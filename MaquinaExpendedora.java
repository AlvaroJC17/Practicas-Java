package ejercicosMouredev;

import java.util.Arrays;
import java.util.Scanner;

public class MaquinaExpendedora {

	public static void main(String[] args) {
		

Scanner sc = new Scanner(System.in);
		
		int[] monedas = null;
		String [] vuelto = null;
		int opcion = 0, total = 0,vuelto2 = 0;
		int tamano = 0;
		
		
		
		System.out.println("Productos disponobles: \n 1)Cocacola $15 \n 2)Pepsicola $50 \n 3)Doritos $300");
			
		System.out.print("Eliga el numero del producto que desea comprar: ");
		opcion = sc.nextInt();
		
		if (opcion == 1 || opcion == 2 || opcion == 3) {
			
		
		System.out.print("La maquina solo aceptas monedas de 5, 10, 50, 100, 200. Ingrese la cantidad de monedas a ingresar:");
		tamano = sc.nextInt();
		
		monedas = new int[tamano];
		
		for (int i = 0; i < monedas.length; i++) {
			System.out.print("ingrese el valor de la moneda: ");
			monedas[i] = sc.nextInt();
		}
		for (int i = 0; i < monedas.length; i++) {
			if (monedas[i] == 5 || monedas[i] == 10 || monedas[i] == 50 || monedas[i] == 100 || monedas[i] == 200) {
				
				total += monedas[i];
			}else {
				System.err.println("Solo se pueden agregar monedas de 5, 10, 50, 100, 200");
				total = 0;
				break;
			}
			
		}
		}else {
			System.out.println("La opcion seleccionada no existe...");
		}
		
		
		
		
		if(opcion == 1) {
			if (total == 15) {
				vuelto2 = total - 15;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su elecion fue Cocacola y su vuelto es " + Arrays.toString(vuelto) );
			}else if(total > 15) {
				vuelto2 = total - 15;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su eleccion fue Cocacola y su vuelto es " + Arrays.toString(vuelto));
			}else if(total < 15 && total != 0) {
				System.out.println("El dinero ingresado " + Arrays.toString(monedas) + "no es suficiente");
			}	
		}else if (opcion == 2) {
			
			if (total == 50) {
				vuelto2 = total - 50;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su elecion fue Pepsicola y su vuelto es " + Arrays.toString(vuelto) );
			}else if(total > 50) {
				vuelto2 = total - 50;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su eleccion fue Pepsicola y su vuelto es " + Arrays.toString(vuelto));
			}else if(total < 50 && total != 0) {
				System.out.println("El dinero ingresado " + Arrays.toString(monedas) + "no es suficiente" );
			}	
		}else if(opcion == 3) {
			
			if (total == 300) {
				vuelto2 = total - 300;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su elecion fue Doritos y su vuelto es " + Arrays.toString(vuelto) );
			}else if(total > 300) {
				vuelto2 = total - 300;
				String str = String.valueOf(vuelto2);
				vuelto = str.split(" ");
				System.out.println("Su eleccion fue Doritos y su vuelto es " + Arrays.toString(vuelto));
			}else if(total < 300 && total != 0) {
				System.out.println("El dinero ingresado " + Arrays.toString(monedas) + " no es suficiente");
			}	
			
		}
		
		sc.close();
	}

}
