package clases;

public class Maestro extends Persona {
	private int codigoEmpleado;
	private double sueldo;
	public Maestro(
		String nombre,
		String apellido,
		int edad,
		String genero,
		String carrera,
		String identidad,
		String telefono,
		String correo,
		int codigoEmpleado,
		double sueldo
	) {
		super(nombre, apellido, edad, genero, carrera, identidad, telefono, correo);
		this.codigoEmpleado = codigoEmpleado;
		this.sueldo = sueldo;
	}
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Maestro [codigoEmpleado=" + codigoEmpleado + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", genero=" + genero + ", carrera=" + carrera + ", identidad="
				+ identidad + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	@Override
	public void reprobar() {
		System.out.println("Metodo reprobar desde la clase Maestro");
	}
}
