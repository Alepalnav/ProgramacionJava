package Boletin2;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(esMultiplo(8,3));

	}
	
	public static boolean esMultiplo(int n1,int n2) {
		boolean validacion = false;
		if (n1%n2==0) {
			validacion = true;
		}
		return validacion;
	}

}
