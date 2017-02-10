package clases;

public class Sobrecarga {
	public static int sumar(int a, int b){
		return a+b;
	}

	public static float sumar(float a, float b){
		return a+b;
	}

	public float restar(float a, float b){
		return a-b;
	}

	public int restar(int a, int b){
		return a-b;
	}

	public static void main(String[] args) {
		System.out.println(sumar(3,5));
		System.out.println(sumar(3.5f,4.7f));
	}

}
