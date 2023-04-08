package POO_avanzada.Cartas;

public class Carta {
	
	private int number;
	private Palo palo;
	
	public Carta(Palo palo, int number) {
		super();
		this.number=number;
		this.palo=palo;
	}
	
	public double getValor() {
		return this.number> 7? 0.5: this.number;
	}

	public int getNumber() {
		return number;
	}



	public Palo getPalo() {
		return palo;
	}



	public String toString() {
		return number+" de "+palo;
	}
	

}
