package clases;

public class Producto {
	private String codigoProducto;
	private String nombreProducto;
	private double precioCompra;
	private double precioVenta;
	private double cantidadExistencia;
	private Marca marca;
	public Producto(String codigoProducto, String nombreProducto, double precioCompra, double precioVenta,
			double cantidadExistencia, Marca marca) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.cantidadExistencia = cantidadExistencia;
		this.marca = marca;
	}

	public Producto(){}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getCantidadExistencia() {
		return cantidadExistencia;
	}
	public void setCantidadExistencia(double cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + ", cantidadExistencia=" + cantidadExistencia
				+ ", marca=" + marca + "]";
	}
}
