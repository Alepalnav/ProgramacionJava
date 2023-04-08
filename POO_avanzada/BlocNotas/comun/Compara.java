package POO_avanzada.BlocNotas.comun;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

import POO_avanzada.BlocNotas.notas.Nota;

public class Compara implements Comparator<Nota>{

	public int compare(Nota n1, Nota n2) {
		
		int resultado = 0;
		
		if(n1==null&&n2!=null) {
			resultado=-1;
		}else if (n2==null&&n1!=null) {
			resultado=1;
		}else if(n1==null&&n2==null) {
			resultado=0;
		}else {
			resultado=n1.getTexto().compareTo(n2.getTexto());
		}
		return resultado;
	}

}
