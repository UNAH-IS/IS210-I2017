package clases;

import java.util.Scanner;

public class ArregloTamanioVariable {

	public static void main(String[] args) {
		int numeros[];
		Scanner entrada = new Scanner(System.in);

		System.out.print("Cuantos enteros quiere registrar: ");
		numeros = new int[entrada.nextInt()];

		for (int i=0; i<numeros.length; i++){
			System.out.print("Ingrese el numero "+ i +": ");
			numeros[i] = entrada.nextInt();
		}

		for (int i=0; i<numeros.length; i++){
			System.out.println("Valor ingresado para "+ i +": " + numeros[i]);
		}
	}
}
