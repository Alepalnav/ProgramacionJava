package Boletin3;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println(esPalindromo("somos o no somos"));

	}
	
	public static boolean esPalindromo (String cadena) {
		
		StringBuilder cadena2 = new StringBuilder();
		StringBuilder cadena3 = new StringBuilder();
		
		for (int c = cadena.length()-1; c>0; c--) {
			if (cadena.charAt(c)!= ' ') {
				cadena2.append(cadena.charAt(c));
			}
		}
		
		for (int i = 0; i < cadena.length()-1; i++) {
			if (cadena.charAt(i)!= ' ') {
				cadena3.append(cadena.charAt(i));
			}
		}
		
		if (cadena2.toString().equals(cadena3.toString())) {
			return true;
		}else {
			return false;
		}
		
	}

}
