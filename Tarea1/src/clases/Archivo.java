package clases;

import java.util.Arrays;

public class Archivo {
	private String nombreArchivo; //Incluye la extension
	private int tamanioBytes;
	private Usuario usuarioSubio; //Composición
	private Usuario[] usuariosCompartio;
	private String nombreCarpeta;
	private Fecha fechaModificacion;
	private Fecha fechaSubida;


	public Archivo(String nombreArchivo, int tamanioBytes, Usuario usuarioSubio, Usuario[] usuariosCompartio,
			String nombreCarpeta, Fecha fechaModificacion, Fecha fechaSubida) {
		this.nombreArchivo = nombreArchivo;
		this.tamanioBytes = tamanioBytes;
		this.usuarioSubio = usuarioSubio;
		this.usuariosCompartio = usuariosCompartio;
		this.nombreCarpeta = nombreCarpeta;
		this.fechaModificacion = fechaModificacion;
		this.fechaSubida = fechaSubida;
	}

	public Archivo(){}

	public String getNombreArchivo() {
		return nombreArchivo;
	}


	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}


	public int getTamanioBytes() {
		return tamanioBytes;
	}


	public void setTamanioBytes(int tamanioBytes) {
		this.tamanioBytes = tamanioBytes;
	}


	public Usuario getUsuarioSubio() {
		return usuarioSubio;
	}


	public void setUsuarioSubio(Usuario usuarioSubio) {
		this.usuarioSubio = usuarioSubio;
	}


	public Usuario[] getUsuariosCompartio() {
		return usuariosCompartio;
	}


	public void setUsuariosCompartio(Usuario[] usuariosCompartio) {
		this.usuariosCompartio = usuariosCompartio;
	}


	public String getNombreCarpeta() {
		return nombreCarpeta;
	}


	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}


	public Fecha getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Fecha fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public Fecha getFechaSubida() {
		return fechaSubida;
	}


	public void setFechaSubida(Fecha fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	@Override
	public String toString() {
		return "Archivo [nombreArchivo=" + nombreArchivo + ", tamanioBytes=" + tamanioBytes + ", usuarioSubio="
				+ usuarioSubio + ", usuariosCompartio=" + Arrays.toString(usuariosCompartio) + ", nombreCarpeta="
				+ nombreCarpeta + ", fechaModificacion=" + fechaModificacion + ", fechaSubida=" + fechaSubida + "]";
	}

	public void verificarTamanioArchivo(){}
	public void verificarExtensionArchivo(){}
}
