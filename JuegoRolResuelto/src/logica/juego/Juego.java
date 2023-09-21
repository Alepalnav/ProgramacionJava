package logica.juego;

import java.util.ArrayList;
import java.util.HashMap;

import elementos.Coordenada;
import elementos.Element;
import elementos.ElementType;
import elementos.Jugador;
import elementos.JugadorException;
import elementos.PlayerType;

public class Juego {

	private HashMap<Coordenada, Element> tablero;
	private ArrayList<Coordenada> coordenadaJugadores;
	private int jugadorJuega;
	private int dado;

	/**
	 * Constructor Que crea un tablero y añade los jugadores en base a la constante, llamando al metodo crearJugadores.
	 * @param personaje
	 */
	public Juego(PlayerType[] personaje) {
		super();
		int contador=0;
		coordenadaJugadores = new ArrayList<>();
		tablero = new HashMap<>();
		crearTablero();
		while(contador<Constantes.NUM_JUGADORES) {
			if(crearJugador(personaje[contador])) {
				contador++;
			}
		}
		
	}
	
	
	/**
	 * metodo para crear jugadores, devuelve un boolean y crea un jugador y una coordenada,
	 * Si la coordenada es nula, le añado la coordenada al tablero y el jugador.
	 * 
	 */
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
	
	

	/**
	 * Creo el tablero con los metodos creardinero, creargemas, crearpociones, crearrocas.
	 * Todos los elementos menos los jugadores
	 */
	private void crearTablero() {
		crearDinero();
		crearGemas();
		crearPociones();
		crearRocas();
	}
	
