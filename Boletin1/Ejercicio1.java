package Boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n1 = Integer.valueOf(sc.nextLine());
		n2 = Integer.valueOf(sc.nextLine());
		
		System.out.println(n1%n2==0 || n2%n1==0); 
		
	}
}
