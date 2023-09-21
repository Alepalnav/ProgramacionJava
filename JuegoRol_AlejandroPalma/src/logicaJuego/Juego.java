package logicaJuego;

import static logicaJuego.JuegoUtils.crearSeparador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import elementos.Coordenada;
import elementos.Elemento;
import elementos.Elemento;
import elementos.Elemento;
import elementos.ElementType;
import elementos.Elemento;
import elementos.Jugador;
import elementos.JugadorException;
import elementos.PlayerType;
import logicaJuego.Constantes;
import logicaJuego.JuegoException;

public class Juego {

	private Map<Coordenada, Elemento> tablero;
	private List<Coordenada> coordenadaJugadores;
	private int jugadorJuega;
	private int dado; // Dado para ver los movimientos del jugador que juega



	public Juego(PlayerType[] tipos) {
		super();
		int contador=0;
		coordenadaJugadores = new ArrayList<>();
		tablero = new HashMap<>();
		crearTablero();
		while(contador<Constantes.NUM_JUGADORES) {
			if(crearJugador(tipos[contador])) {
				contador++;
			}
		}
	}
	
	private boolean crearJugador(PlayerType tipo) {
		boolean crear = false;
		Jugador jugador = new Jugador(tipo);
		Coordenada coordenada = new Coordenada();
		while (coordenadaJugadores.contains(coordenada)) {
			coordenada = new Coordenada();
		}if(this.tablero.get(coordenada)==null) {
			coordenadaJugadores.add(coordenada);
			tablero.put(coordenada, jugador);
			crear = true;
		}
		
		
		return crear;
	}
	
	private void crearTablero() {
		crearDinero();
		crearGemas();
		crearPociones();
		crearRocas();
	}
	
	private void crearDinero() {
		int contador = 0;
		while (contador < Constantes.NUM_DINERO) {
			Coordenada coordenada = new Coordenada();
			Elemento elemento = new Elemento(ElementType.DINERO);
			if (tablero.get(coordenada) == null) {
				this.tablero.put(coordenada, elemento);
				contador++;
			}

		}

	}
	
