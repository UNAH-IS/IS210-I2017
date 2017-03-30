package clases;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Formulario implements ActionListener{
	private JFrame ventana;
	private JTextField txtNombre;
	private JTextField txtApellido;

	private JRadioButton rbtFemenino;
	private JRadioButton rbtMasculino;
	private ButtonGroup btngGeneros;

	private JCheckBox chkMatutina;
	private JCheckBox chkVespertina;
	private JCheckBox chkNocturna;

	private JComboBox<Carrera> cmbCarrera;

	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblGenero;
	private JLabel lblCarrera;
	private JLabel lblJornada;

	private JButton btnGuardar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JButton btnNuevo;
	private JButton btnSeleccionar;

	private JTextArea txtaInformacion;
	private JScrollPane scrollInformacion;

	private ArrayList<Alumno> alumnos;

	public Formulario(){
		alumnos = new ArrayList<Alumno>();
		inicializarVentana();
		inicializarComponentes();
		ventana.setVisible(true);
	}

	public void inicializarVentana(){
		ventana = new JFrame("Formulario");
		ventana.setSize(500,620);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);//Utilizar un esquema en base a coordenadas

	}

	public void inicializarComponentes(){
		//Crear instancias
		txtNombre = new JTextField();
		lblNombre = new JLabel("Nombre: ");
		txtApellido = new JTextField();
		lblApellido = new JLabel("Apellido: ");
		lblGenero = new JLabel("Genero: ");
		rbtFemenino = new JRadioButton("Femenino");
		rbtMasculino= new JRadioButton("Masculino");
		cmbCarrera = new JComboBox<Carrera>();
		lblCarrera = new JLabel("Carrera: ");
		lblJornada = new JLabel("Jornada: ");
		chkMatutina = new JCheckBox("Matutina");
		chkVespertina = new JCheckBox("Vespertina");
		chkNocturna = new JCheckBox("Nocturna");
		btnGuardar = new JButton("Guardar");
		btnActualizar = new JButton("Actualizar");
		btnEliminar = new JButton("Eliminar");
		btnSalir = new JButton("Salir");
		btnNuevo = new JButton("Nuevo");
		btnSeleccionar = new JButton("Seleccionar");
		txtaInformacion = new JTextArea();
		scrollInformacion = new JScrollPane(txtaInformacion);

		btngGeneros = new ButtonGroup();
		btngGeneros.add(rbtFemenino);
		btngGeneros.add(rbtMasculino);

		eventos();
		agregarCarreras();

		//Definir propiedades
		txtNombre.setBounds(100, 20, 200, 30);
		lblNombre.setBounds(20, 20, 80, 30);
		txtApellido.setBounds(100, 60, 200, 30);
		lblApellido.setBounds(20, 60, 80, 30);
		lblGenero.setBounds(20, 100, 80, 30);
		rbtFemenino.setBounds(100, 100, 80, 30);
		rbtMasculino.setBounds(190, 100, 90, 30);
		lblCarrera.setBounds(20, 140, 80, 30);
		cmbCarrera.setBounds(100, 140, 150, 25);
		lblJornada.setBounds(20, 180, 80, 30);
		chkMatutina.setBounds(100, 180, 90, 30);
		chkVespertina.setBounds(190, 180, 90, 30);
		chkNocturna.setBounds(290, 180, 90, 30);
		btnGuardar.setBounds(20,230,90,25);
		btnActualizar.setBounds(120,230,100,25);
		btnEliminar.setBounds(230,230,90,25);
		btnSalir.setBounds(335,230,90,25);
		btnNuevo.setBounds(20,260,90,25);
		btnSeleccionar.setBounds(120,260,90,25);
		scrollInformacion.setBounds(20,300,435,260);

		//Alinear a la derecha
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCarrera.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJornada.setHorizontalAlignment(SwingConstants.RIGHT);

		txtaInformacion.setEditable(false);

		//Agregar componentes a la ventana:
		ventana.add(txtNombre);
		ventana.add(lblNombre);
		ventana.add(txtApellido);
		ventana.add(lblApellido);
		ventana.add(lblGenero);
		ventana.add(rbtFemenino);
		ventana.add(rbtMasculino);
		ventana.add(lblCarrera);
		ventana.add(cmbCarrera);
		ventana.add(lblJornada);
		ventana.add(chkMatutina);
		ventana.add(chkVespertina);
		ventana.add(chkNocturna);
		ventana.add(btnGuardar);
		ventana.add(btnActualizar);
		ventana.add(btnEliminar);
		ventana.add(btnSalir);
		ventana.add(btnNuevo);
		ventana.add(btnSeleccionar);
		ventana.add(scrollInformacion);


	}

	public void eventos(){
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarRegistro();
			}
		});

		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarRegistro();
			}
		});

		btnActualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarRegistro();
			}
		});

		btnSeleccionar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				seleccionarAlumno();
			}
		});
		btnSalir.addActionListener(this);

		btnNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nuevoRegistro();
			}
		});
	}

	public void guardarRegistro(){
		//System.out.println("Nombre: " + txtNombre.getText());
		String genero =  "";
		if (rbtFemenino.isSelected())
			genero = "Femenino";
		else if (rbtMasculino.isSelected())
			genero = "Masculino";
		else
			genero = "Sin genero";


		ArrayList<String> jornadasSeleccionadas = new ArrayList<String>();
		if (chkMatutina.isSelected())
			jornadasSeleccionadas.add("Matutina");

		if (chkVespertina.isSelected())
			jornadasSeleccionadas.add("Vespertina");

		if (chkNocturna.isSelected())
			jornadasSeleccionadas.add("Nocturna");

		alumnos.add(new Alumno(
					txtNombre.getText(),
					txtApellido.getText(),
					genero,
					(Carrera)cmbCarrera.getSelectedItem(),
					jornadasSeleccionadas
				)
		);

		mostrarInformacion();
	}

	public void actualizarRegistro(){
		int indice = Integer.parseInt(JOptionPane.showInputDialog("¿Que registro desea actualizar? (0-"+(alumnos.size()-1)+")"));
		String genero =  "";
		if (rbtFemenino.isSelected())
			genero = "Femenino";
		else if (rbtMasculino.isSelected())
			genero = "Masculino";
		else
			genero = "Sin genero";


		ArrayList<String> jornadasSeleccionadas = new ArrayList<String>();
		if (chkMatutina.isSelected())
			jornadasSeleccionadas.add("Matutina");

		if (chkVespertina.isSelected())
			jornadasSeleccionadas.add("Vespertina");

		if (chkNocturna.isSelected())
			jornadasSeleccionadas.add("Nocturna");

		alumnos.set(indice, new Alumno(
				txtNombre.getText(),
				txtApellido.getText(),
				genero,
				(Carrera)cmbCarrera.getSelectedItem(),
				jornadasSeleccionadas
			)
		);

		mostrarInformacion();

	}

	public void seleccionarAlumno(){
		int indice = Integer.parseInt(JOptionPane.showInputDialog("¿Que registro desea seleccionar? (0-"+(alumnos.size()-1)+")"));
		Alumno a = alumnos.get(indice);
		txtNombre.setText(a.getNombre());
		txtApellido.setText(a.getApellido());
		if (a.getGenero().equals("Femenino"))
			rbtFemenino.setSelected(true);
		if (a.getGenero().equals("Masculino"))
			rbtMasculino.setSelected(true);

		cmbCarrera.setSelectedItem(a.getCarrera());

		chkMatutina.setSelected(a.getJornadas().contains("Matutina"));
		chkVespertina.setSelected(a.getJornadas().contains("Vespertina"));
		chkNocturna.setSelected(a.getJornadas().contains("Nocturna"));
		/*if(a.getJornadas().contains("Matutina"))
			chkMatutina.setSelected(true);
		else
			chkMatutina.setSelected(false);

		if(a.getJornadas().contains("Vespertina"))
			chkVespertina.setSelected(true);
		else
			chkVespertina.setSelected(false);

		if(a.getJornadas().contains("Nocturna"))
			chkNocturna.setSelected(true);
		else
			chkNocturna.setSelected(false);*/
	}

	public void eliminarRegistro(){
		int indice = Integer.parseInt(JOptionPane.showInputDialog("¿Que registro desea eliminar? (0-"+(alumnos.size()-1)+")"));
		alumnos.remove(indice);
		mostrarInformacion();
	}

	public void nuevoRegistro(){
		txtNombre.setText(null);
		txtApellido.setText(null);
		btngGeneros.clearSelection();
		chkMatutina.setSelected(false);
		chkVespertina.setSelected(false);
		chkNocturna.setSelected(false);
		cmbCarrera.setSelectedItem(null);
	}

	public void mostrarInformacion(){
		txtaInformacion.setText(null);
		for(int i=0;i<alumnos.size();i++)
			txtaInformacion.append(alumnos.get(i).toString()+"\n");
	}

	public void agregarCarreras(){
		cmbCarrera.addItem(new Carrera(115,"Ing. en Sistemas"));
		cmbCarrera.addItem(new Carrera(116,"Ing. Quimica"));
		cmbCarrera.addItem(new Carrera(117,"Ing. Industrial"));
		cmbCarrera.addItem(new Carrera(118,"Ing. Mecanica"));
		cmbCarrera.addItem(new Carrera(119,"Ing. Electrica"));
	}
	public static void main(String[] args) {
		new Formulario();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).getText() == "Salir")
			System.exit(0);
	}
}
