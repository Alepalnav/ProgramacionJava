package Tema2.mock.model;

public class Vino {
	
	private String nombre;
	private double graduacion;
	
	public Vino(String nombre) {
		super();
		this.nombre=nombre;
	}

	public Vino(String nombre, double graduacion) {
		this.nombre=nombre;
		this.graduacion=graduacion;
	}

	public String getNombreVino() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}
	
	public String toString() {
		return "Vino " + nombre + ", con graduacion " + graduacion;
	}
	
	
}
