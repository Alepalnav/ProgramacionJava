package colecciones.boletin1.ejercicio2;

public class Alumno<K extends String, V extends String> {

	private K nombre;
	private V dni;
	
	
	public Alumno(K nombre, V dni) {
		super();
		this.dni=dni;
		this.nombre=nombre;
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Alumno) {
			sonIguales = this.dni.equals(((Alumno)obj).dni);
		}
		
		return sonIguales;
	} 
	
	
	public String toString() {
		return "Nombre: " +this.nombre+" dni: "+this.dni;
	}

}
