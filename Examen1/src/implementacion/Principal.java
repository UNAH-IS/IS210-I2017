package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Curso;
import clases.Usuario;

public class Principal {
	private ArrayList<Curso> cursos;
	public Principal(){
		cursos = new ArrayList<Curso>();
		int opcion =0;
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog("0 Salir.\n"
					+ "1 Agregar un curso.\n"
					+ "2 Eliminar un curso.\n"
					+ "3 Agregar estudiante a un curso.\n"
					+ "4 Mostrar la lista de estudiantes de un curso.\n"
					+ "5 Mostrar cursos.\n"));

			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			case 1:
				agregarCurso();
				break;
			case 2:
				eliminarCurso();
				break;
			case 3:
				agregarEstudiante();
				break;
			case 4:
				mostrarEstudiantes();
				break;
			case 5:
				mostrarCursos();
				break;
			default:
				break;
			}
		}while(opcion != 0);
	}

	public void agregarCurso(){
		Curso c = new Curso();
		c.solicitarInformacion();
		cursos.add(c);
	}
	public void eliminarCurso(){
		int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("¿Que curso desea eliminar?"));
		cursos.remove(indiceEliminar);
	}
	public void agregarEstudiante(){
		int indiceCurso= Integer.parseInt(JOptionPane.showInputDialog("¿En que curso desea agregar el estudiante?"));
		Usuario u = new Usuario();
		u.solicitarInformacion();
		//cursos.get(indiceCurso).getEstudiantes().add(u);
		cursos.get(indiceCurso).agregarEstudiante(u);

	}

	public void mostrarEstudiantes(){
		int indiceCurso= Integer.parseInt(JOptionPane.showInputDialog("¿De que curso desea mostrar los estudiantes?"));
		String estudiantes="";
		for(int i=0;i<this.cursos.get(indiceCurso).getEstudiantes().size() ;i++){
			estudiantes+=this.cursos.get(indiceCurso).getEstudiantes().get(i).toString();
		}

		JOptionPane.showMessageDialog(null, estudiantes);
	}

	public void mostrarCursos(){
		String cursos="";
		for (int i=0;i<this.cursos.size();i++){
			cursos+=this.cursos.get(i).toString()+"\n";
		}

		JOptionPane.showMessageDialog(null, cursos);
	}

	public static void main(String[] args) {
		new Principal();
	}


}
