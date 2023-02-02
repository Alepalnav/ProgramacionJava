package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(parImparFor("fdfdfdfd","impar"));
		System.out.println(parImparWhile("fdfdfdfd","par"));
		System.out.println(parImparDoWhile("fdfdfdfd","par"));

	}
	
	public static String parImparFor(String texto, String bandera) {
		int i = 0;
		String resultado = "";
		
		if (bandera=="par") {
			for (;i<texto.length();i+=2) {
				resultado += texto.charAt(i);
			}
		}else if(bandera=="impar"){
			i = 1;
			for (;i<texto.length();i+=2) {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}
	
	public static String parImparWhile(String texto, String bandera) {
		
		int i = 0;
		String resultado = "";
		
		if (bandera=="par") {
			while (i<texto.length()) {
				resultado += texto.charAt(i);
				i+=2;
			}	
		}else if (bandera=="impar") {
			i = 1;
			while (i<texto.length()) {
				resultado += texto.charAt(i);
				i+=2;
			}
		}
		return resultado;
	}
public static String parImparDoWhile(String texto, String bandera) {
		
		int i = 0;
		String resultado = "";
		
		if (bandera=="par") {
			do {
				resultado += texto.charAt(i);
				i+=2;
			}while(i<texto.length());
		}else if (bandera=="impar") {
			i = 1;
			do {
				resultado += texto.charAt(i);
				i+=2;
			}while(i<texto.length());
		}
		return resultado;
	}
	
}