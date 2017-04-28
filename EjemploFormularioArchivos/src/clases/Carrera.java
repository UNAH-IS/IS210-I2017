package clases;

public class Carrera {
	private int codigoCarrera;
	private String nombreCarrera;
	public Carrera(int codigoCarrera, String nombreCarrera) {
		super();
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
	}
	public int getCodigoCarrera() {
		return codigoCarrera;
	}
	public void setCodigoCarrera(int codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	@Override
	public String toString() {
		return nombreCarrera;
	}

	public String toCSV(){
		return codigoCarrera +","+nombreCarrera;
	}
}
