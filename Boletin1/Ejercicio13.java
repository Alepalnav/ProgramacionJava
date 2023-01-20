package Boletin1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		numero = Integer.valueOf(sc.nextLine());
		int menor = numero;
		int mayor = numero;
		int contador = 0;
		
		while (contador<10) {
			numero = Integer.valueOf(sc.nextLine());
			if (numero<menor) {
				menor = numero;
			}else if (numero>mayor) {
				mayor = numero;
			}
			contador++;
		}
		System.out.println(mayor);
		System.out.println(menor);
	}
}
