package POO_avanzada.parking.model;

import java.util.Arrays;

public class Parking {

	
	Vehiculo[] vehiculos;
	
	
	public Parking() {
		this.vehiculos= new Vehiculo[50];
		
	}
	
	public boolean añadirVehiculo(Vehiculo vehiculo) throws Exception {
		boolean añadido=false;
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i]==null && !añadido) {
				vehiculos[i]=vehiculo;
				añadido=true;
			}
		}
		
		if(!añadido) {
			throw new Exception("No hay hueco");
		}
		
		return añadido;
	}
	
	public boolean quitarVehiculo(String matricula) throws Exception {
		boolean quitado=false;
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i]!=null && vehiculos[i].getMatricula().equals(matricula)&& !quitado) {
				vehiculos[i]=null;
				quitado=true;
			}
		}
		if(!quitado) {
			throw new Exception("No existe vehiculo con esa matricula");
		}
		
		return quitado;
	}
	
	public String ordenarPorMarcaYModelo() {
		StringBuilder mensaje = new StringBuilder();
		ComparaMarcaModelo mm = new ComparaMarcaModelo();
		
		Arrays.sort(vehiculos,mm);
		
		for(Vehiculo v: vehiculos) {
			if(v!=null) {
				mensaje.append(v+"\n");
			}
		}
		
		return mensaje.toString();
	}
	
	public String ordenarTipoCombustible() {
		StringBuilder mensaje = new StringBuilder();
		ComparaTipoCombustible tp = new ComparaTipoCombustible();
		
		Arrays.sort(vehiculos, tp);
		
		for(Vehiculo v: vehiculos) {
			mensaje.append(v+"\n");
		}
		return mensaje.toString();
	}
	
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		
		for(Vehiculo v: vehiculos) {
			if(v!=null) {
				mensaje.append(v+"\n");
			}
		}
		
		return mensaje.toString(); 
	}

}
