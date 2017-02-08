package clases;

public class MetodosAritmeticos {

	//Dentro del main solo se puede acceder a metodos con el modificador static,
	//esto es porque el metodo main tambien es static
	public static void main(String args[]){
		int x = 5;
		int y = 4;
		System.out.println("Suma: " + sumar(x,y));
		System.out.println("Resta: " + restar(x,y));
		System.out.println("Multiplicacion: " + multiplicar(x,y));
		System.out.println("Division: " + dividir(x,y));
	}

	static int sumar(int a,int b){
		return a+b;
	}
	static int restar(int a,int b){
		return a-b;
	}
	static float dividir(int a,int b){
		return (float)a/(float)b;
	}
	static int multiplicar(int a,int b){
		return a*b;
	}
}

