import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
	public EjemploFileWriter(){
		try {
			FileWriter fw = new FileWriter("C:\\Prueba\\archivo.prueba",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hola mundo\n");
			bw.write("¿Como estan?");
			///fw.write("Hola mundo");
			///fw.write("Este es un archivo plano");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]){
		new EjemploFileWriter();
	}
}
