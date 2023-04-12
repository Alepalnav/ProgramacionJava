package colecciones.boletin1.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

	private String nombre;
	private Set<Alumno> alumnos;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
		this.alumnos = new HashSet<>();
	}
	
	public void addAlumno(Alumno alumno) throws Exception {
		
		if(!this.alumnos.contains(alumno)) {
			this.alumnos.add(alumno);			
		}else {
			throw new Exception("El alumno ya existe");
		}
		
	}
	
	public boolean removeAlumno(Alumno alumno) throws Exception {
		boolean resultado = false;
		
		if(this.alumnos.contains(alumno)) {
			this.alumnos.remove(alumno);
			resultado = true;
		}else {
			throw new Exception ("El alumno no existe");
		}
		
		return resultado;
	}
	
	public Alumno perteneceAlumno(Alumno alumno) {
		Alumno resultado = null;
		
		if(this.alumnos.contains(alumno)) {
			resultado = alumno;
		}
		
		return resultado;
	}
	
	public String mostrarEquipo() {
		return this.alumnos.toString();
	}
	
	public String unirEquipos(Equipo equipo) {
		Set<Alumno> alumnos2=new HashSet<>();  
		
		for(Alumno s: alumnos) {
			alumnos2.add(s);
		}
		
		for(Alumno c: equipo.alumnos) {
			alumnos2.add(c);
		}
		
		return alumnos2.toString();
	}
	
	public String interseccionEquipos(Equipo equipo) {
		Set<Alumno> inter=new HashSet<>();
		
		for(Alumno s: alumnos) {
			if(equipo.alumnos.contains(s)) {
				inter.add(s);
			}
		}
		
		return inter.toString();
	}
	

}
