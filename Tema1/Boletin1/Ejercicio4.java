package Boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Float nota1 = 0.0f;
		Float nota2 = 0.0f;
		Float nota3 = 0.0f;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("nota1: ");
		System.out.println("nota2: ");
		System.out.println("nota3: ");
		
		nota1 = Float.valueOf(sc.nextLine());
		nota2 = Float.valueOf(sc.nextLine());
		nota3 = Float.valueOf(sc.nextLine());
		
		float notaFinal = (float)((nota1 * 0.1)+(nota2 * 0.5)+ (nota3 * 0.4));
		
		if ((0<=nota1&&nota1<=10)&&(0<=nota2&&nota2<=10)&&(0<=nota3&&nota3<=10)) {
			if (0<notaFinal&&notaFinal<5) {
				System.out.println("Insuficiente");
			}else if (5<=notaFinal&&notaFinal<6) {
				System.out.println("Suficiente");
			}else if (6<=notaFinal&&notaFinal<7) {
				System.out.println("Bien");
			}else if (7<=notaFinal&& notaFinal<9) {
				System.out.println("Notable");
			}else {
				System.out.println("Sobresaliente");
			}
		}else {
			throw new IllegalArgumentException("Valor no válido " );
		}
		
	}

}
