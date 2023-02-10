package Boletin3;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println(palabraEscondida("soybahxlna","hola"));

	}
	
	public static boolean palabraEscondida(String cadena, String palabra) {
		
		boolean mensaje = false;
		int contador = 0;
		int c = 0;
		char letra = palabra.charAt(c);
		
		while (c<palabra.length()-1) {
			for (int i = 0; i<cadena.length();i++) {
				char letra1 = cadena.charAt(i);
				if (letra == letra1) {
					contador += 1;
					if (c<palabra.length()-1) {
						c++;
						letra = palabra.charAt(c);
					}
				}if ()
			}		
		}
		if (contador == palabra.length()) {
			mensaje = true;
		}
		
		return mensaje;
	}

}
