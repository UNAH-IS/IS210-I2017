package implementacion;
import clases.Fecha;
import clases.Usuario;
import clases.Archivo;
import java.util.Scanner;

public class Controlador {

// Campos	
	
	private Archivo[] arregloarchivo;
	private Usuario usuario;
	private Usuario[] arreglousuario;
	private Fecha fecha;
	private boolean seguir;
	private int decision;
	private Scanner entrada = new Scanner(System.in);
	
// Constructor
	
	public Controlador(){
		
		// Inicio
		
			mostrarBienvenida();
			
		// Inicializacion de datos
			
			System.out.print("Ingrese el numero de archivos a subir: ");
			decision = entrada.nextInt();
			arregloarchivo = new Archivo[decision];
			System.out.println();
			
			for(int i = 0; i < arregloarchivo.length; i++){
				arregloarchivo[i] = new Archivo();	
				ingresarDatosArchivo(i);
			}
			
		// Menu
			do{
			mostrarMenu();
			decision = entrada.nextInt();
			opciones(decision);
			}
			while (seguir == false);
	
		// Fin
			
			System.out.println("Gracias por su preferencia");
			
	}
	
// Metodos
	
	private void mostrarBienvenida(){
		System.out.println("¡BIENVENIDO A DROPBOX!\n..................\n");
		System.out.println("Dropbox es una aplicacion que le permitira distribuir informacion "
				+ "con todos sus amigos, no importa la distancia que los separe "
				+ "basta un click, y Dropbox se lo hara llegar.");
	}
	
	private void ingresarDatosUsuario(Usuario usuario){
		
		System.out.print("Nombre: ");
		usuario.setNombre(entrada.next());
		do{
		System.out.print("Correo: ");
		if(usuario.setCorreo(entrada.next()))
			seguir = true;
		else
			seguir = false;
		}
		while(seguir == false);
		
		this.usuario = usuario;
	} // Fin del Metodo ingresarDatosUsuario
	
	private void ingresarDatosEmisor(Archivo archivo){
		System.out.println("A continuacion debera ingresar sus datos personales.");
		ingresarDatosUsuario(usuario);
		archivo.setEmisorArchivo(this.usuario);
	} // Fin del metodo ingresarDatosEmisor
	
	private void ingresarDatosReceptor(Archivo archivo){
		do{
			System.out.print("¿Con cuantas personas compartira este archivo?(Maximo 5): ");
			decision = entrada.nextInt();
		}
		while(decision > 5);
		
		arreglousuario = new Usuario[decision];
		for(int i = 0; i < decision; i++)
			ingresarDatosUsuario(arreglousuario[i]);
		archivo.setReceptorArchivo(arreglousuario);			
	} // Fin del metodo ingresarDatosReceptor
	
	private void ingresarDatosFecha(Fecha fecha){
		do{
		System.out.print("fecha(DD/MM/AAAA): ");
		String input = entrada.next();
		this.fecha = new Fecha(input);
		
		if(this.fecha.verificarFecha(input) == true)
			seguir = true;
		else
			seguir = false;
		}
		while(seguir == false);
	}
	
	private void ingresarDatosFechaMod(Archivo archivo){
		System.out.print("Ultima fecha de modificacion: ");
		ingresarDatosFecha(fecha);
		archivo.setFechamodArchivo(fecha);
	}
	
	private void ingresarDatosFechaSub(Archivo archivo){
		System.out.print("Fecha en la cual se subio el archivo:");
		ingresarDatosFecha(fecha);
		archivo.setFechasubArchivo(fecha);
	}
	
	private void ingresarDatosCarpeta(Archivo archivo){
		System.out.print("Ubicacion de la carpeta del archivo: ");
		archivo.setCarpetaArchivo(entrada.next());
	}
	
	private void ingresarDatosTamaño(Archivo archivo){
		do{
		System.out.print("Tamaño del archivo(en Bytes, no superar 500 mb): ");
		if(archivo.setTamañoArchivo(entrada.nextInt()))
			seguir = true;
		else 
			seguir = false;
		}
		while(seguir == false);
	}
	
	private void ingresarDatosNombreArchivo(Archivo archivo){
		do{
			System.out.print("Nombre del archivo con su extension(no se permiten .exe o .bat): ");
			if(archivo.setNombreArchivo(entrada.next()))
				seguir = true;
			else
				seguir = false;
		}
		while(seguir == false);
	}
	
	private void ingresarDatosArchivo(int i){
		System.out.println("Debe llenar la siguiente informacion para cada archivo...");
		ingresarDatosEmisor(arregloarchivo[i]);
		ingresarDatosReceptor(arregloarchivo[i]);
		ingresarDatosFechaSub(arregloarchivo[i]);
		ingresarDatosFechaMod(arregloarchivo[i]);
		ingresarDatosCarpeta(arregloarchivo[i]);
		ingresarDatosTamaño(arregloarchivo[i]);
		ingresarDatosNombreArchivo(arregloarchivo[i]);	
	}

	private void mostrarMenu(){
		System.out.print("1.Mostrar Informacion/n2.Salir");
	}
	
	private void opciones(int decision){
		switch(decision){
		
		case 1: 
			mostrarDatos();
			seguir = false;
			break;
		case 2: 
			seguir = true;
			break;
		default:
			seguir = false;
			break;
		}
	}
	
	private void mostrarDatos(){
		for(int i = 0; i < arregloarchivo.length; i++){
			System.out.print("Emisor: ");
			arregloarchivo[i].getEmisorArchivo().getNombre();
		}
	}
	
	public static void main(String[] args) {

		new Controlador();
	}

}
