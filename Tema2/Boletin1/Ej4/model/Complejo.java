package Tema2.Boletin1.Ej4.model;

public class Complejo {

	private double parteReal;
	private double parteImaginaria;
	
	public Complejo() {
		super();
	}
	
	public Complejo(double parteReal,double parteImaginaria) {
		this();
		this.parteImaginaria = parteImaginaria;
		this.parteReal = parteReal;
	}
	
	public Complejo suma(Complejo c2) {
		Complejo c3 = new Complejo();
		c3.setParteReal(this.parteReal+c2.getParteReal());
		c3.setParteImaginaria(this.parteReal+c2.getParteImaginaria());
		return c3;
	}
	
	public Complejo resta(Complejo c2) {
		Complejo c3 = new Complejo();
		c3.setParteReal(this.parteReal-c2.getParteReal());
		c3.setParteImaginaria(this.parteImaginaria-c2.getParteImaginaria());
		return c3;
	}
	
	public boolean equals(Complejo c2) {
		boolean res = false;
		
		if(this.parteReal==c2.getParteReal() && this.parteImaginaria==c2.parteImaginaria) {
			res = true;
		}
		
		return res;
	}
	
	public String toString() {
		return "(" + parteReal + ", " + parteImaginaria + ")";
	}
	
	
	public double getParteReal() {
		return parteReal;
	}
	
	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}
	
	public double getParteImaginaria() {
		return parteImaginaria;
	}
	
	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
}

