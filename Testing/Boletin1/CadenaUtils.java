package Testing.Boletin1;

public class CadenaUtils {
	
	private String cadena = "";
	public static final String numeros = "1234567890";
	
	public String toMayusculas(String cadena) {
		String resultado = "";
		
		resultado = cadena.toUpperCase();
		
		return resultado;
	}
	
	public String toMinusculas(String cadena) {
		String resultado = "";
		
		resultado = cadena.toLowerCase();
	
		return resultado;
	}
	
	public boolean estaEnMayusculas(String cadena) {
		boolean resultado = false;
		
		if(cadena.equals(cadena.toUpperCase())) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean estaEnMinusculas(String cadena) {
		boolean resultado = false;
		
		if(cadena.equals(cadena.toLowerCase())) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public boolean esCapicua(String cadena) {
		boolean resultado = false;
		
		if(numeros.indexOf(cadena)!=-1) {
			resultado = true;
		}
		StringBuilder n1 = new StringBuilder();
		StringBuilder n2 = new StringBuilder();
		
		if(resultado == true) {
			for(int i = 0;i<cadena.length();i++) {
				n1.append(cadena.charAt(i));
				n2.append(cadena.charAt(cadena.length()-i));
			}
			
			if(n1.equals(n2)) {
				resultado = true;
			}else {
				resultado = false;
			}			
		}
		
		return resultado;
	}
	
	public boolean esPalindromo(String cadena) {
		boolean resultado = false;
		
		if(numeros.indexOf(cadena)==-1) {
			resultado = true;
		}
		
		StringBuilder n1 = new StringBuilder();
		StringBuilder n2 = new StringBuilder();
		
		if(resultado == true) {
			for(int i = 0;i<cadena.length();i++) {
				n1.append(cadena.charAt(i));
				n2.append(cadena.charAt(cadena.length()-i));
			}
			
			if(n1.equals(n2)) {
				resultado = true;
			}else {
				resultado = false;
			}			
		}
		
		return resultado;
	}

	public CadenaUtils() {
		
		
		
	}

}
