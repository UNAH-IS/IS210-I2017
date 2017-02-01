package clases;

import java.util.Scanner;

public class MenuCiclico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do{
			System.out.println("1. Agregar\n"
					+ "2. Modificar\n"
					+ "3. Eliminar\n"
					+ "0. Salir");
			opcion = entrada.nextInt();
			System.out.println("Opcion seleccionada: "+opcion);

			switch (opcion) {
			case 1:
				System.out.println("Agregar");
				break;
			case 2:
				System.out.println("Modificar");
				break;
			case 3:
				System.out.println("Eliminar");
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				break;
			}
		}while(opcion!=0);
	}

}
