package Boletin3;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		System.out.println(cifradoCesar('a',50));
		System.out.println(cifradoCesar("hola", 50));
		System.out.println(equivalenciaCifradoCesar("hola","jqnc"));
		
	}
	
	public static String cifradoCesar(char letra, int des) {
		
		String resultado = "";
		String abecedario = "abcdefghijklmnñopqrstuvwxyz".toUpperCase();
		
		for(int i=0;i<abecedario.length();i++) {
			if (abecedario.charAt(i)==Character.toUpperCase(letra)) {
				resultado += (abecedario.charAt((i+des)%abecedario.length()));
			}
		}
		return resultado;
	}
	

	public static String cifradoCesar(String palabra, int des) {
		
		String resultado = "";
		
		for(int c = 0;c<palabra.length();c++) {
			resultado += cifradoCesar(palabra.charAt(c),des);
		}
		
		return resultado;
	}
	
	public static int equivalenciaCifradoCesar(String palabra1, String palabra2) {
		
		int desplazamiento = 1;
		boolean equivalentes = false;
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		
		while(!equivalentes && desplazamiento<=abecedario.length()) {
			if (cifradoCesar(palabra1, desplazamiento).equalsIgnoreCase(palabra2)) {
				equivalentes = true;
			}
			desplazamiento++;
		}		
		return equivalentes? desplazamiento-1: -1;
	}
	
}

