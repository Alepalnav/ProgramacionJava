package Tema2.Boletin2.Ej1;

import java.util.Scanner;

import Tema2.Boletin2.Ej1.model.Linea;
import Tema2.Boletin2.Ej1.model.Punto;

public class Menu {

	public static final String MENU ="\n1. Mover línea\r\n"
			+ "2. Mostrar línea\r\n"
			+ "3. Salir\n";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el punto x1:");
		double x1 = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca el punto y1:");
		double y1 = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca el punto x2:");
		double x2 = Double.valueOf(sc.nextLine());
		System.out.println("Introduzca el punto y2:");
		double y2 = Double.valueOf(sc.nextLine());
		
		Linea l = new Linea(new Punto(x1,y1),new Punto(x2,y2));
		
		System.out.println(MENU);
		System.out.println("Introduzca una opcion");
		
		int opcion = Integer.valueOf(sc.nextLine());
		
		while(opcion!=3) {
			if(opcion==1) {
				System.out.println("(A-arriba, B-ABajo, I-Izquierda, DDerecha)");
				String mov = sc.nextLine();
				if(mov.equals("A")) {
					System.out.println("Introduce la distancia:");
					double d = Double.valueOf(sc.nextLine());
					l.arriba(d);
				}else if(mov.equals("B")) {
					System.out.println("Introduce la distancia:");
					double d = Double.valueOf(sc.nextLine());
					l.abajo(d);
				}else if(mov.equals("I")) {
					System.out.println("Introduce la distancia:");
					double d = Double.valueOf(sc.nextLine());
					l.izquierda(d);
				}else if(mov.equals("D")) {
					System.out.println("Introduce la distancia:");
					double d = Double.valueOf(sc.nextLine());
					l.derecha(d);
				}
			}else if(opcion==2) {
				System.out.println(l.toString());
			}
			System.out.println(MENU);
			System.out.println("Introduzca una opcion");
			
			opcion = Integer.valueOf(sc.nextLine());
		}

	}

}
