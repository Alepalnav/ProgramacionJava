package Boletin1;

public class Ejercicio7 {

	public static void main(String[] args) {
		//int numero = 0;
		//a)
		//i)
		
		for(int numero=1 ;numero<=100; ) {
			System.out.println(numero);
			numero++;
		}
		
		//ii)
		while(numero<=100) {
			System.out.println(numero);
			numero++;
		}
		//iii)
		do {
			System.out.println(numero);
			numero++;
		}while (numero<=100);
		
		
		//b)
		//i)
		
		int numero = 100;
		for ( ;numero>0; ) {
			System.out.println(numero);
			numero--;
		}
		
		//ii)
		while (numero>0) {
			System.out.println(numero);
			numero--;
		}
		//iii)
		do {
			System.out.println(numero);
			numero--;
		}while (numero>0);
		
		
		//c)
		//i)
		
		for (int numero=0;numero<=100;numero+=5) {
			System.out.println(numero);
		}
		
		//ii)
		int numero = 0;
		while (numero<=100) {
			System.out.println(numero);
			numero+=5;
		}
		
		//iii)
		int numero = 0;
		do {
			System.out.println(numero);
			numero+=5;
			
		}while (numero<=100);
		
		//d)
		//i)
		
		for(int numero=320;numero>=160;numero-=20) {
			System.out.println(numero);
		}
		//ii)
		int numero = 320;
		while(numero>=160) {
			System.out.println(numero);
			numero-=20;
		}
		//iii)

		int numero=320;
		do {
			System.out.println(numero);
			numero-=20;
		}while (numero>=160);
	}

}
