package Boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
	
	String cadena = "hola";	
	System.out.println(startsWith1("Java","Ja"));
	System.out.println(cadena.contains("ol"));
	
	}
	
	public static boolean startsWith1(String cadena, String letras) {
		char letra1 = '0';
		char letra2 = '0';
		String cadena1 = "";
		String cadena2 = "";

		
		for (int c = 0; c < letras.length();c++) {
			letra1 = cadena.charAt(c);
			cadena1 += letra1; 
		}
		for (int i = 0; i < letras.length();i++) {
			letra2 = letras.charAt(i);
			cadena2 += letra2;
		}
		 if (cadena1.equals(cadena2)) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public static boolean contains(String cadena, String letras) {
		StringBuilder p = new StringBuilder();
		
		for (int c = 0;c < cadena.length();c++) {
			if (cadena.charAt(c)==letras.charAt(0)) {
				for (int i = c; i<letras.length();i++) {
					p.append(cadena.charAt(i));
				}
			}
		}if (p.equals(letras)) {
			return true;
		}else {
			return false;
		}
	}
		
		
		
	

}