	private void crearGemas() {
		int contador = 0;
		while (contador < Constantes.NUM_GEMAS) {
			Coordenada coor1 = new Coordenada();
			Elemento e = new Elemento(ElementType.GEMA);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}
	
	private void crearPociones() {
		int contador = 0;
		while (contador < Constantes.NUM_POCIONES) {
			Coordenada coor1 = new Coordenada();
			Elemento e = new Elemento(ElementType.POCION);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}
	
	private void crearRocas() {
		int contador = 0;
		while (contador < Constantes.NUM_ROCAS) {
			Coordenada coor1 = new Coordenada();
			Elemento e = new Elemento(ElementType.ROCA);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}


	/**
	 * Mueve el jugador en el tablero
	 * 
	 * @param direccion
	 * @return resultado de la operación
	 * @throws JuegoException
	 * @throws JugadorException
	 */
	public String moverJugador(char direccion) throws JuegoException, JugadorException {

		String resultado = "";
		Jugador jugador = (Jugador) this.tablero.get(this.coordenadaJugadores.get(jugadorJuega));

		Coordenada coordDestino = getNextPosition(direccion);

		// Tengo que ver que hay en la nueva casilla
		Elemento elemento = this.tablero.get(coordDestino);

		if (elemento != null) { // Hay algo en la casilla
			if (elemento instanceof Jugador) {
				// Después de la lucha los jugadores no se mueven
				resultado = luchar(resultado, jugador, coordDestino, elemento);
				
			} else if (elemento.getType() == ElementType.ROCA) {
				resultado = encuentraRoca(resultado, jugador, coordDestino);
				
			} else if (elemento.getType() == ElementType.GEMA) {
				jugador.encuentraGema();
				this.cambiaJugadorAPosicion(coordDestino);

			} else if (elemento.getType() == ElementType.DINERO) {
				jugador.encuentraDinero();
				this.cambiaJugadorAPosicion(coordDestino);

			} else if (elemento.getType() == ElementType.POCION) {
				jugador.encuentraPocion();
				this.cambiaJugadorAPosicion(coordDestino);

			}

		} else {
			this.cambiaJugadorAPosicion(coordDestino);
		}

		return resultado;
	}

	private String encuentraRoca(String resultado, Jugador jugador, Coordenada coordDestino) {
		int resultadoRoca = jugador.encuentraRoca();
		switch (resultadoRoca) {
				case Constantes.ROMPE_ROCA_CON_GEMA:
					resultado = String.format("El jugador %s rompe la roca con una gema.", jugador.getNombre());
					this.cambiaJugadorAPosicion(coordDestino);
					break;
		
				case Constantes.GANA_A_LA_ROCA:
					resultado = String.format("El jugador %s gana a la roca.", jugador.getNombre());
					this.cambiaJugadorAPosicion(coordDestino);
					break;
		
				case Constantes.PIERDE_A_LA_ROCA:
					resultado = String.format("El jugador %s pierde. No se mueve.", jugador.getNombre());
					break;
		}
		return resultado;
	}

	private String luchar(String resultado, Jugador jugador, Coordenada coordDestino, Elemento elemento) {
		Jugador enemigo = (Jugador) elemento;
		int resultadoLucha = jugador.lucha(enemigo);
		switch (resultadoLucha) {
		case Constantes.EMPATE:
			resultado = "Empate entre los jugadores";
			break;
		case Constantes.GANA_USA_POCIMA:
			resultado = "El jugador " + jugador.getNombre() + " gana. Le quita una pócima al enemigo";
			break;
		case Constantes.GANA_DINERO:
			resultado = "El jugador " + jugador.getNombre() + " gana. Le quita el dinero al enemigo";
			break;
		case Constantes.GANA_MUERE:
			resultado = "El jugador " + jugador.getNombre() + " gana. El enemigo muere";
			this.eliminarJugador(coordDestino);
			// Si se elimina el jugador que juega el dado se pone a 0 para que no siga
			// tirando
			break;
		case Constantes.PIERDE_USA_POCIMA:
			resultado = "El enemigo " + enemigo.getNombre() + " gana. Le quita una pócima al jugador";
			break;
		case Constantes.PIERDE_DINERO:
			resultado = "El enemigo " + enemigo.getNombre() + " gana. Le quita el dinero al jugador";
			break;
		case Constantes.PIERDE_MUERE:
			resultado = "El enemigo " + enemigo.getNombre() + " gana. El jugador muere";
			this.eliminarJugador(this.coordenadaJugadores.get(jugadorJuega));
			dado = 0;
			// Decrementamos en uno el jugador, para que no se salte al siguiente
			// ya que al borrarlo el siguiente apunta al siguiente, y al incrementarlo
			// se le salta
			this.jugadorJuega--;
			break;
		}
		return resultado;
	}

	//TODO
	private Coordenada getNextPosition(char direction) throws JuegoException {
		if(direction!='N' && direction!='S' && direction!='E' && direction!='O') {
			throw new JuegoException("Error en la direcciÃ³n.");
		}
		Coordenada coor;
		try {
			coor = (Coordenada) coordenadaJugadores.get(jugadorJuega).clone();
			if(direction=='N') {
				coor.goUp();
			}else if(direction=='S') {
				coor.goDown();
			}else if(direction=='E') {
				coor.goRight();
			}else {
				coor.goLeft();
			}
		} catch (CloneNotSupportedException e) {
			throw new JuegoException(e.getMessage());
		}
		return coor;
	}

	//TODO
	private void cambiaJugadorAPosicion(Coordenada coordDestino) {
		Coordenada coor = coordenadaJugadores.get(jugadorJuega); 
		Jugador jug = (Jugador) tablero.get(coor);
		
		tablero.remove(coor); 
		coordenadaJugadores.remove(jugadorJuega); 
		coordenadaJugadores.add(jugadorJuega, coordDestino); 
		tablero.put(coordDestino, jug);
	}

	//TODO
	private void eliminarJugador(Coordenada coordDestino) {
		this.coordenadaJugadores.remove(coordDestino);
		this.tablero.remove(coordDestino);
	}


	/**
	 * Escribe el tablero en formato no gráfico. Devuelve el string con la
	 * información
	 */
	@Override
	public String toString() {
		StringBuilder resul = new StringBuilder();
		resul.append(crearSeparador());
		resul.append("     |");

		for (int fila = 0; fila < Constantes.TAMANNO; fila++) {
			for (int columna = 0; columna < Constantes.TAMANNO; columna++) {
				Coordenada coor = new Coordenada(columna, fila);

				if (this.tablero.get(coor) != null) {
					resul.append(" " + this.tablero.get(coor).getType().getSymbol() + " ");
				} else {
					resul.append("   ");
				}

				resul.append("|");
			}
			resul.append(System.lineSeparator()).append(crearSeparador()).append("     |");
		}
		resul.delete(resul.length() - 5, resul.length());
		return resul.toString();
	}

	//TODO
	public String imprimeValoresJugadores() {
		int contador = 1;
		StringBuilder sb = new StringBuilder();
		
		for (Coordenada coordenada : this.coordenadaJugadores) {
			Jugador jugador = (Jugador) tablero.get(coordenada);
			sb.append("Jugador numero: " + contador 
						+ " Dinero: " + jugador.getDinero() 
						+ " Gemas: " + jugador.getGemas() 
						+ " Pociones: " + jugador.getPociones() + "\n");
			contador++;
		}
		return sb.toString();
	}

	//TODO
	public String imprimeNombreJugadores() {
		int contador = 1;
		StringBuilder sb = new StringBuilder();
		
		for (Coordenada coordenada : this.coordenadaJugadores) {
		Jugador jugadores = (Jugador) tablero.get(coordenada);
			sb.append("El tipo del jugador es: " + jugadores.getNombre() + " y es el jugador numero: " + contador + "\n");
			contador++;
		}
		return sb.toString();
	}

	//TODO
	public boolean isTerminado() {
		boolean terminar = false;
		boolean dinero = false;
		for (Elemento elemento : this.tablero.values()) {
			if (elemento instanceof Jugador) {
				if (((Jugador) elemento).getDinero() == Constantes.DINERO) {
					dinero = true;
				}
			}
		}
	if (this.coordenadaJugadores.size() == 1 || dinero) {
		terminar = true;
		}
		return terminar;
	}

	//TODO
	public int getValorDado() {
		return dado;
	}


	public void setDado() {
		this.dado = ((Jugador) tablero.get(coordenadaJugadores.get(jugadorJuega))).getVelocidadParaLuchar();
	}




	//TODO
	public String getNombreJugadorQueJuega() {
		StringBuilder sb = new StringBuilder();
		Coordenada coor = this.coordenadaJugadores.get(jugadorJuega);
		
	
		Jugador jugador = (Jugador) this.tablero.get(coor);
		sb.append(jugador.getNombre());
		return sb.toString();
	}

	//TODO
	public void proximoJugador() {
		if (this.jugadorJuega == coordenadaJugadores.size() - 1) {
			this.jugadorJuega = 0;
		} else {
			jugadorJuega++;
		}
	}

	//TODO
	public String getGanador() {
		return null;
	}

	//TODO
	public Elemento obtenerElementoTablero(Coordenada coordenada) {
		return null;
	}

	//TODO
	public Coordenada obtenerCoordenadaJugadorJuega() {
		return this.coordenadaJugadores.get(jugadorJuega);
	}

	//TODO
	public void decrementaDado() {
		
	}
}
