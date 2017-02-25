package clases;

import javax.swing.JOptionPane;

public class MetodosString {
	public MetodosString(){
		String mensaje = JOptionPane.showInputDialog("Ingrese un mensaje:");
		System.out.println( "Mensaje ingresado: "+ mensaje);
		System.out.println( "Cantidad caracteres: "+ mensaje.length());
		System.out.println( "Primera aparicion de la letra o: "+ mensaje.indexOf("o"));
		System.out.println( "Ultima aparicion de la letra o: "+ mensaje.lastIndexOf("o"));
		System.out.println( "Caracter que esta en la posicion 9: "+ mensaje.charAt(9));
		System.out.println( "Subcadena entre las posiciones 1 y 9: "+ mensaje.substring(1,9));
		System.out.println( "Mensaje en mayusculas: "+ mensaje.toUpperCase());
		System.out.println( "Mensaje en minusculas: "+ mensaje.toLowerCase());
		System.out.println( "Comparar cadenas: "+ mensaje.equals("Hola que ondas"));
		System.out.println( "Comparar cadenas: "+ (mensaje == "Hola que ondas")); //Nunca utilizar == para comparar objetos.
		System.out.println( "Comparar cadenas: "+ mensaje.equalsIgnoreCase("HolA Que Ondas"));
		System.out.println( "De double a cadena: "+ String.valueOf(3.4d));
		System.out.println( "Eliminar espacios al principio y al final: "+ mensaje.trim());
		String partes[] = mensaje.split(" "); // \\.
		System.out.println("Cantidad de partes: "+ partes.length);
		for (int i = 0;i<partes.length;i++)
			System.out.println("Parte "+i+": "+ partes[i]);

		System.out.println(mensaje.concat(" <----- Este es el mensaje"));
		System.out.println("El mensaje contiene la palabra Hola?: " + mensaje.contains("Hola"));

		String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo y su extension separado de un punto");
		partes = nombreArchivo.split("\\.");
		if (partes[1].equals("exe") || partes[1].equals("bat"))
			System.out.println("No se permiten archivos con extension .exe o .bat");

	}
	public static void main(String[] args) {
		new MetodosString();
	}

}
