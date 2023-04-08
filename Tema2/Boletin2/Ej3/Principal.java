package Tema2.Boletin2.Ej3;

import Tema2.Boletin2.Ej3.model.Jarra;

public class Principal {

	public static void main(String[] args) {
		
		Jarra j1 = new Jarra(5,4);
		Jarra j2 = new Jarra(3,0);
		
		System.out.println(j1.volcarContenido(j2));
		System.out.println(j1.toString());
		
	}

}
