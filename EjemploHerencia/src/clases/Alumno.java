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

	@Override
	public void aprobar(int p){
		super.aprobar(p);
		System.out.println("Aprobar, este metodo es de la clase Alumno");
	}

	@Override
	public String toString(){
		return "Alumno: "+super.toString() + ", Cuenta: " + this.cuenta;
	}
}
