package implementacion;

import clases.Archivo;
import clases.Fecha;
import clases.Usuario;

public class Principal {

	public static void main(String[] args) {
		Archivo a = new Archivo();
		Usuario u = new Usuario();
		Fecha f = new Fecha();
		Usuario usuarios[] = new Usuario[5];
		usuarios[0]=new Usuario("Pedro","pedro@gmail.com");
		usuarios[1]=new Usuario("Maria","maria@gmail.com");
		usuarios[2]=new Usuario("Luis","luis@gmail.com");
		usuarios[3]=new Usuario("Miguel","miguel@gmail.com");
		usuarios[4]=new Usuario("Diego","diego@gmail.com");


		f.setDia(12);
		f.setMes(12);
		f.setAnio(2012);
		u.setNombreUsuario("jperez");
		u.setCorreoElectronico("jperez@gmail.com");
		a.setNombreArchivo("holaMundo.txt");
		a.setNombreCarpeta("MisDocumentos");
		a.setTamanioBytes(555);
		a.setUsuarioSubio(u);
		a.setFechaSubida(new Fecha(12,12,2012));
		a.setFechaModificacion(f);
		a.setUsuariosCompartio(usuarios);

	}

}
