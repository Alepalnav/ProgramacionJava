package colecciones.boletin1.ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		
		Integer[] original = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(original));
		reverse(original);
		System.out.println(Arrays.toString(reverse(original)));

	}
	
	public static <T> T[] reverse (T[]original){
		
		T[] inversa = original.clone();
		int o = 0;
		for(int i = original.length-1;i>=0;i--) {
			inversa[o]=original[i];
			o++;
		}
		
		return inversa;
		
	}

}
