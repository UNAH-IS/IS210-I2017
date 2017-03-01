package implementacion;

import clases.Alumno;

public class Principal {

	public Principal(){
		Alumno a = new Alumno("Juan","Perez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com","2001212");
		System.out.println(a.toString());
	}

	public static void main(String[] args) {
		new Principal();
	}

}
