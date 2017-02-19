import javax.swing.JOptionPane;

public class EjemploJOptionPane {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hola Mundo");
		JOptionPane.showMessageDialog(null, "Hola de nuevo", "Aprendiendo Swing", JOptionPane.ERROR_MESSAGE);

		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		JOptionPane.showMessageDialog(null, "Mucho gusto " + nombre);

		int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

		JOptionPane.showMessageDialog(null, "Hola " + nombre + ", la suma de los numero que ingreso es: " +
					(x+y));


		Double.parseDouble("454.23");
		Double.valueOf("12.2");
		//Wrappers o clases envolventes: Sirven generalmente para realizar conversiones especiales
		//generalmente entre cadenas y tambien para utilizar colecciones especiales.
		//Byte
		//Short
		//Integer
		//Float
		//Double
		//Long
		//Boolean

		//Pruebas:
		Integer a = 2;
		int b = 2;
		a= b;

		int numero = Integer.valueOf("45");
		int otroNumero = Integer.parseInt("45");

	}

}



