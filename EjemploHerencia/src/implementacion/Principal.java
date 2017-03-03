package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Maestro;
import clases.Persona;

public class Principal {
	private ArrayList<Persona> personas;
	public Principal(){
		personas = new ArrayList<Persona>();

		Alumno a1 = new Alumno("Juan","Perez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com","2001212");
		Alumno a2 = new Alumno("Pedro","Perez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com","2001212");
		Alumno a3 = new Alumno("Maria","Perez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com","2001212");
		Maestro m1 = new Maestro("Luis","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com",34534,34534.34);
		Maestro m2 = new Maestro("Jorge","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com",34534,34534.34);
		Maestro m3 = new Maestro("Jose","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com",34534,34534.34);
		Persona p1 = new Persona("Ana","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com");
		Persona p2 = new Persona("Matusalen","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com");
		Persona p3 = new Persona("Rigoberto","Rodriguez",55,"M","Ing Sistemas","0801456545","45454540","juan@gmail.com");

		personas.add(p1);
		personas.add(a1);
		personas.add(p2);
		personas.add(m3);
		personas.add(p3);
		personas.add(m1);
		personas.add(a2);
		personas.add(a3);		
		personas.add(m2);
		
		//a.toString()
		/*System.out.println(a.toString());
		System.out.println(m.toString());
		a.aprobar(34);*/

		// objeto instanceof Clase
		System.out.println("Alumnos");
		for(int i = 0;i<personas.size();i++){
			if (personas.get(i) instanceof Alumno)
				System.out.println(personas.get(i).toString());
		}
		
		System.out.println("Maestros");
		for(int i = 0;i<personas.size();i++){
			if (personas.get(i) instanceof Maestro)
				System.out.println(personas.get(i).toString());
		}
		

		System.out.println("Personas");
		for(int i = 0;i<personas.size();i++){
			if (!(personas.get(i) instanceof Alumno) && !(personas.get(i) instanceof Maestro))
				System.out.println(personas.get(i).toString());
		}
	}

	public static void main(String[] args) {
		new Principal();
	}

}
