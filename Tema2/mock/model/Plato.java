package Tema2.mock.model;

public class Plato {

	private String nombre;
	private double precio;
	public static final double iva = 0.21;
	private Vino vino;
	
	public Plato(String nombre) {
		super();
		this.nombre=nombre;
	}
	
	public Plato(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return precio+(precio*iva);
	}
	
	public String getVinoRecomendado() {
		return this.vino!=null? this.vino.toString() : "Sin recomendaciones";
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void incrementarPrecio(double incremento) {
		this.precio+=incremento;
	}
	
	public void setVinoRecomendado(Vino vino) {
		this.vino=vino;
	}
	
	public void setVinoRecomendado(String vino, double graduacion) throws Exception {
		setVinoRecomendado(new Vino(vino,graduacion));
	}
	
	public double getGradosVinosRecomendado() {
		return vino.getGraduacion();
	}
	
	public double getIva() {
		return iva;
	}
	
	public String toString() {
		return "\nNombre del plato: "+nombre+", precio sin IVA: "+getPrecioBase()+"€, \n"
				+ "precio venta al publico: "+getPrecioVentaPublico()+ ", vino recomendado: "+ getVinoRecomendado();
	}
	
	
	
}
