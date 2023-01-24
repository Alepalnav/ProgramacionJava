package Boletin2;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(contraseniaFuerte("ALe211.233"));

	}
	
	public static String contraseniaFuerte(String contrasenia) {
		if ((contrasenia.length() >= 8) && (esMayuscula(contrasenia)==true)
				&& (esMinuscula(contrasenia)==true)&&(esSigno(contrasenia))&& (esDigito(contrasenia))) {
			System.out.println("valido");
		}else {
			System.out.println("no valido");
		}
		
		String mensaje = "";
		return mensaje;
	}
	
	public static Boolean esMayuscula (String contrasenia) {
		boolean val = false;
		for(int n = 0; n < contrasenia.length();n ++ ) {
			char letra = contrasenia.charAt(n);
			String letra1 = String.valueOf(letra);
			if (letra1==letra1.toUpperCase()) {
				val = true;
			}
		}
		return val;
	}
	
	public static Boolean esMinuscula (String contrasenia) {
		boolean val = false;
		for(int n = 0; n < contrasenia.length();n ++ ) {
			char letra = contrasenia.charAt(n);
			String letra1 = String.valueOf(letra);
			if (letra1==letra1.toLowerCase()) {
				val = true;
			}
		}
		return val;
	} 
	
	public static Boolean esSigno (String contrasenia) {
		boolean val = false;
		for(int n = 0; n < contrasenia.length();n ++ ) {
			char letra = contrasenia.charAt(n);
			if (letra==','||letra=='.'||letra==';'||letra==':'||letra=='"') {
				val = true;
			}
		}
		return val;
	} 
	
	public static Boolean esDigito (String contrasenia) {
		boolean val = false;
		for(int n = 0; n < contrasenia.length();n ++ ) {
			char letra = contrasenia.charAt(n);
			if (Character.isDigit(letra)) {
				val = true;
			}
		}
		return val;
	} 
	

}
