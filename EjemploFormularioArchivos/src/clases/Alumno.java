package clases;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellido;
	private String genero;
	private Carrera carrera;
	private ArrayList<String> jornadas;
	public Alumno(String nombre, String apellido, String genero, Carrera carrera, ArrayList<String> jornadas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.carrera = carrera;
		this.jornadas = jornadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public ArrayList<String> getJornadas() {
		return jornadas;
	}
	public void setJornadas(ArrayList<String> jornadas) {
		this.jornadas = jornadas;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", carrera=" + carrera
				+ ", jornadas=" + jornadas + "]";
	}

	public String toCSV(){
		String strJornadas = "";
		for(int i=0; i<this.jornadas.size();i++)
			strJornadas+=jornadas.get(i)+":";
		return nombre + "," + apellido + "," + genero + "," + carrera.toCSV()
				+ "," + strJornadas;
	}
}
