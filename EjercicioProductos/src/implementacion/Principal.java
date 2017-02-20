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
		p.setCodigoProducto(JOptionPane.showInputDialog("Codigo producto: "));
		p.setNombreProducto(JOptionPane.showInputDialog("Nombre Producto: "));
		p.setPrecioCompra(Double.parseDouble(JOptionPane.showInputDialog("Precio Compra: ")));
		p.setPrecioVenta(Double.parseDouble(JOptionPane.showInputDialog("Precio Venta: ")));
		p.setCantidadExistencia(Double.parseDouble(JOptionPane.showInputDialog("Existencia: ")));
		Marca m = new Marca();
		m.setCodigoMarca(Integer.parseInt(JOptionPane.showInputDialog("Codigo Marca: ")));
		m.setNombreMarca(JOptionPane.showInputDialog("Marca: "));
		m.setPais(JOptionPane.showInputDialog("Pais Marca: "));
		p.setMarca(m);

		//Agregar objeto al ArrayList.
		productos.add(p);
	}

	public void modificarProducto(){

	}

	public void eliminarProducto(){

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
