package clases;

public class Alumno extends Persona{
	private String cuenta;


	public Alumno(String nombre, String apellido, int edad, String genero, String carrera, String identidad,
			String telefono, String correo, String cuenta) {
		super(nombre, apellido, edad, genero, carrera, identidad,
			 telefono, correo);
		this.cuenta = cuenta;
	}

	public void matricular(){

	}

	public void imprimirNombreCompleto(){
		System.out.println(nombre + " " + apellido);
	}
}
