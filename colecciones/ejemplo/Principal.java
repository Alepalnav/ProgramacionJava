package colecciones.ejemplo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Entrada<String, Integer> entradaDiccionario = new Entrada<String, Integer>("Abedul",1);
		
		System.out.println(entradaDiccionario);

		Entrada<String, Integer> usuario = new Entrada<String, Integer>("jms",15678);
		System.out.println(usuario);
		
		List<String> nombres = new ArrayList<>(); //Poner primero la interfaz que engloba la clase que vamos a utilizar
		Set<String> nombres2 = new HashSet<>(); //asi seria con conjuntos
		nombres.add("Rafael");
		nombres.add("Rafael");
		nombres.set(1, "Alvaro");
		nombres2.addAll(nombres);

		System.out.println(nombres.size());
		System.out.println(nombres.toString());
		System.out.println(nombres2.toString());
		System.out.println(nombres.contains("Alvaro"));
	}

}
