package clases;
import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		//Las colecciones por lo general necesitan un RawType (Receptaculo)
		//En el caso de las colecciones el RawType indican el tipo de dato a almacenar
		ArrayList<Telefono> telefonos =new  ArrayList<Telefono>();
		Telefono t = new Telefono("456465","Chino","Ese7","Dorado","1024x76","Tigo",454,45,454,54);
		Telefono t2 = new Telefono("566666","Samsung","S7","Blanco","1024x76","Tigo",454,45,454,54);
		Telefono t3 = new Telefono("7777","iPhone","7S","Negro","1024x76","Tigo",454,45,454,54);
		Telefono t4 = new Telefono("123","Huawei","Mate","Azul","1024x76","Tigo",454,45,454,54);


		telefonos.add(t); //0
		telefonos.add(t2); //1
		telefonos.add(t3); //2
		//telefonos.add(t4); //3
		telefonos.set(0, t4);//0

		telefonos.remove(1);

		for (int i=0; i<telefonos.size();i++)
			System.out.println(telefonos.get(i).toString());

		//Telefono[] arrregloTelefonos = new Telefono[5];
		//arregloTelefonos[0] = t;
	}

}
