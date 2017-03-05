package clases;

public class Usuario {

// Campos	

	private String nombre;
	private String correo;
	
// Constructores

	public Usuario(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	} // Fin del Constructor 1

	public Usuario(){
		
	} // Fin del Constructor vacio

// Setters y Getters	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public boolean setCorreo(String correo) {
		if(verificarCorreo(correo)){
			this.correo = correo;
			return true;
		}
		else 
			return false;
	}
	
// Verificadores
	
	private boolean verificarCorreo(String correo){
		String[] tokencorreo = correo.split("@");
		if(tokencorreo.length == 2)
			return true;
		else 
			return false;
	} // Fin del metodo verificarCorreo
	
}
