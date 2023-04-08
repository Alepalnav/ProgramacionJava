package POO_avanzada.Actividad1.model;

import java.time.LocalDate;

public class Persona {
	
	private Genero genero;
	private String nombre;
	private String ap1;
	private String ap2;
	private double peso;
	private double altura;
	
	private LocalDate fechaNacimiento;
	
	public Persona(Genero genero, String nombre, String ap1, String ap2, double peso, double altura, 
			LocalDate fechaNacimiento) {
		super();
		this.genero= genero;
		this.nombre=nombre;
		this.ap1=ap1;
		this.ap2=ap2;
		this.peso=peso;
		this.altura=altura;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public int getEdad() {
		return LocalDate.now().getYear()-this.fechaNacimiento.getYear();
	}
	public double getIMC() {
		return this.altura>0? peso/(Math.pow(this.altura, 2)): 0.0;
	}

	
	
	
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp1() {
		return ap1;
	}

	public void setAp1(String ap1) {
		this.ap1 = ap1;
	}

	public String getAp2() {
		return ap2;
	}

	public void setAp2(String ap2) {
		this.ap2 = ap2;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Su género es: " + this.genero + " con una altura de: " + this.altura + " y pesa: " + this.peso
				+ " su nombre completo es: " + this.nombre + this.ap1 + this.ap2 
				+ " además sabemos que nació el: " + this.fechaNacimiento;
				
	}
}
