package colecciones.mockExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Combinacion {

	public static final int VALOR_MINIMO = 1;
	public static final int VALOR_MAXIMO_NUMEROS = 50;
	public static final int VALOR_MAXIMO_ESTRELLAS = 12;
	public static final int TOTAL_NUMEROS = 5;
	public static final int TOTAL_ESTRELLAS = 2;
	
	private Set<Integer> numeros;
	private Set<Integer> estrellas;
	
	public Combinacion(int n1, int n2, int n3, int n4, int n5, int n6, int n7) throws CombinacionException {
		int[] numeros = {n1,n2,n3,n4,n5};
		int[] estrellas = {n6,n7};
		
		if(validar(numeros, estrellas)) {
			this.numeros= new HashSet<Integer>(Set.of(n1,n2,n3,n4,n5));
			this.estrellas= new HashSet<Integer>(Set.of(n6,n7));
		}else {
			throw new CombinacionException();
		}
		
	}
	
	public Combinacion (int[] numeros, int[] estrellas) throws CombinacionException {
		if(validar(numeros,estrellas)) {
			this.numeros=new HashSet<Integer>();
			this.estrellas=new HashSet<Integer>();
			for(int n: numeros) {
				this.numeros.add(n);
			}
			for(int n: estrellas) {
				this.estrellas.add(n);
			}
		}else {
			throw new CombinacionException();
		}
		
	}

	public Set<Integer> getNumeros() {
		return numeros;
	}

	public Set<Integer> getEstrellas() {
		return estrellas;
	}
	
	public int comprobarCombinacion(Combinacion combinacion) {
		int numN=0;
		int numE=0;
		
		for(int n:this.numeros) {
			if(combinacion.numeros.contains(n)) {
				numN++;
			}
		}
		
		for(int i:this.estrellas) {
			if(combinacion.estrellas.contains(i)) {
				numE++;
			}
		}
		
		return numN+numE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Combinacion) {
			Combinacion casteado = (Combinacion) obj;
			sonIguales=this.hashCode()==casteado.hashCode();
		}
		
		return sonIguales;
	}

	@Override
	public String toString() {
		return "Combinacion [numeros=" + numeros + ", estrellas=" + estrellas + "]";
	}
	
	public boolean validar(int[] numeros, int[] estrellas) {
		boolean valNumeros = true;
		Set<Integer> setNumeros = new HashSet<>();
		
		for(int n: numeros) {
			setNumeros.add(n);
			if(n>VALOR_MAXIMO_NUMEROS || n<VALOR_MINIMO) {
				valNumeros = false;
			}
		}
		if(setNumeros.size()!=TOTAL_NUMEROS) {
			valNumeros = false;
		}
		
		boolean valEstrellas = true;
		Set<Integer> setEstrellas = new HashSet<>();
		
		for(int n: estrellas) {
			setEstrellas.add(n);
			if(n>VALOR_MAXIMO_ESTRELLAS || n<VALOR_MINIMO) {
				valEstrellas = false;
			}
		}
		if(setEstrellas.size()!=TOTAL_ESTRELLAS) {
			valEstrellas = false;
		}
		
		
		return valNumeros && valEstrellas;
	}
	
	
	
	

}
