package Boletin2;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println(horaMayor(6,40,12,6,39,13));
		

	}
	
	public static int horaMayor(int hora1,int min1, int seg1, int hora2, int min2, int seg2) {
		/*falta la validacion de los datos */
		if (hora1 > hora2) {
			return 1;
		}else if (hora1 < hora2) {
			return 2;
		}else {
			if (min1>min2) {
				return 1;
			}else if (min1<min2) {
				return 2;
			}else {
				if (seg1>seg2) {
					return 1;
				}else if (seg1<seg2) {
					return 2;
				}else {
					return 0;
				}
			}
		}
	}
}
