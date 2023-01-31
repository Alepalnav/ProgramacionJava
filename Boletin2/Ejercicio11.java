package Boletin2;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		System.out.println(minimoComunMultiplo(24,36));

	}
	
	public static int minimoComunMultiplo(int n1, int n2) {
		
		int mcd = Ejercicio10.gcd(n1, n2);
		int resultado = (n1*n2)/mcd;
		
		return resultado;
		
	}

}
