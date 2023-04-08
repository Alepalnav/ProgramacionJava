package POO_avanzada.BlocNotas.notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable {

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO=5;
	private int minutosRepetir;
	private boolean activado;
	
	
	public NotaAlarma(String texto) throws Exception {
		super(texto);
	}
	
	public NotaAlarma (String texto, LocalDateTime fechaAlarma, boolean activado) throws Exception {
		this(texto);
		this.activado=activado;
		this.fechaAlarma=fechaAlarma;
		this.minutosRepetir=MINUTOS_REPETIR_POR_DEFECTO;
	}

	public NotaAlarma (String texto, LocalDateTime fechaAlarma, int minutosRepetir) throws Exception {
		this(texto);
		this.activado=true;
		this.fechaAlarma=fechaAlarma;
		this.minutosRepetir=minutosRepetir;
	}
	
	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma=fechaAlarma;
	}
	
	public static int getMINUTOS_REPETIR_POR_DEFECTO() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public void activar() {
		this.activado=true;
	}
	
	public void desactivar() {
		this.activado=false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}
	
	public String toString() {
		return super.toString()+"\nFecha larma: "+this.fechaAlarma+"\nActivado: "+this.activado+"\nRepetir cada: "+this.minutosRepetir+"min";
	}
	
	
}
