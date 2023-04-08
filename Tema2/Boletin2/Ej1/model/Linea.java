package Tema2.Boletin2.Ej1.model;

public class Linea {

	private Punto a;
	private Punto b;
	
	public Linea() {
		super();
		this.a=new Punto();
		this.a=new Punto();
	}
	
	public Linea(Punto a, Punto b) {
		this();
		this.a=a;
		this.b=b;
	}
	
	public void derecha(double m) {
		this.a.derecha(m);
		this.b.derecha(m);
	}
	
	public void izquierda(double m) {
		this.a.izquierda(m);
		this.b.izquierda(m);
	}
	
	public void arriba(double m) {
		this.a.arriba(m);
		this.b.arriba(m);
	}

	public void abajo(double m) {
		this.a.abajo(m);
		this.b.abajo(m);
	}
	
	public boolean equals(Object obj) {
		boolean igual = this==obj;
		
		if(!igual && obj != null && obj instanceof Linea) {
			
			Linea otraLinea = (Linea) obj;
			
			igual = this.a != null && otraLinea.a != null && this.a == otraLinea.a
					&& this.b != null && otraLinea.b != null && this.b == otraLinea.b;
		}
		
		return igual;
	}
	
	public String toString() {
		return "["+this.a+","+this.b+"]";
	}
	
}
