package Tema2.Boletin1.Ej2;

public class Cuenta {
	
	private double saldo;
	private int numReintegros;
	private int numIngresos;
	
	
	public Cuenta(double saldo, int numReintegros, int numIngresos) {
		super();
		this.saldo = 0;
		this.numReintegros = 0;
		this.numIngresos = 0;
	}
	
	public boolean reintegro(double reint) {
		boolean res = false;
		if(reint>0 && this.saldo>=reint) {
			this.numReintegros++;
			this.saldo=this.saldo-reint;
			res=true;
		}
		return res;
	}
	
	public boolean ingreso(double ingres) {
		boolean res = false;
		if(ingres>0) {
			this.numIngresos++;
			this.saldo=this.saldo-ingres;		
		}
		return res;
	}
	

	@Override
	public String toString() {
		return "El saldo de la cuenta es " + saldo + ", numero de reintegros realizados:" + numReintegros + ", numero de ingresos "
				+ "realizados" + numIngresos;
	}
	

	//Getters & Setters
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
}