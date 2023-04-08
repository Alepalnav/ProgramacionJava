package Tema2.Boletin1.Ej1;

import java.util.Scanner;

import Tema2.Boletin1.Ej1.model.Rectangulo;

public class Menu {

	public static void main(String[] args) {
		Rectangulo rectangulo;
		Scanner sc = new Scanner(System.in);
		
		int lon = Integer.valueOf(sc.nextLine());
		int anc = Integer.valueOf(sc.nextLine());
		
		rectangulo = new Rectangulo(lon,anc);
		
		System.out.println(rectangulo.area());
		System.out.println(rectangulo.perimetro());
		System.out.println(rectangulo);
	}

}
