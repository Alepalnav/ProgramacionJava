package POO_avanzada.Cartas;

import java.util.Arrays;
import java.util.Random;

public class Baraja {
	
	  
	Carta carta;
	
	Carta[] baraja = new Carta[40];
	
	
	public Baraja() {
		int contador = 0;
		for(Palo p : Palo.values()){
			for(int i = 1; i<13;i++) {
				if(i!=8&&i!=9) {
					baraja[contador] = new Carta(p,i);				
					contador++;
				}
			}
		}
	}
	
	Random rand = new Random();
	
	public void barajar() {
		
		for(int c = 0;c<30;c++) {
			int i = rand.nextInt(40);
			int a = rand.nextInt(40);
			
			Carta cambio1 = baraja[i];
			Carta cambio2 = baraja[a];
			
			baraja[i]=cambio2;
			baraja[a]=cambio1;
		}	
	}

	public Carta getSiguiente(int c) {
		Carta resultado = baraja[c];
		return resultado;
	}
	
	public int getNumero(int c) {
		Carta resultado = baraja[c];
		return resultado.getNumber();
	}

	public String toString() {
		return Arrays.toString(baraja);
	}
}
