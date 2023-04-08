package Boletin2;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(toDecimal("11001"));

	}
	
	public static int toDecimal(String binario) {
		int base = 1;
		int total = 0;
		String salida = "";
		for (int i=binario.length()-1;i>=0;i--) {
			salida += binario.charAt(i);
		}
		for (int c=0; c<salida.length();c++) {
			char numerocad = salida.charAt(c);
			if (numerocad=='1') {
				total += base;
			}
			base = base*2;
		}
		return total;
	}

}
