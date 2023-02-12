package ejercicosMouredev;


import java.util.Scanner;

public class CuadradoYTriangulo2D {

	public static void main(String[] args) {
		
										/* Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
								 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
								 * - EXTRA: ¿Eres capaz de dibujar más figuras? */
		
		int tamano = 0, opcion = 0;
		String aste = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el tamamo de la figura, el numero debe ser mayor a 1:");
		tamano = sc.nextInt();
		
		System.out.println();
		
		if(tamano > 1) {
			
							System.out.println("Ingrese la figura a mostrar \n 1) Cuadrado \n 2) Triangulo \n 3) Poligono");
							opcion = sc.nextInt();
							
									if(opcion == 1) { // CUADRADO
										for (int i = 1; i <= tamano; i++) {
											aste = aste + "*";
										}
										for (int i = 1; i <= tamano; i++) {
											System.out.println(aste);
										}
										
									}else if(opcion == 2) { // TRIANGULO
										
										for (int i = 1; i <= tamano; i++) {
											aste = aste + "*";
											System.out.println(aste);
										}
									
										
									}else if(opcion == 3) { // POLIGONO
										
										for (int i = 1; i <= tamano; i++) {
											aste = aste + "*";
											System.out.println(aste);
										}
										for (int i = tamano - 1; i >= 0; i--) {
											aste = " " + aste.substring(0, aste.length()-1); // EN CADA ITERACION VOY SUMANDO UN ESPACIO EN BLANCO MIENTRAS ELIMINO EL ULTIMO CARACTER
											System.out.println(aste);
										}
										
						
									}else {
									System.err.println("Solo se pueden elegir como opcion 1, 2 o 3");
									}
		}else {
			System.err.println("El numero es menor a 1");
		}
						
		sc.close();
		
	}
	
}
		
							
		
										
									
									
			
			
		
		

	
		
		
		
