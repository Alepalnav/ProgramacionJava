package Boletin2;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(numeroSolucionesEcuacionSegundoGrado(3.0,5.0,8.0));

	}
	
	public static double numeroSolucionesEcuacionSegundoGrado(double a, double b, double c) {
		double solucion1;
		solucion1 = 0;
		if (a == 0) {
			solucion1 = -1;
		}
		return solucion1;
	}

}
