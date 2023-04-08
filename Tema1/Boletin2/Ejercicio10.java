package Boletin2;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(gcd(1220,516));

	}
	
	public static int gcd(int n1,int n2) {
		int resultado = 0;
		int resto;
		
		if (n1%n2==0) {
			resultado = n1/n2;
		}else {
			resto = n1%n2;
			for (;resto>0;) {
				n1 = n2;
				n2 = resto;
				resto = n1%n2;
				resultado = n2;
			}
		}return resultado;
	}

}
