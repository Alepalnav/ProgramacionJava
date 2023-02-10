package Boletin3;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println(reemplazarPalabra("hola buenas tardes","buenas","malas"));

	}
	
	public static String reemplazarPalabra(String frase, String palabra1, String palabra2) {
		
		StringBuilder fraseNueva = new StringBuilder(); //creamos frase nueva a la que le vamos a ir añadiendo el resultado
		String palabra = "";  //palabra sera el string que vamos a sustituir
		
		for(int c = 0; c<frase.length()-palabra1.length();c++) {  // -palabra1.length se hace para que no de un out of range
			palabra = frase.substring(c,c+palabra1.length());  //aqui ira cogiendo partes de la cadena con la misma longitud que la palabra
			if (palabra.equals(palabra1)) {					// cuando sea igual que la palabra que vamos a sustituir entra en el if
				fraseNueva.append(frase.substring(0,c));	// de este modo le añadiremos al resultado todo lo que hay antes de la palabra que vamos a sustituir
				fraseNueva.append(palabra2);				// aqui le añadimos la palabra nueva
				fraseNueva.append(frase.substring(c+palabra1.length(), frase.length()));	//aqui añadimos lo que queda de frase poniendo el limite inferior despues de la palabra antigua
			}	
		}
		
		return fraseNueva.toString();		// pasamos a string ya que el metodo nos decia que devolvieramos en string
	}

}
