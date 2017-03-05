package clases;

public class Fecha {

// Campos
	
	private int dia;
	private int mes;
	private int año;
	
// Constructores
	
	public Fecha(String fecha){
		int [] tokenfecha = divisionFecha(fecha);
		this.dia = tokenfecha[0];
		this.mes = tokenfecha[1];
		this.año = tokenfecha[2];
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



	public int getAño() {
		return año;
	}



	public void setAño(int año) {
		this.año = año;
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
	
	private boolean verificarAño(int año){
		if(año > 0)
			return true;
		else
			return false;
	} // Fin del metodo verificarAño
	
	public boolean verificarFecha(String fecha){
		int [] tokenfecha = divisionFecha(fecha);
		int dia = tokenfecha[0];
		int mes = tokenfecha[1];
		int año = tokenfecha[2];
		if(verificarDia(dia) && verificarMes(mes) && verificarAño(año))
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
