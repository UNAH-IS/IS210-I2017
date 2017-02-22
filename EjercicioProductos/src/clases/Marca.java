package clases;

import javax.swing.JOptionPane;

public class Marca {
	private int codigoMarca;
	private String nombreMarca;
	private String pais;

	public Marca(int codigoMarca, String nombreMarca, String pais) {
		this.codigoMarca = codigoMarca;
		this.nombreMarca = nombreMarca;
		this.pais = pais;
	}

	public Marca(){}

	public int getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(int codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Marca [codigoMarca=" + codigoMarca + ", nombreMarca=" + nombreMarca + ", pais=" + pais + "]";
	}

	public void solicitarInformacion(){
		this.codigoMarca = Integer.parseInt(JOptionPane.showInputDialog("Codigo Marca: ",this.codigoMarca));
		this.nombreMarca = JOptionPane.showInputDialog("Marca: ",this.nombreMarca);
		this.pais = JOptionPane.showInputDialog("Pais Marca: ",this.pais);
	}
}
