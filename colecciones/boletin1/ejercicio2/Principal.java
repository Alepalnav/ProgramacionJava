package colecciones.boletin1.ejercicio2;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Equipo equipo1 = new Equipo("Equipo1");
		Equipo equipo2 = new Equipo("Equipo2");
		
		Alumno alumno1 = new Alumno("Alejandro","3233332e");
		Alumno alumno2 = new Alumno("Alvaro","323124r");
		Alumno alumno3 = new Alumno("Alvaro","323124r");
		Alumno alumno4 = new Alumno("Rafa","213213y");
		Alumno alumno5 = new Alumno("Fran","3213213T");
		Alumno alumno6 = new Alumno("Alejandro","3233332e");

		equipo1.addAlumno(alumno1);
		equipo1.addAlumno(alumno2);
		equipo1.addAlumno(alumno3);
		equipo2.addAlumno(alumno4);
		equipo2.addAlumno(alumno5);
		equipo2.addAlumno(alumno6);

		System.out.println(equipo1.mostrarEquipo());
		System.out.println(equipo2.mostrarEquipo());
		
		equipo1.removeAlumno(alumno2);
		
		System.out.println(equipo1.mostrarEquipo());
		
		equipo2.perteneceAlumno(alumno4);
		
		System.out.println(equipo1.mostrarEquipo());
		System.out.println(equipo2.mostrarEquipo());
		
		System.out.println(equipo1.unirEquipos(equipo2));
		System.out.println(equipo1.interseccionEquipos(equipo2));
		
	}
	
}
