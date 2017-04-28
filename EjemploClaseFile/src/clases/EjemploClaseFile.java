package clases;

import java.io.File;
import java.io.IOException;

public class EjemploClaseFile {
	public EjemploClaseFile(){
		File f = new File("C:\\Prueba\\otraCarpeta");
		File g = new File("C:\\Prueba\\HolaMundo.java");
		/*if (f.isFile())
			System.out.println("Si es un archivo");*/

		if(f.exists())
			System.out.println("Directorio si existe");
		else{
			System.out.println("Directorio NO existe");
			f.mkdir();
		}

		if (g.exists())
			System.out.println("Archivo si existe");
		else{
			System.out.println("Archivo no existe");
			try {
				g.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println(g.getAbsoluteFile());
		System.out.println(g.getAbsolutePath());
		System.out.println(g.getName());
		System.out.println(g.getParent());
		System.out.println(g.length());


		File raiz = new File("C:\\");
		String listaDetalle[] = raiz.list();
		for(int i =0;i<listaDetalle.length;i++)
			System.out.println(listaDetalle[i]);


		/*for (int i = 0; i< 1000;i++){
			File archivo = new File("directorio"+i);
				archivo.mkdir();
		}*/
	}

	public static void main(String[] args) {
		new EjemploClaseFile();

	}

}