	/**
	 * Método que sirve para crear rocas, como limite tiene la constante NUM_ROCAS.
	 * Creamos una coordenada y un Elemento tipo Roca, comprobamos en el mapa (tablero)
	 * que el valor de la keyset es null, para así tener espacio para crear la roca.
	 * le insertamos al tablero, la coordenada y el elemento, que en este caso será roca y aumentamos el numero.
	 */
	private void crearRocas() {
		int contador = 0;
		while (contador < Constantes.NUM_ROCAS) {
			Coordenada coor1 = new Coordenada();
			Element e = new Element(ElementType.ROCA);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}
	/**
	 * Metodo que sirve para crear gemas con el limite de la constante NUM DINERO.
	 * crea tipos de elemento DINERO, se crea una coordenada generada aleatoria, y se comprueba que el valor de esa
	 * coordenada en el tablero esta vacia, osea es null, si es null pues en dicha casilla le inserta el elemento.
	 */
	private void crearDinero() {
		int contador = 0;
		while (contador < Constantes.NUM_DINERO) {
			Coordenada coordenada = new Coordenada();
			Element elemento = new Element(ElementType.DINERO);
			if (tablero.get(coordenada) == null) {
				this.tablero.put(coordenada, elemento);
				contador++;
			}

		}

	}
	/**
	 * Devuelve el elemento que está en la coordenada coord.
	 * @param coord
	 * @return
	 */
	public Element obtenerElementoTablero(Coordenada coord) {
		return this.tablero.get(coord);
	}
	/**
	 * obtiene la coordenada del jugador que está jugando actualmente
	 * @return
	 */
	public Coordenada obtenerCoordenadaJugadorJuega() {
		return this.coordenadaJugadores.get(jugadorJuega);
	}
	
	/**
	 * Metodo que sirve para crear gemas con el limite de la constante NUM GEMA.
	 * crea tipos de elemento GEMA, se crea una coordenada generada aleatoria, y se comprueba que el valor de esa
	 * coordenada en el tablero esta vacia, osea es null, si es null pues en dicha casilla le inserta el elemento.
	 */
	private void crearGemas() {
		int contador = 0;
		while (contador < Constantes.NUM_GEMAS) {
			Coordenada coor1 = new Coordenada();
			Element e = new Element(ElementType.GEMA);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}
	/**
	 * Metodo que sirve para crear Pociones con el limite de la constante NUM POCIONES.
	 * crea tipos de elemento POCION, se crea una coordenada generada aleatoria, y se comprueba que el valor de esa
	 * coordenada en el tablero esta vacia, osea es null, si es null pues en dicha casilla le inserta el elemento.
	 */
	private void crearPociones() {
		int contador = 0;
		while (contador < Constantes.NUM_POCIONES) {
			Coordenada coor1 = new Coordenada();
			Element e = new Element(ElementType.POCION);
			if (tablero.get(coor1) == null) {
				this.tablero.put(coor1, e);
				contador++;
			}

		}
	}
	
	/**
	 * método para saber cuando acaba el juego, el juego acabará cuando solo quede
	 * un jugador o un jugador tenga todo el dinero del juego.
	 * 
	 * @return
	 */
	public boolean isTerminado() {
		boolean terminar = false;
		boolean dinero = false;
		for (Element elemento : this.tablero.values()) {
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
	/**
	 * método para eliminar un jugador, se le pasa una coordenada por parámetro y se elimina
	 * tanto de la lista CoordenadaJugadores como del tablero indicando la coordenada especificada
	 * por parámetro.
	 * @param coordenada
	 */
	private void eliminarJugador(Coordenada coordenada) {
		this.coordenadaJugadores.remove(coordenada);
		this.tablero.remove(coordenada);
	}

	/**
	 * método que imprime el nombre de los jugadores en el tablero y devuelve
	 * una cadena con el nombre del jugador más el numero del 1 al 4 de que se trate.
	 * @return
	 */
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
	
	/**
	 * devuelve el valor del dado
	 * @return
	 */
	public int getValorDado() {
		return dado;
	}
	/**
	 * decrementa el dado.
	 * @return
	 */
	public int decrementaDado() {
		return this.dado--;
	}
	
	/**
	 * Asinga valor del dado con los movimientos para el jugador que juega le ha salido
	 */
	public void setDado() {
		this.dado = ((Jugador) tablero.get(coordenadaJugadores.get(jugadorJuega))).getVelocidadParaLuchar();
	}
	
	
	/**
	 * método para cambiar la posicion de un Jugador, se le pasa una coordenada y se crea otra con el valor
	 * de la lista de jugadores, el atributo jugador juega. Se crea un jugador 2 que se le asigna la coordenada
	 * se inserta en tablero la coordenada y el nuevo jugador y se borra y actualiza en  la lista Jugadores.
	 * @param coordenada
	 */
	private void cambiaJugadorAPosicion(Coordenada coordenada) {
		Coordenada coor = coordenadaJugadores.get(jugadorJuega); 
		Jugador jug = (Jugador) tablero.get(coor);
		
		tablero.remove(coor); 
		coordenadaJugadores.remove(jugadorJuega); 
		coordenadaJugadores.add(jugadorJuega, coordenada); 
		tablero.put(coordenada, jug);
	}
	

	/**
	 * metodo que imprime, devuelve, los jugadores con sus
	 *  valores de dinero, pociones y gemas.
	 * @return
	 */
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
	
	/**
	 * método para mover al jugador, recibe un caracter que será la direccion, Norte, Sur, Este o Oeste,
	 * comprobamos que sea un caracter valido.
	 * Utilizamos en switch para llamar a los métodos de coordenada.
	 */
	private Coordenada getNextPosition (char direccion) throws JuegoException {
		if(direccion!='N' && direccion!='S' && direccion!='E' && direccion!='O') {
			throw new JuegoException("Error en la direcciÃ³n.");
		}
		Coordenada coor;
		try {
			coor = coordenadaJugadores.get(jugadorJuega).clone();
			if(direccion=='N') {
				coor.goUp();
			}else if(direccion=='S') {
				coor.goDown();
			}else if(direccion=='E') {
				coor.goRight();
			}else {
				coor.goLeft();
			}
		} catch (CloneNotSupportedException e) {
			throw new JuegoException(e.getMessage());
		}
		return coor;
	}
	
	/**
	 * Escribe el tablero en formato no grÃ¡fico. Devuelve el string con la
	 * informaciÃ³n
	 */
	@Override
	public String toString() {
		StringBuilder resul = new StringBuilder();
		resul.append(barra());
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
			resul.append("\n");
			resul.append(barra());
			resul.append("     |");
		}
		resul.delete(resul.length() - 5, resul.length());
		return resul.toString();
	}

	/**
	 * Actualiza la variable jugadorJuega al próximo jugador.
	 */
	public void proximoJugador() {
		if (this.jugadorJuega == coordenadaJugadores.size() - 1) {
			this.jugadorJuega = 0;
		} else {
			jugadorJuega++;
		}
	}
	
	/**
	 * Devuelve la información del ganador si sólo hay jugador o si no, 
	 * si hay alguien que tiene todo el dinero
	 * @return
	 */
	public String getGanador() {
		StringBuilder resultado = new StringBuilder();
		if (this.coordenadaJugadores.size() == 1) {
			Jugador jugador = (Jugador) tablero.get(coordenadaJugadores.get(0));
			resultado.append(jugador.toString());
			
		} else {
			
			for (Element siguiente : tablero.values()) {
				if (siguiente instanceof Jugador) {
					Jugador jugador = ((Jugador) siguiente);
					if (jugador.getDinero() == Constantes.NUM_DINERO) {
						resultado.append(jugador.getNombre());
					}
				}
			}
		}
		return resultado.toString();
	}

	/**
	 * metodo que te devuelve el nombre del tipo de jugador que juega.
	 * @return
	 */
	public String getNombreJugadorQueJuega() {
		StringBuilder sb = new StringBuilder();
		Coordenada coor = this.coordenadaJugadores.get(jugadorJuega);
		
	
		Jugador jugador = (Jugador) this.tablero.get(coor);
		sb.append(jugador.getNombre());
		return sb.toString();
	}
	
	/**
	 * Obtener movimiento del jugador
	 * @return
	 */
	public int getMovimientoJugador() {
		Coordenada coor = this.coordenadaJugadores.get(jugadorJuega);
		Jugador jugador = (Jugador) this.tablero.get(coor);
		return jugador.getFuerzaParaLuchar();
	}
	

	/**
	 * Simplemente escribe una barra en pantalla
	 * 
	 * @return
	 */
	private String barra() {
		StringBuilder resul = new StringBuilder();
		resul.append("     ");
		for (int i = 0; i < Constantes.TAMANNO * 4; i++) {
			resul.append("-");
		}
		resul.append("\n");
		return resul.toString();
	}


	/**
	 * Mover el jugador
	 * 
	 * @param direction
	 * @return
	 * @throws JuegoException
	 * @throws JugadorException
	 */
	public String movePlayer(char direction) throws JuegoException, JugadorException {
		// Si no es una direcciÃ³n vÃ¡lida, mando un exception
		String resul = "";
		Jugador jugador = (Jugador) this.tablero.get(this.coordenadaJugadores.get(jugadorJuega));

		Coordenada coordDestino = getNextPosition(direction);

		// Tengo que ver que hay en la nueva casilla
		Element elemento = this.tablero.get(coordDestino);

		if (elemento != null) { // Hay algo en la casilla
			if (elemento instanceof Jugador) {

				Jugador enemigo = (Jugador) elemento;
				int resultadoLucha = jugador.lucha(enemigo);
				switch (resultadoLucha) {
				case Constantes.EMPATE:
					resul = "Empate entre los jugadore";
					break;
				case Constantes.GANA_USA_POCIMA:
					resul = "El jugador " + jugador.getNombre() + " gana. Le quita una pócima al enemigo";
					break;
				case Constantes.GANA_DINERO:
					resul = "El jugador " + jugador.getNombre() + " gana. Le quita el dinero al enemigo";
					break;
				case Constantes.GANA_MUERE:
					resul = "El jugador " + jugador.getNombre() + " gana. El enemigo muere";
					this.eliminarJugador(coordDestino);
					// Si se elimina el jugador que juega el dado se pone a 0 para que no siga
					// tirando
					break;
				case Constantes.PIERDE_USA_POCIMA:
					resul = "El enemigo " + enemigo.getNombre() + " gana. Le quita una pócima al jugador";
					break;
				case Constantes.PIERDE_DINERO:
					resul = "El enemigo " + enemigo.getNombre() + " gana. Le quita el dinero al jugador";
					break;
				case Constantes.PIERDE_MUERE:
					resul = "El enemigo " + enemigo.getNombre() + " gana. El jugador muere";
					this.eliminarJugador(this.coordenadaJugadores.get(jugadorJuega));
					dado = 0;
					// Decrementamos en uno el jugador, para que no se salte al siguiente
					// ya que al borrarlo el siguiente apunta al siguiente, y al incrementarlo
					// se le salta
					this.jugadorJuega--;
					break;
				}
				// DespuÃ©s de la lucha los jugadores no se mueven
			} else if (elemento.getType() == ElementType.ROCA) {
				int resultadoRoca = jugador.encuentraRoca();
				switch (resultadoRoca) {
				case Constantes.ROMPE_ROCA_CON_GEMA:
					resul = "El jugador " + jugador.getNombre() + " rompe la roca con una gema";
					this.cambiaJugadorAPosicion(coordDestino);
					break;

				case Constantes.GANA_A_LA_ROCA:
					resul = "El jugador " + jugador.getNombre() + " gana a la roca";
					this.cambiaJugadorAPosicion(coordDestino);
					break;

				case Constantes.PIERDE_A_LA_ROCA:
					resul = "El jugador " + jugador.getNombre() + " pierde. No se mueve";
					break;
				}
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

		return resul;
	}

	
}


