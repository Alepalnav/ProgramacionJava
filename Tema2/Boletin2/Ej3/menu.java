package Tema2.Boletin2.Ej3;

import java.util.Scanner;

import Tema2.Boletin2.Ej3.model.Jarra;

public class menu {
	
	public static final String MENU = "1. Llenar jarra:\r\n"
			+ "2. Vaciar jarra:\r\n"
			+ "3. Volcar jarra A en B .\r\n"
			+ "4. Volcar jarra B en A.\r\n"
			+ "5. Ver estado de las jarras:\r\n"
			+ "6. Salir:";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Capacidad Jarra 1: ");
		double cap1 = Double.valueOf(sc.nextLine());
		System.out.println("Cantidad Jarra 1: ");
		double cant1 = Double.valueOf(sc.nextLine());
		System.out.println("Capacidad Jarra 2: ");
		double cap2 = Double.valueOf(sc.nextLine());
		System.out.println("Cantidad Jarra 2: ");
		double cant2 = Double.valueOf(sc.nextLine());
		
		Jarra j1 = new Jarra(cap1,cant1);
		Jarra j2 = new Jarra(cap2,cant2);
		
		System.out.println(MENU);
		System.out.println("Elija opción: ");
		int o = Integer.valueOf(sc.nextLine());
		
		while(o!=6) {
			if(o==1) {
				System.out.println("Que jarra desea llenar (A/B)?");
				String o2=sc.nextLine();
				if(o2.equals("A")) {
					j1.llenarJarra();
				}else if(o2.equals("B")) {
					j2.llenarJarra();
				}
			}else if(o==2) {
				System.out.println("Que jarra desea vaciar (A/B)?");
				String o2 = sc.nextLine();
				if(o2.equals("A")) {
					j1.vaciarJarra();
				}else if(o2.equals("B")) {
					j2.vaciarJarra();
				}
			}else if(o==3) {
				j1.volcarContenido(j2);					
			}else if(o==4) {
				j2.volcarContenido(j1);					
			}else if(o==5) {
				System.out.println(j1.toString());
				System.out.println(j2.toString());
			}
			
			System.out.println(MENU);
			System.out.println("Elija opción: ");
			o = Integer.valueOf(sc.nextLine());
			
		}
		
		
		
		
		
	}

}
