package Boletin2;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(toBinary(28));

	}
	
	public static String toBinary (int dec) {
		String bin = "";

		int numero =0;
		int div = dec;
		for (int i = 0; div>=1; i++) {
			numero += div%2;
			div = div/2;
			String numCad = String.valueOf(numero);
			bin += numCad;
			numero = 0;
		}
		String salida = "";
		
		for (int c = bin.length()-1;c>=0; c-- ) {
			salida += bin.charAt(c);
		}
		return salida;
	}

}
