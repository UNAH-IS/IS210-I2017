package clases;

public abstract class Persona{
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String genero;
	protected String carrera;
	protected String identidad;
	protected String telefono;
	protected String correo;

	public Persona(String nombre, String apellido, int edad, String genero, String carrera, String identidad,
			String telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.carrera = carrera;
		this.identidad = identidad;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Persona(){

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void aprobar(int parametro){
		System.out.println("Aprobar, este metodo es de la clase persona");
	}

	public abstract void reprobar();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", carrera=" + carrera + ", identidad=" + identidad + ", telefono=" + telefono + ", correo=" + correo
				+ "]";
	}
}
