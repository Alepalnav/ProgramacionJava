package POO_avanzada.parking.model;

import java.util.Comparator;

public class ComparaMarcaModelo implements Comparator<Vehiculo>{

	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado=0;
		
		if(v1==null&&v2!=null) {
			resultado =-1;
		}else if(v2==null&&v1!=null) {
			resultado = 1;
		}else if(v1==null && v2==null) {
			resultado=0;
		}else {
			resultado=v1.getMarca().compareTo(v2.getMarca())==0? 
					v1.getModelo().compareTo(v2.getModelo()):v1.getMarca().compareTo(v2.getMarca());
		}
		
		return resultado;
	}

}
