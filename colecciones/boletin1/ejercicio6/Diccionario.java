package colecciones.boletin1.ejercicio6;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diccionario {
	
	Map<String, Collection> diccionario = new HashMap<>();
	

	public Diccionario() {
	}

	public boolean AñadirPalabra(String palabra, String significado) {
		boolean resultado=false;
		
		for(String k:diccionario.keySet()) {
			if(k.equals(palabra)) {
				diccionario.get(k).add(significado);
				resultado = true;
			}else if (!diccionario.containsKey(k)){
				diccionario.put(palabra, new HashSet<>());
				resultado = true;
			}
		}
		return resultado;
	}
	
	public String BuscarPalabra(String palabra) {
		StringBuilder resultado = new StringBuilder();
		
		for(String k:diccionario.keySet()) {
			if(k.equals(palabra)) {
				resultado.append(diccionario.get(k).toString());
			}
		}
		return resultado.toString();
	}
	
	public boolean BorrarPalabra(String palabra) {
		boolean resultado = false;
		
		for(String k: diccionario.keySet()) {
			if(k.equals(palabra)) {
				diccionario.remove(k);
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public String ListadoPalabra(String cadena) {
		StringBuilder resultado = new StringBuilder();
		
		for(String k: diccionario.keySet()) {
			if(k.startsWith(cadena)) {
				resultado.append(k);
			}
		}
		
		
		return resultado.toString();
	}
	
	public String toString() {
		return diccionario.toString();
	}
	
	
	
	
}
