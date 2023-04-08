package Tema2.Boletin2.Ej2.model;

public class Producto {
	
	private int cod;
	private String desc;
	private double precio;
	public static final double IVA = 0.20;
	public static int cont = 0;
	
	public Producto() {
		super();
		this.cod=cont++;
	}
	
	public Producto(String desc,double precio) {
		this();
		this.cod=cont++;
		this.desc=desc;
		this.precio=precio;
	}
	
	public double PrecioIva() {
		return this.precio+(this.precio*IVA);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "Producto [codigo=" + cod + ", descripcion=" + desc + ", precioSinIVA=" + precio + "]";
	}

}
