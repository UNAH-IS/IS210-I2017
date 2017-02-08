package implementacion;

import clases.Telefono;

public class Principal {
	void metodo(){

	}

	public static void main(String[] args) {
		Telefono.atributoEstatico = 100;

		Telefono t1 = new Telefono();
		Telefono t2 = new Telefono();
		Telefono t3 = new Telefono();

		t1.setMarca("Chino");
		t1.setColor("Rojo");
		t1.setModelo("S7");
		t1.definicionCamara = 8.1;

		t2.setMarca("Samsung");
		t2.setColor("Blanco");
		t2.setModelo("S7");

		t3.setMarca("iPhone");
		t3.setColor("Blanco");
		t3.setModelo("7S");

		System.out.println("Marca Telefono: " + t1.getMarca());
		System.out.println("Color Telefono: " + t1.getColor());
		System.out.println("Modelo Telefono: " + t1.getModelo());
		System.out.println("Modelo Telefono: " + t1.definicionCamara);
		Telefono.atributoEstatico = 500;
		System.out.println("Marca Telefono: " + t2.getMarca());
		System.out.println("Color Telefono: " + t2.getColor());
		System.out.println("Modelo Telefono: " + t2.getModelo());

		System.out.println("Marca Telefono: " + t3.getMarca());
		System.out.println("Color Telefono: " + t3.getColor());
		System.out.println("Modelo Telefono: " + t3.getModelo());


		System.out.println("Atributo estatico t1: "+Telefono.atributoEstatico);
		System.out.println("Atributo estatico t2: "+Telefono.atributoEstatico);
		System.out.println("Atributo estatico t3: "+Telefono.atributoEstatico);
		t1.llamar();
	}

}
