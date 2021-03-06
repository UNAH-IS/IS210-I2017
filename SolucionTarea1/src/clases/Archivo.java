package clases;

public class Archivo {

// Campos
	
	private String nombreArchivo;
	private int tamaņoArchivo;
	private Usuario emisorArchivo;
	private Usuario [] receptorArchivo;
	private String carpetaArchivo;
	private Fecha fechamodArchivo; // ultima fecha de modificacion
	private Fecha fechasubArchivo; // fecha de subida del archivo
	private final int MAXIMO_RECEPTORES = 5;
	
// Construtores
	
	public Archivo(String nombreArchivo, int tamaņoArchivo,
			Usuario emisorArchivo, Usuario[] receptorArchivo,
			String carpetaArchivo, Fecha fechamodArchivo, Fecha fechasubArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
		this.tamaņoArchivo = tamaņoArchivo;
		this.emisorArchivo = emisorArchivo;
		this.receptorArchivo = receptorArchivo;
		this.carpetaArchivo = carpetaArchivo;
		this.fechamodArchivo = fechamodArchivo;
		this.fechasubArchivo = fechasubArchivo;
	} // Fin del Constructor 1
	
	public Archivo(){
		
	} // Fin del Constructor vacio
	
// Setters y Getters

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public boolean setNombreArchivo(String nombrearchivo) {
		if(verificarNombreArchivo(nombrearchivo)){
			this.nombreArchivo = nombrearchivo;
			return true;
		}
		else
			return false;
	}

	public int getTamaņoArchivo() {
		return tamaņoArchivo;
	}

	public boolean setTamaņoArchivo(int tamaņoarchivo) {
		if(verificarTamaņoArchivo(tamaņoarchivo)){
			this.tamaņoArchivo = tamaņoarchivo;
			return true;
		}
		else
			return false;
	}

	public Usuario getEmisorArchivo() {
		return emisorArchivo;
	}

	public void setEmisorArchivo(Usuario emisorarchivo) {
		this.emisorArchivo = emisorarchivo;
	}

	public Usuario[] getReceptorArchivo() {
		return receptorArchivo;
	}

	public boolean setReceptorArchivo(Usuario[] receptorarchivo) {
		if(verificarReceptorArchivo(receptorarchivo)){
			this.receptorArchivo = receptorarchivo;
			return true;
		}
		else return false;
	}

	public String getCarpetaArchivo() {
		return carpetaArchivo;
	}

	public void setCarpetaArchivo(String carpetaarchivo) {
		this.carpetaArchivo = carpetaarchivo;
	}

	public Fecha getFechamodArchivo() {
		return fechamodArchivo;
	}

	public void setFechamodArchivo(Fecha fechamodarchivo) {
		this.fechamodArchivo = fechamodarchivo;
	}

	public Fecha getFechasubArchivo() {
		return fechasubArchivo;
	}

	public void setFechasubArchivo(Fecha fechasubarchivo) {
		this.fechasubArchivo = fechasubarchivo;
	}
	
// Verificadores
	
	private boolean verificarTamaņoArchivo(int tamaņoarchivo){
		if(tamaņoarchivo <= (1024*500))
			return true;
		else
			return false;
	} // Fin del metodo verificarTamaņoArchivo
	
	private boolean verificarNombreArchivo(String nombrearchivo){
		String [] tokennombrearchivo = tokenNombreArchivo(nombrearchivo);
		String extension = tokennombrearchivo[1];
		if(extension.equals("bat"))
			return false;
		if(extension.equals("exe"))
			return false;
		else 
			return true;
	} // Fin del metodo verificarNombreArchivo
	
	private boolean verificarReceptorArchivo(Usuario[] receptorarchivo){
		if(receptorarchivo.length <= this.MAXIMO_RECEPTORES)
			return true;
		else
			return false;
	}
	
	
// Metodos Impropios
	
	public String[] tokenNombreArchivo(String nombrearchivo){
		String [] tokennombrearchivo = nombrearchivo.split("\\.");
		return tokennombrearchivo;
	}
	
}
