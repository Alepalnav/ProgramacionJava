package Boletin2;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(segundosEntre(6,40,9,6,40,13));

	}
	
	public static int segundosEntre(int hora1,int min1, int seg1, int hora2, int min2, int seg2) {
		int segundos = 0;
		segundos += seg2-seg1;
		segundos += (min2-min1)*60;
		segundos += (hora2-hora1)*60*60;
		if (segundos<0) {
			segundos = segundos*-1;
		}
		return segundos;
	}

}
