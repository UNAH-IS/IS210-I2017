
public class Aritmetica{
	public static void main(String[] args){
		int a      = 12;
		int b      = 10;
		int suma   = a + b;
		int resta  = a - b;
		int mult   = a * b;
		float div    = (float)a / (float)b;
		int modulo = a % b;
		
		float x = 1.5f;
		double z = 2.3d;
		int y = (int)x;//Convertir el flotante x a entero
		
		System.out.println(y);

		System.out.print("Suma :");
		System.out.println(suma );
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);
	}
}
