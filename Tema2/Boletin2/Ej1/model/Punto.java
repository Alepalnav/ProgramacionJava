package Tema2.Boletin2.Ej1.model;

public class Punto {

	private double x;
	private double y;
	
	public Punto() {
		super();
		this.x=0;
		this.y=0;
	}
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void derecha(double m) {
		this.x+=m;
	}
	
	public void izquierda(double m) {
		this.x-=m;
	}
	
	public void arriba(double m) {
		this.y+=m;
	}
	
	public void abajo(double m) {
		this.y-=m;
	}
	
	public String toString() {
		return "("+ this.x + ", " + this.y + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
	
	
	
	
}
