package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjemploFileReader {

	public EjemploFileReader(){
		File f = new File("F:\\Teach UNAH\\Carga_I2016.png");
		try {
			FileReader flujoLectura = new FileReader(f);
			BufferedReader br = new BufferedReader(flujoLectura);
			String linea="";
			while ((linea = br.readLine())!=null){
				System.out.println(linea);
			}

			/*System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());
			System.out.print((char)flujoLectura.read());*/

			flujoLectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EjemploFileReader();
	}

}
