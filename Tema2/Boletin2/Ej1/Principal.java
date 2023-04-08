package Tema2.Boletin2.Ej1;

import Tema2.Boletin2.Ej1.model.Linea;
import Tema2.Boletin2.Ej1.model.Punto;

public class Principal {

	public static void main(String[] args) {
		
		Punto p = new Punto(5,4);
		Punto a = new Punto(3,3);
		
		Linea l = new Linea(p,a);
		
		System.out.println(l);
		

	}

}
