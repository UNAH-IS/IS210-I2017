package clases;

public class Arreglos {

	public static void main(String[] args) {
		char[] genero = new char[2];
		genero[0] = 'F';
		genero[1] = 'M';
		//genero[2] = 'X';
		System.out.println("Primer Valor: " + genero[0]);
		System.out.println("Segundo Valor: " + genero[1]);

		//Arreglos con ciclos for
		int[] numeros = new int[10];
		//Almacenar valores
		for (int i=0; i < numeros.length;i++)
			numeros[i] = (i+1) * 10;

		//Mostrar valores
		for (int i=0; i < numeros.length;i++)
		   System.out.println("Elemento["+i+"]= "+numeros[i]);

	}

}
