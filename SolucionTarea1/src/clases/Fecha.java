package clases;

public class Fecha {

// Campos
	
	private int dia;
	private int mes;
	private int a�o;
	
// Constructores
	
	public Fecha(String fecha){
		int [] tokenfecha = divisionFecha(fecha);
		this.dia = tokenfecha[0];
		this.mes = tokenfecha[1];
		this.a�o = tokenfecha[2];
	}
	
// Setters y Getters
	
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getA�o() {
		return a�o;
	}



	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

// Verificadores
	
	private boolean verificarDia(int dia){
		if(dia > 0 && dia <= 31)
			return true;
		else
			return false;
	} // Fin del metodo verificarDia
	
	private boolean verificarMes(int mes){
		if(mes > 0 && mes <= 12)
			return true;
		else
			return false;
	} // Fin del metodo verificarMes
	
	private boolean verificarA�o(int a�o){
		if(a�o > 0)
			return true;
		else
			return false;
	} // Fin del metodo verificarA�o
	
	public boolean verificarFecha(String fecha){
		int [] tokenfecha = divisionFecha(fecha);
		int dia = tokenfecha[0];
		int mes = tokenfecha[1];
		int a�o = tokenfecha[2];
		if(verificarDia(dia) && verificarMes(mes) && verificarA�o(a�o))
			return true;
		else 
			return false;
	}

// Metodos impropias
	
	public int[] divisionFecha(String fecha){
		String[] tokenfecha = fecha.split("/");
		int[] divisionfecha = new int[tokenfecha.length];
		
		for(int i = 0; i < divisionfecha.length; i++)
		divisionfecha[i] = Integer.valueOf(tokenfecha[i]);
		
		return divisionfecha;
	}
}
