package clases;

import javax.swing.JOptionPane;

public class Usuario {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String correo;
	private String paginaWeb;
	private String telefono;
	public Usuario(String nombre, String apellido, int edad, String genero, String correo, String paginaWeb,
			String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
		this.paginaWeb = paginaWeb;
		this.telefono = telefono;
	}

	public Usuario(){}

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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean verificarPaginaWeb(){
		String partes[] = this.paginaWeb.split("//.");
		if (partes.length!=3)
			return false;
		if (!partes[0].equals("http://www"))
			return false;
		if (!partes[2].equals("com"))
			return false;

		return true;
	}

	public boolean verificarGenero(){
		if (this.genero.equals("M") || this.genero.equals("F"))
			return true;
		else
			return false;
	}

	public boolean verificarTelefono(){
		String partes[] = this.telefono.split("-");
		if (partes[0].length() != 4 || partes[1].length() != 4)
			return false;
		else
			return true;
	}

	public void solicitarInformacion(){
		this.nombre = JOptionPane.showInputDialog("Nombre: ");
		this.apellido = JOptionPane.showInputDialog("Apellido");
		this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
		this.genero = JOptionPane.showInputDialog("Genero");
		this.correo = JOptionPane.showInputDialog("Correo");
		this.paginaWeb = JOptionPane.showInputDialog("Pagina web");
		this.telefono = JOptionPane.showInputDialog("Telefono");
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", correo=" + correo + ", paginaWeb=" + paginaWeb + ", telefono=" + telefono + "]";
	}
}
