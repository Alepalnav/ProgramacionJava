package logicaJuego;

public class JuegoUtils {
	
	/**
	 * Devuelve una cadena de texto para simbolizar una barra en consola
	 */
	public static String crearSeparador() {
		StringBuilder resul = new StringBuilder();
		resul.append("     ");
		for (int i = 0; i < Constantes.TAMANNO * 4; i++) {
			resul.append("-");
		}
		resul.append("\n");
		return resul.toString();
	}

}
