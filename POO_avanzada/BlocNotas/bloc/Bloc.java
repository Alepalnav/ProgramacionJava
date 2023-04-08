package POO_avanzada.BlocNotas.bloc;

import java.util.Arrays;
import java.util.Objects;

import POO_avanzada.BlocNotas.Exception.BlocException;
import POO_avanzada.BlocNotas.comun.Compara;
import POO_avanzada.BlocNotas.notas.Nota;
import POO_avanzada.BlocNotas.notas.NotaAlarma;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 10;
	private int numNotas;
	private String nombre;
	
	private Nota[] notas;
	
	public Bloc(String nombre) {
		super();
		this.nombre=nombre;
		notas = new Nota[NUMERO_NOTAS_MAXIMA];
	}
	
	public boolean addNota(Nota nota) throws BlocException {
		boolean isAdd=false;
		if(nota!=null && buscarPosicionNota(nota)==-1) {
			notas[numNotas++]=nota;
			isAdd = true;
		}else {
			throw new BlocException("Error al añadir nota");
		}
		
		return isAdd;
	}

	private int buscarPosicionNota(Nota nota) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNota(int numNotas) throws BlocException {
		String nota="";
		
		if(notas[numNotas]!=null) {
			nota=notas[numNotas].getTexto();
		}else {
			throw new BlocException("No hay notas en esa posicion");
		}
		
		return nota; 
	}
	
	public void updateNota(int numNotas,String textoNuevo) throws BlocException {
		boolean hecho = false;
		
		for(int i = 0; i<notas.length;i++) {
			if(notas[i]!=null && notas[i].getCodigo()==numNotas) {
				notas[i].setTexto(textoNuevo);
				hecho = true;
			}
		}
		
		if(!hecho) {
			throw new BlocException("Nota no encontrada");
		}
		
		
	}
	
	public void activa(int num) throws BlocException {
		if(notas[num]!=null && notas[num] instanceof NotaAlarma) {
			((NotaAlarma)notas[num]).activar();
		}else {
			throw new BlocException("Nota no encontrada");
		}
	} 

	public void desactiva(int num) throws BlocException {
		if(notas[num]!=null && notas[num] instanceof NotaAlarma) {
			((NotaAlarma)notas[num]).desactivar();
		}else {
			throw new BlocException("Nota no encontrada");
		}
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		StringBuilder p = new StringBuilder();
		
		for(Nota n: notas) {
			if(n!=null) {
				p.append(n+"\n");
			}
		}
		
		return "Bloc: "+this.nombre+"("+this.numNotas+" notas)"+p;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numNotas);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Bloc) {
			sonIguales = this.nombre.equals(((Bloc)obj).nombre);
		}
		
		return sonIguales;
	}
	
	public String ordenaBloc() {
		
		StringBuilder ordenado = new StringBuilder();
		Arrays.sort(notas, new Compara());
		for(Nota n: notas) {
			if(n!=null) {
				ordenado.append(n+"\n");
			}
		}
		
		return ordenado.toString();		
	}

}
