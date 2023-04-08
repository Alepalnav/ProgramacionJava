package Tema2.Boletin2.Ej3.model;

public class Jarra {

	private double capacidad;
	private double cantidad;
	
	double cantidadTotal=0;
	
	public Jarra() {
		super();
		this.capacidad=0;
		this.cantidad=0;
	}
	
	public Jarra(double capacidad,double cantidad) {
		this();
		this.cantidad= cantidad;
		this.capacidad=capacidad;
	}
	
	public void llenarJarra() {
		this.cantidad = this.capacidad;
		cantidadTotal += this.capacidad;
	}
	
	public void vaciarJarra() {
		this.cantidad=0;
	}
	
	public Jarra volcarContenido(Jarra j2) {
		if(j2.getCantidad()+this.cantidad>j2.getCapacidad()) {
			this.cantidad-=j2.getCapacidad()-j2.getCantidad();
			j2.setCantidad(j2.getCapacidad());
		}else {
			j2.setCantidad(this.cantidad+j2.getCantidad());
			this.cantidad=0;
		}
		
		return j2;
	}
	
	public String toString() {
		return "Capacidad: "+this.capacidad+", Cantidad: "+this.cantidad;
	}
	

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
