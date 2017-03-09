package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso {
	private String nombreCurso;
	private String descripcion;
	private Usuario instructor;
	private ArrayList<Usuario> estudiantes=new ArrayList<Usuario>();
	private int cuposDisponible;
	public Curso(String nombreCurso, String descripcion, Usuario instructor, ArrayList<Usuario> estudiantes,
			int cuposDisponible) {
		this.nombreCurso = nombreCurso;
		this.descripcion = descripcion;
		this.instructor = instructor;
		this.estudiantes = estudiantes;
		this.cuposDisponible = cuposDisponible;

	}

	public Curso(){

	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getInstructor() {
		return instructor;
	}

	public void setInstructor(Usuario instructor) {
		this.instructor = instructor;
	}

	public ArrayList<Usuario> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Usuario> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public int getCuposDisponible() {
		return cuposDisponible;
	}

	public void setCuposDisponible(int cuposDisponible) {
		this.cuposDisponible = cuposDisponible;
	}

	public boolean verificarCuposDisponibles(){
		if (this.estudiantes.size()>=cuposDisponible)
			return false;
		else
			return true;
	}

	public void solicitarInformacion(){
		this.nombreCurso = JOptionPane.showInputDialog("Nombre curso: ");
		this.descripcion = JOptionPane.showInputDialog("Descripción curso: ");
		this.instructor = new Usuario();
		this.instructor.solicitarInformacion();
		this.cuposDisponible = Integer.parseInt(JOptionPane.showInputDialog("Cupos: "));
	}

	public void agregarEstudiante(Usuario e){
		if (verificarCuposDisponibles())
			this.estudiantes.add(e);
		else
			JOptionPane.showMessageDialog(null, "No hay cupos disponibles");
	}
	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", descripcion=" + descripcion + ", instructor=" + instructor
				+ ", estudiantes=" + estudiantes + ", cuposDisponible=" + cuposDisponible + "]";
	}
}
