package colecciones.mockExam;

import java.time.LocalDate;

public class Principal {


	public static void main(String[] args) throws CombinacionException {
		
		Historial tmp = new Historial();
		
		Combinacion uno;
		Combinacion dos;
		
		uno = new Combinacion(1,2,3,4,5,6,7);
		dos = new Combinacion(1,2,41,4,5,6,8);

		tmp.addSorteo(LocalDate.now(), uno);
		tmp.addSorteo(LocalDate.now().plusDays(1), dos);
		System.out.println(uno.comprobarCombinacion(dos));
			
		System.out.println(tmp.listarSorteosDesdeFecha(LocalDate.now()));
			
		System.out.println(tmp.comprobarAciertos(LocalDate.now(), dos));
		
	}

}
