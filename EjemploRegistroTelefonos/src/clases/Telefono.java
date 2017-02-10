package clases;
//Plain Old Java Object (POJO, Java Bean)
//Atributos encapsulados (atributos private y metodos set y get)
//Constructor por defecto (Recibe todos los atributos como parametros para inicializarlos)
//Constructor vacio
//Un metodo toString (Para retornar todo el objeto como cadena).
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

	public Telefono(
			String numero,
			String marca,
			String modelo,
			String color,
			String resolucion,
			String operadora,
			double capacidadProcesador,
			double capacidadMemoria,
			double capacidadAlmacenamiento,
			double definicionCamara
	) {
		this.numero = numero;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.resolucion = resolucion;
		this.operadora = operadora;
		this.capacidadProcesador = capacidadProcesador;
		this.capacidadMemoria = capacidadMemoria;
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
		this.definicionCamara = definicionCamara;
	}

	public Telefono(){}

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
		return this.modelo;
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

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", resolucion=" + resolucion + ", operadora=" + operadora + ", capacidadProcesador="
				+ capacidadProcesador + ", capacidadMemoria=" + capacidadMemoria + ", capacidadAlmacenamiento="
				+ capacidadAlmacenamiento + ", definicionCamara=" + definicionCamara + "]";
	}


}
