package clases;

public class Telefono {
	private String numero;
	private String marca;
	private String modelo;
	private String color;
	private String resolucion;
	private String operadora;
	private double capacidadProcesador;
	private double capacidadMemoria;
	private double capacidadAlmacenamiento;
	public double definicionCamara;

	public static int atributoEstatico;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public double getCapacidadProcesador() {
		return capacidadProcesador;
	}

	public void setCapacidadProcesador(double capacidadProcesador) {
		this.capacidadProcesador = capacidadProcesador;
	}

	public double getCapacidadMemoria() {
		return capacidadMemoria;
	}

	public void setCapacidadMemoria(double capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}

	public double getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}

	public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}

	public void llamar(){
		System.out.println("Llamando desde mi super "+marca);
	}

	private void encender(){
		System.out.println("Encendiendo");
	}

	public void apagar(){
		System.out.println("Apagando");
	}

}
