package ejercicosMouredev;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElDetectorDeHandles {

	public static void main(String[] args) {
		
		/*
		 * Enunciado: Crea una función que sea capaz de detectar y retornar todos los
		 * handles de un texto usando solamente Expresiones Regulares.
		 * Debes crear una expresión regular para cada caso:
		 * - Handle usuario: Los que comienzan por "@"
		 * - Handle hashtag: Los que comienzan por "#"
		 * - Handle web: Los que comienzan por "www.", "http://", "https://" 
		 *   y finalizan con un dominio (.com, .es...)
		 */
		
	
		
		String texto = "Bienvenido a la web! Aquí hay algunos enlaces útiles que puedes visitar:\r\n"
				+ "\r\n"
				+ "@Elmotordebusqueda más popular.\r\n"
				+ "https://www.youtube.com - Mira videos en línea.\r\n"
				+ "https://www.facebook.com - Conecta con amigos y familiares.\r\n"
				+ "https://www.amazon.com - Compra en línea @productos de todas las categorías.\r\n"
				+ "https://www.wikipedia.org - Enciclopedia en línea libre y colaborativa.\r\n"
				+ "www.instagram.com - Comparte y mira fotos y videos.\r\n"
				+ "https://www.linkedin.com - Red profesional para conectarse con colegas.\r\n"
				+ "https://www.reddit.com - Foro en #linea donde se discuten temas de todo tipo.\r\n"
				+ "https://www.ebay.com - Compra y vende artículos en línea.\r\n"
				+ "https://www.alibaba.com - #Comercio en línea para empresas.\r\n"
				+ "www.apple.com - Compra productos de Apple #en línea.\r\n"
				+ "https://www.microsoft.com - Compra productos de Microsoft en línea.\r\n"
				+ "@Alvarocortesia"
				+"#cortesiaAlvaro.\r\n"
				+ "Espero que estos enlaces te sean útiles. ¡Buena navegación!";
		
		
	handle(texto);
		
		
	}
		
public static String handle(String texto) {
	
	Pattern pat1 = Pattern.compile("@\\w+(?:\\s+@\\w+)*"); //palabras que empiecen con @
	Matcher mat1 = pat1.matcher(texto);                                                                           
	Pattern pat2 = Pattern.compile("#\\w+(?:\\s+#\\w+)*"); //palabras que empiecen con #
	Matcher mat2 = pat2.matcher(texto);                                                                           
	Pattern pat3 = Pattern.compile("www\\.\\w+\\.[a-z]{3}(?:\\s|$)|https?://\\w+\\.[a-z]{3}(?:\\s|$)|https?://www\\.\\w+\\.[a-z]{3}(?:\\s|$)"); //palabras que empiecen con www, http:// o https:// y terminen en .com, .es, org etc
	Matcher mat3 = pat3.matcher(texto);                                                                           
	
	while (mat1.find()) {
		System.out.println("Handles de @ encontardos: " + mat1.group());
		
	}
	while (mat2.find()) {
		System.out.println("Handles de # encontrados: " + mat2.group());
		
	}
	 while(mat3.find()) {
		System.out.println("Handles web encontrados:  " + mat3.group());
	}
		
	return mat3.group();
		
}		
		
}	
		
		


	
		
	

	
	
	
	

	
	
	
	

