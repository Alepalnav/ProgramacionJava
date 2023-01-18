package Boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String hora = "00:00:00";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una hora en formato(00:00:00): ");
		hora = String.valueOf(sc.nextLine());
		String[] horas = hora.split(":");
		Integer hora1 = Integer.valueOf(horas[0]);
		
		if (6<hora1&&hora1<12) {
			System.out.println("Buenos dias");
		}else if (13<hora1&&hora1<20) {
			System.out.println("Buenas tardes");
		}else {
			System.out.println("Buenas noches");
		}
		
	}

}
