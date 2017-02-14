package clases;

public class Usuario {
	private String nombreUsuario;
	private String correoElectronico;

	public Usuario(String nombreUsuario, String correoElectronico) {
		this.nombreUsuario = nombreUsuario;
		this.correoElectronico = correoElectronico;
	}

	public Usuario(){}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correoElectronico=" + correoElectronico + "]";
	}

	public void verificarCorreoElectronico(){}
}
