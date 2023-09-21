package elementos;

import java.util.Random;

import logica.juego.Constantes;

public class Jugador extends Element{
//ATRIBUTOS
	private int dinero;
	private int pociones;
	private int gemas;
	private PlayerType jugador;
Random random = new Random();

//CONTRUCTOR
public Jugador(PlayerType jugador) {
	super(ElementType.valueOf(jugador.name()));
	this.jugador = jugador;
	this.dinero = 0;
	this.gemas = 0;
	this.pociones = 0;
}



//GETTERS AND SETTERS
public String getNombre() {
	return jugador.name();
}

private int getFuerza() {
	return jugador.getFuerza();
}

public int getFuerzaParaLuchar() {
	return random.nextInt(getFuerza());
}

private int getMagia() {
	return jugador.getMagia();
}

public int getMagiaParaLuchar() {
	return random.nextInt(getMagia());
}

private int getVelocidad() {
	return jugador.getVelocidad();
}

public int getVelocidadParaLuchar() {
	return random.nextInt(getVelocidad());
}

public int getDinero() {
	return dinero;
}

public void setDinero(int dinero) throws JugadorException {
	if (dinero < 0) {
		throw new JugadorException("Error. El dinero  no puede ser menor de 0");
} else {
	this.dinero = dinero;
	}
}

public int getPociones() {
	return pociones;
}

public void setPociones(int pociones) throws JugadorException {
	if (pociones < 0) {
		throw new JugadorException("Error. Las pociones no pueden ser negativas");
} else {
	this.pociones = pociones;
	}
}

public int getGemas() {
	return gemas;
}

public void setGemas(int gemas) throws JugadorException {
	if (gemas < 0) {
		throw new JugadorException("Error. No pueden ser negativas");
} else {
	this.gemas = gemas;
	}

}

public String resumen() {
    return "Nombre: " + this.getNombre()
            + " Gemas: " + this.getGemas() 
            + " Dinero: " + this.getDinero()
            + " Pociones: " + this.getPociones();
}
	public PlayerType getPlayer() {
		return jugador;
	}

	//encuentra dinero al moverse//
	public void encuentraDinero() {
		this.dinero++;
	}
	//encuentra pocion //
	public void encuentraPocion() {
		this.pociones++;
	}
	//encuetra gemas//
	public void encuentraGema() {
		this.gemas++;
	}
	
	//metodo para luchar entre dos jugadores//
	
	/**
	 * Método que se lleva a cabo entre dos jugadores que se encuentre.
	 * si la fuerza es igual, quedaria en empate.
	 * si el jugador uno le gana en fuerza al jugador contrario, el contrario puede:
	 * -usar pocion 
	 * -perder su dinero.
	 * si por el contrario el jugador contrario gana al jugador principal, este perderá una pocion si tiene
	 * y su dinero.
	 * 
	 * 
	 * @param jugadorContrario
	 * @return
	 */
	public int lucha(Jugador jugadorContrario) {
		int resultadoFinal=0;
		int fuerzaDelJugador= this.getFuerzaParaLuchar();
		int fuerzaDelJugadorContrario= jugadorContrario.getFuerzaParaLuchar();
		
		//Supuestos en los que nosotros ganariamos superando la fuerza del contrario//
		if(fuerzaDelJugador==fuerzaDelJugadorContrario) {
			resultadoFinal= Constantes.EMPATE;
		}else if (fuerzaDelJugador> fuerzaDelJugadorContrario) {
			if(jugadorContrario.getPociones()>0) {
				jugadorContrario.pociones--;
				resultadoFinal = Constantes.GANA_USA_POCIMA;
			}else if ( jugadorContrario.getDinero()>0) {
				
				this.dinero+=jugadorContrario.dinero;
				jugadorContrario.dinero=0;
				resultadoFinal=Constantes.GANA_DINERO;//gana el dinero del contrario y gana el jugador//
				
			}else {
				resultadoFinal= Constantes.GANA_MUERE;
			}
			//supuestos de casos en los que nosotros perderiamos.
		}else {
			
				if(pociones>0) {
					pociones --;
					resultadoFinal=Constantes.PIERDE_USA_POCIMA;
				} else if (dinero>0) {
					jugadorContrario.dinero+= this.getDinero();//el jugador contrario se queda nuestro dinero
					this.dinero=0; //reseteamos nuestro dinero a 0.
					resultadoFinal= Constantes.PIERDE_DINERO;//gana el enemigo y nos quita nustro dinero
				}else {
					resultadoFinal=Constantes.PIERDE_MUERE;//Supuesto en el que morimos
				}
		}	
			
		
		return resultadoFinal;
	}
	
	/**
	 * metodo que define el encuentro de una roca en nuestro camino.
	 * si tenemos gemas podemos romper la roca, y perderiamos una gema.
	 * si tenemos magia superior a 4, romperemos el obstaculo, si no, perderemos y no 
	 * permitirá el paso.
	 * 
	 * @return
	 */
	public int encuentraRoca() {
		int resultadoFinal=0;
		
		if (this.gemas>0) {
			resultadoFinal=Constantes.ROMPE_ROCA_CON_GEMA;
			
			this.gemas--;
		}else {
			if (this.getMagia()>4) {
				
				resultadoFinal=Constantes.GANA_A_LA_ROCA;
				
			}else {
				resultadoFinal=Constantes.PIERDE_A_LA_ROCA;
			}
		
		}
		return resultadoFinal;
	}
	
}
	
	
	
