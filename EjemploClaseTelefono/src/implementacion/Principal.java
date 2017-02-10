package implementacion;

import clases.Telefono;

public class Principal {
	void metodo(){

	}

	public static void main(String[] args) {
		Telefono.atributoEstatico = 100;
		//TipoDato[] nombreArreglo = new TipoDato[tamaño]
		Telefono[] telefonos = new Telefono[4];
		Telefono t1 = new Telefono("666","Chino","Ese7","Rojo","1024x768","Tigo",1231,5465,23132,2131);
		Telefono t2 = new Telefono("667","iPhone","7S","Blanco","1024x768","Tigo",1231,5465,23132,2131);
		Telefono t3 = new Telefono("668","Samsung","S7","Verde","1024x768","Tigo",1231,5465,23132,2131);
		Telefono t4 = new Telefono();

		telefonos[0] = t1;
		telefonos[1] = t2;
		telefonos[2] = t3;
		telefonos[3] = t4;

		/*t1.setMarca("Chino");
		t1.setColor("Rojo");
		t1.setModelo("S7");
		t1.definicionCamara = 8.1;

		t2.setMarca("Samsung");
		t2.setColor("Blanco");
		t2.setModelo("S7");

		t3.setMarca("iPhone");
		t3.setColor("Blanco");
		t3.setModelo("7S");*/

		t4.setMarca("Sony");
		t4.setColor("Negro");
		t4.setModelo("Z7");

		/*System.out.println("Marca Telefono: " + t1.getMarca());
		System.out.println("Color Telefono: " + t1.getColor());
		System.out.println("Modelo Telefono: " + t1.getModelo());
		//System.out.println("Modelo Telefono: " + t1.definicionCamara);
		Telefono.atributoEstatico = 500;
		System.out.println("Marca Telefono: " + t2.getMarca());
		System.out.println("Color Telefono: " + t2.getColor());
		System.out.println("Modelo Telefono: " + t2.getModelo());

		System.out.println("Marca Telefono: " + t3.getMarca());
		System.out.println("Color Telefono: " + t3.getColor());
		System.out.println("Modelo Telefono: " + t3.getModelo());

		System.out.println("Marca Telefono: " + t4.getMarca());
		System.out.println("Color Telefono: " + t4.getColor());
		System.out.println("Modelo Telefono: " + t4.getModelo());

		System.out.println("Atributo estatico t1: "+Telefono.atributoEstatico);
		System.out.println("Atributo estatico t2: "+Telefono.atributoEstatico);
		System.out.println("Atributo estatico t3: "+Telefono.atributoEstatico);
		t1.llamar();

		System.out.println("--------------------------------------------------");
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());*/
		for(int i = 0; i<telefonos.length; i++){
			System.out.println(telefonos[i].toString());
		}
	}

}
