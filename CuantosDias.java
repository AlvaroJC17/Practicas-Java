package ejercicosMouredev;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuantosDias {

	public static void main(String[] args) {
		
		
		/*
		 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
		 * de texto que representen fechas.
		 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
		 * - La función recibirá dos String y retornará un Int.
		 * - La diferencia en días será absoluta (no importa el orden de las fechas).
		 * - Si una de las dos cadenas de texto no representa una fecha correcta se
		 *   lanzará una excepción.
		 */
		
		Scanner sc = new Scanner(System.in);
		String fecha1, fecha2;
		boolean validacion = false, validacion2 = false;
		Pattern patron = Pattern.compile("^((0[1-9]|[12][0-9]|3[0-1])/(1[0-2]|0[1-9])/([0-9]{4}))$");
		
		do { // validar la primera fecha
			System.out.println("Ingrese la primera Fecha en formato Dia/Mes/Año..");
			fecha1 = sc.nextLine();
			Matcher comparar1 = patron.matcher(fecha1);
			
			if (comparar1.matches()) {
				validacion = true;
			}else
				System.err.println("Formato de fecha incorrecto... intente de nuevo");
		} while (!validacion);
		
		
		
		do { // validar la segunda fecha
			System.out.println("Ingrese la segunda fecha en formato Dia/Mes/Año..");
			fecha2 = sc.nextLine();
			Matcher comparar2 = patron.matcher(fecha2);
			
			if (comparar2.matches()) {
				validacion2 = true;
			}else
				System.err.println("Formato de fecha incorrecto... Intente nuevamente");
		} while (!validacion2);
		
		System.out.println("Hay una diferencia de " + entreFechas(fecha1, fecha2) + " dias entre las fechas" );
			
		sc.close();
	}
		
	/**
	 * Calcula los dias entre dos fechas;
	 * @param fecha1
	 * @param fecha2
	 * @return
	 */
	
public static int entreFechas(String fecha1, String fecha2) {
	
	int date1 = 0, date2 = 0, date3 = 0, date4 = 0, date5 = 0, date6 = 0;
		
	String [] fechaDividida1;
	String [] fechaDividida2;
	fechaDividida1 = fecha1.split("/");
	fechaDividida2 = fecha2.split("/");
	int min1 = 0, min2 = 0, min3 = 0, min4 = 0, min5 = 0, min6 = 0, dias1 = 0;
	
		
		date1 = Integer.valueOf(fechaDividida1[0]);
		date2 = Integer.valueOf(fechaDividida1[1]);
		date3 = Integer.valueOf(fechaDividida1[2]);
		
		date4 = Integer.valueOf(fechaDividida2[0]);
		date5 = Integer.valueOf(fechaDividida2[1]);
		date6 = Integer.valueOf(fechaDividida2[2]);
		
		min1 = (date1*24)*60; // dias a minutos
		min2 = (date2 * 43800); // meses a minutos
		min3 = (date3 * 525600); // años a minutos
		
		min4 = (date4*24)*60; // dias a minutos
		min5 = (date5 * 43800); // meses a minutos
		min6 = (date6 * 525600); // años a minutos
		
		dias1 = (((min1 + min2 + min3) - (min4 + min5 + min6))/60)/24;
		
		
		if(dias1 < 0) {
			
			return -dias1;
		}else
			return dias1;		
}
}
			
	
	
		
	
