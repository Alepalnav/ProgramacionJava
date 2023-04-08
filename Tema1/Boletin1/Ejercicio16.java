package Boletin1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int salario = 0;
		System.out.println("Salario: ");
		salario = Integer.valueOf(sc.nextLine());
		int contador = 0;
		int suma = 0;
		int mayores = 0;
		
		while (contador<10) {
			if (salario>1000) {
				mayores++;
			}
			suma += salario;
			System.out.println("Salario: ");
			salario = Integer.valueOf(sc.nextLine());
			contador++;
		}
		System.out.println(suma+" es el total.");
		System.out.println(mayores+" mayores a 1000.");
	}

}
