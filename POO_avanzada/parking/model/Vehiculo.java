package POO_avanzada.parking.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fecha;
	private Tipo tipo;
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fecha, Tipo tipo) {
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.combustible=combustible;
		this.fecha=fecha;
		this.tipo=tipo;
	}
	
	
	
	
	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public Combustible getCombustible() {
		return combustible;
	}




	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}




	public LocalDateTime getFecha() {
		return fecha;
	}




	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}




	public Tipo getTipo() {
		return tipo;
	}




	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}




	@Override
	public int hashCode() {
		return Objects.hash(combustible, fecha, marca, matricula, modelo, tipo);
	}


	@Override
	public boolean equals(Object obj) {
		boolean esIgual=this==obj;
		
		if(!esIgual && obj!=null && obj instanceof Vehiculo) {
			Vehiculo casteado = (Vehiculo) obj;
			esIgual = this.matricula.equals(casteado.matricula);
		}
		return esIgual;
	}




	public String toString() {
		return "marca="+marca+",modelo="+modelo+",matricula="+matricula+
				",combustible="+combustible+",fecha="+fecha+",tipo="+tipo;
	}
	
}
