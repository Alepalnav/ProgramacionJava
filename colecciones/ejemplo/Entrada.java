package colecciones.ejemplo;

public class Entrada<K,V extends Number> { //si ponemos extends le decimos q los v tienen q ser de un tipo

	private K clave;
	private V valor;
	
	public Entrada(K clave, V valor) {
		super();
		this.clave=clave;
		this.valor=valor;
	}
	
	public String toString() {
		return "clave: "+clave+" y valor: "+valor;
	}

}
