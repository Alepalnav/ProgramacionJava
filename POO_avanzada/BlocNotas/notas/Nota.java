package POO_avanzada.BlocNotas.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota {

	private static int codigoSiguiente = 0;
	private int codigo = 0;
	private String texto = "";
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) throws Exception {
		super();
		if(texto!=null) {
			this.texto=texto;
			this.codigo=codigoSiguiente++;
			this.fechaCreacion=LocalDateTime.now();
			this.fechaUltimaModificacion=this.fechaCreacion;
		}else {
			throw new Exception("NotaCrationException");
		}
	}

	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCodigo() {
		return codigo;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean is_Modificado() {
		return !fechaCreacion.equals(fechaUltimaModificacion);
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.isBefore(nota.fechaCreacion);
	}
	
	public boolean isModificadoAnterior(Nota nota) {
		return this.fechaUltimaModificacion.isBefore(nota.fechaUltimaModificacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Nota) {
			sonIguales = this.texto.equals(((Nota)obj).texto);
		}
		
		return sonIguales;
	}
	
	public int compareTo(Nota nota) {
		return this.codigo==nota.codigo?
				this.fechaCreacion.compareTo(nota.fechaCreacion):
					this.codigo-nota.codigo
				;
	}

}
