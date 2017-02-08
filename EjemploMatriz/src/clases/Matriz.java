package clases;

public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = new int[4][6];
		System.out.println(matriz.length);
		System.out.println(matriz[3].length);
		//Asignar valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}

		//Imprimir valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				System.out.println("Elemento ["+i+"]["+j+"]: "+matriz[i][j]);
			}
		}


	}

}
