package Tema2.Ej1.model;

public class Avion {

	private String idAvion;
	private int capacidad;
	private int numVuelos;
	private int kmVolados;
	private String compania;
	
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}

	public Avion(String idAvion, int capacidad, String compania) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.compania = compania;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	

	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public int getKmVolados() {
		return kmVolados;
	}
	
	public double getTotalKm() {
		return this.kmVolados;
	}
	
	public double getMediaKm() {
		return getNumVuelos()>0? getTotalKm()/getNumVuelos(): getNumVuelos();
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", capacidad=" + capacidad + ", numVuelos=" + numVuelos + ", kmVolados="
				+ kmVolados + ", compania=" + compania + ", getMediaKm()=" + getMediaKm() + "]";
	}

	public boolean asignarVuelo(Integer numeroAsientos, int kmsVuelo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	
	
	
}

