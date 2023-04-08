package POO_avanzada.Actividad1;

import java.time.LocalDate;
import java.util.Scanner;

import POO_avanzada.Actividad1.model.Genero;
import POO_avanzada.Actividad1.model.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Genero genero = null;
		String nombre = "";
		String ap1 = "";
		String ap2 = "";
		double peso = 0.0;
		double altura = 0.0;
		LocalDate fechaNacimiento=null;
	
		do {
			try {
				System.out.println("Introduzca un género válido (MASCULINO|FEMENINO): ");
				genero = Genero.valueOf(sc.nextLine());
			}catch(Exception e) {
				System.out.println("Dato erróneo. ");
				e.getStackTrace();
			}
		}while(genero==null);

		do {
			try {
				System.out.println("Introduzca nombre:");
				nombre = String.valueOf(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(nombre==null);
		
		
		do {
			try {
				System.out.println("Introduzca ap1:");
				ap1 = String.valueOf(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(ap1==null);
		
		do {
			try {
				System.out.println("Introduzca ap2:");
				ap2 = String.valueOf(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(ap2==null);
		
		do {
			try {
				System.out.println("Introduzca peso:");
				peso = Double.valueOf(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(peso<=0);
		
		do {
			try {
				System.out.println("Introduzca altura:");
				altura = Double.valueOf(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(altura<=0);
		
		do { 
			try {
				System.out.println("Introduzca fecha:");
				fechaNacimiento = LocalDate.parse(sc.nextLine());
			}catch(Exception e){
				System.out.println("Dato erróneo");
				e.getStackTrace();
			}
		}while(fechaNacimiento==null);
		
		Persona persona = new Persona(genero,nombre,ap1,ap2, peso, altura,fechaNacimiento);
		System.out.println(persona.toString());
	}

}
