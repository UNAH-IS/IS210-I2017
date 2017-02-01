package clases;

import java.util.Scanner;  //Si quiero importar todas las clases que se usan en el proyecto utilizar Shift+Ctrl+O

public class CapturaInformacion {
	public static void main(String[] args) {
		//TipoDeDato variable = valor;
		//Clase objeto = new Clase(Parametros);
		Scanner entrada = new Scanner(System.in); // System.in es la entrada estandar del sistema
		String nombre;
		String apellido;
		int edad;
		
		System.out.print("Nombre: ");
		nombre = entrada.next();//Pausa el programa para ingresar una cadena de texto
		System.out.print("Apellido: ");
		apellido = entrada.next();
		System.out.print("Edad: ");
		edad = entrada.nextInt();
		System.out.println("Informacion: "+ nombre + " " + apellido + "("+edad+")");
		entrada.close(); //Cerrar el flujo de entrada
	}

}
