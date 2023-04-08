package Tema2.Boletin1.Ej1.model;

public class Rectangulo {

	private int longitud;
	private int ancho;
	
	public Rectangulo() {  
		super();
		this.longitud=1;
		this.ancho=1;
	}
	
	public Rectangulo(int longitud, int ancho) {  
		this();
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		if (longitud>0 && longitud<20) {
			this.longitud = longitud;				
		}
	}
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		if (ancho>0 && ancho<20) {
			this.ancho = ancho;				
		}
	}
	
	public double perimetro () {
		return 2*(this.longitud+this.ancho);
	}
	
	public double area () {
		return this.ancho*this.longitud;
	}

	public String toString () {
		return "Longitud: " + longitud +", ancho: "+ancho+",perimetro: "+ perimetro() +",area: "+area();
	}
	
	
}
