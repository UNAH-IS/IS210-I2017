package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Marca;
import clases.Producto;

public class Principal {
	//Declaracion de atributos globales de la clase
	private int opcion=0;
	private ArrayList<Producto> productos;

	public Principal(){
		//Logica del programa
		productos = new ArrayList<Producto>();

		do{
			opcion = Integer.parseInt(
						JOptionPane.showInputDialog(
							"0: Salir\n"
							+ "1: Agregar producto\n"
							+ "2: Modificar producto\n"
							+ "3: Eliminar producto\n"
							+ "4: Mostrar informacion"
						)
					);
			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "Adios!");
				break;
			case 1:
				agregarProducto();
				break;
			case 2:
				modificarProducto();
				break;
			case 3:
				eliminarProducto();
				break;
			case 4:
				mostrarInformacion();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion inválida.");
				break;
			}
		}while(opcion !=0);
	}

	public void agregarProducto(){
		//Crear una instancia del tipo Producto
		Producto p = new Producto();
		//Inicializar los atributos, solicitar la informacion
		p.solicitarInformacion();
		//Agregar objeto al ArrayList.
		productos.add(p);
	}

	public void modificarProducto(){
		int indiceModificar = Integer.parseInt(JOptionPane.showInputDialog("¿Que objeto desea modificar? (0-"+
				(productos.size()-1)+")"));
		Producto p = productos.get(indiceModificar);
		p.solicitarInformacion();
		productos.set(indiceModificar, p);
	}

	public void eliminarProducto(){
		//Solicitar el indice del objeto a eliminar
		int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("¿Que objeto desea eliminar? (0-"+
				(productos.size()-1)+")"));
		//Eliminar el objeto del arraylist

		int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto " + productos.get(indiceEliminar).getNombreProducto());
		//System.out.println("Resultado Opcion: " + resultado);
		if (resultado == 0){
			productos.remove(indiceEliminar);
			JOptionPane.showMessageDialog(null,"Objeto eliminado.");
		}
	}

	public void mostrarInformacion(){
		String cadenaProductos="";
		for(int i=0;i<productos.size();i++){
			cadenaProductos+=productos.get(i).toString()+"\n";
		}

		JOptionPane.showMessageDialog(null,cadenaProductos);
	}

	public static void main(String[] args) {
		new Principal(); //Instancia anonima
	}
}
