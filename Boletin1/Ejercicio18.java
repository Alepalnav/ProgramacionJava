package Boletin1;

public class Ejercicio18 {

	public static void main(String[] args) {
		System.out.println(calcularAreaCirculo(2));
		System.out.println(calcularLongitudCirculo(2));
		
	}
	
	public static double calcularAreaCirculo(int radio) {
		double area = 3.14 * (radio*radio);
		return area;
	}
	
	public static double calcularLongitudCirculo(int diametro) {
		double longitud = 3.14 * diametro;
		return longitud;
	}

}
