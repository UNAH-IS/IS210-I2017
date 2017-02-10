package implementacion;

import java.util.Scanner;

import clases.Telefono;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Telefono[] telefonos;
		int opcion = 0;
		int cantidadRegistros;
		int cantidadRegistrosAgregados=0;

		System.out.println("¿Cuantos telefonos desea agregar?");
		cantidadRegistros = entrada.nextInt();
		telefonos = new Telefono[cantidadRegistros];

		do{
			System.out.println("1. Agregar\n"
					+ "2. Mostrar Informacion\n"
					+ "3. Eliminar\n"
					+ "0. Salir");
			opcion = entrada.nextInt();
			System.out.println("Opcion seleccionada: "+opcion);

			switch (opcion) {
			case 1:
				agregarRegistro(entrada,telefonos,cantidadRegistrosAgregados);
				cantidadRegistrosAgregados++;
				break;
			case 2:
				mostrarInformacion(telefonos);
				break;
			case 3:
				eliminarRegistro(entrada, telefonos);
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				break;
			}
		}while(opcion!=0);

		entrada.close();
	}

	static void agregarRegistro(Scanner entrada, Telefono[] telefonos, int cantidadRegistrosAgregados){
		if (cantidadRegistrosAgregados>=telefonos.length){
			System.out.println("Ya no es posible agregar mas elementos");
			return;
		}

		//Crear un objeto del tipo telefono
		Telefono t = new Telefono();
		//Solicitar la informacion para el objeto
		System.out.print("Marca: ");
		t.setMarca(entrada.next());
		System.out.print("Modelo: ");
		t.setModelo(entrada.next());
		System.out.print("Color: ");
		t.setColor(entrada.next());
		System.out.print("Operadora: ");
		t.setOperadora(entrada.next());
		System.out.print("Capacidad Almacenamiento: ");
		t.setCapacidadAlmacenamiento(entrada.nextDouble());
		System.out.print("Capacidad Memoria: ");
		t.setCapacidadMemoria(entrada.nextDouble());
		System.out.print("Capacidad Procesador: ");
		t.setCapacidadProcesador(entrada.nextDouble());
		System.out.print("Resolucion: ");
		t.setResolucion(entrada.next());
		System.out.print("Numero: ");
		t.setNumero(entrada.next());

		//Asignar el objeto al arreglo
		telefonos[cantidadRegistrosAgregados] = t;
	}

	static void mostrarInformacion(Telefono[] telefonos){
		System.out.println("------Telefonos registrados------");
		for(int i=0;i<telefonos.length;i++){
			if (telefonos[i]!=null)
				System.out.println(telefonos[i].toString());
		}

	}

	static void eliminarRegistro(Scanner entrada, Telefono[] telefonos){
		int indiceEliminar;
		System.out.print("¿Que elemento desea eliminar? del 0 al "+ (telefonos.length-1)+": ");
		indiceEliminar = entrada.nextInt();
		telefonos[indiceEliminar]=null;
		System.out.println("Registro Eliminado");
	}
}