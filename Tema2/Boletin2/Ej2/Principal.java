package Tema2.Boletin2.Ej2;

import java.util.Scanner;

import Tema2.Boletin2.Ej2.model.Producto;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Producto p = new Producto("mochila",23.8);
		Producto p2 = new Producto("mochila2",13.8);
		
		System.out.println(p.getPrecio());
		System.out.println(p.PrecioIva());
		System.out.println(p.toString());
		System.out.println(p2.toString());

	}

}
