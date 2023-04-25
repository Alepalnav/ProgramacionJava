package colecciones.mockExam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
	
	Map<LocalDate, Combinacion> sorteos;

	public Historial() {
		sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion combinacion) throws CombinacionException {
		boolean resultado = false;
		if(fecha!=null&&combinacion!=null) {
			sorteos.put(fecha, combinacion);
			resultado = true;
		}else {
			throw new CombinacionException();
		}
		
		return resultado;
	}
	
	public boolean addSorteo(int dia, int mes, int anyo, Combinacion combinacion) throws CombinacionException {
		boolean resultado = false;
		
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		if(combinacion!=null&&fecha!=null) {
			sorteos.put(fecha, combinacion);
			resultado=true;
		}else {
			throw new CombinacionException();
		}
		
		return resultado;
	}
	
	public boolean actualizarSorteo(int dia, int mes, int anyo, Combinacion combinacion ) throws CombinacionException {
		boolean resultado = false;
		
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		if(sorteos.containsKey(fecha)) {
			sorteos.replace(fecha, combinacion);
			resultado = true;
		}else {
			throw new CombinacionException();
		}
		
		return resultado;
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion combinacion ) throws CombinacionException {
		boolean resultado = false;
		
		if(sorteos.containsKey(fecha)) {
			sorteos.replace(fecha, combinacion);
			resultado = true;
		}else {
			throw new CombinacionException();
		}
		
		return resultado;
	}
	
	public boolean borrarSorteo(LocalDate fecha) throws CombinacionException {
		boolean resultado = false;
		
		if(sorteos.containsKey(fecha)) {
			sorteos.remove(fecha);
			resultado = true;
		}else {
			throw new CombinacionException();
		}
		
		return resultado;
	}

	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> historico = new ArrayList<>();
		
		for(LocalDate n: sorteos.keySet()) {
			if(fecha.isBefore(n)) {
				historico.add(n.toString()+sorteos.get(n));
			}
		}
		
		return historico;
	}
	
	public List<String> mostrarHistorico(){
		List<String> historico = new ArrayList<>();
		
		for(LocalDate n: sorteos.keySet()) {
			historico.add(n.toString()+sorteos.get(n));
		}
		
		return historico;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws CombinacionException{
		Map<String, Integer> comprobar = new HashMap<>();
		
		if(sorteos.containsKey(fecha)) {
			comprobar.put("Para la fecha "+fecha.toString()+" el número premiado es: "+sorteos.get(fecha), combinacion.comprobarCombinacion(sorteos.get(fecha)));
		}else {
			throw new CombinacionException();
		}
		
		return comprobar;
	}
	
	

}
