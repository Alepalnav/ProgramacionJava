package elementos;

import java.util.Random;

import logicaJuego.Constantes;

public class Jugador extends Elemento{

		private int dinero;
		private int pociones;
		private int gemas;
		private PlayerType jugador;
	Random random = new Random();

	public Jugador(PlayerType jugador) {
		super(ElementType.valueOf(jugador.name()));
		this.jugador = jugador;
		this.dinero = 0;
		this.gemas = 0;
		this.pociones = 0;
	}
	
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

	public void encuentraDinero() {
		this.dinero++;
	}
	public void encuentraPocion() {
		this.pociones++;
	}
	public void encuentraGema() {
		this.gemas++;
	}
	
	
		

}
