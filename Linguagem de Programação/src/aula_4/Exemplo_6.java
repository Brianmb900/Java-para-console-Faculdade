package aula_4;

public class Exemplo_6 {

	public static void main(String[] args) {
		int[][] mat = new int[4][];
		int i, j, k = 0;
		for (i = 0; i < 4; i++) {
			mat[i] = new int[i + 1];
			for (j = 0; j < i + 1; j++) {
				mat[i][j] = k++;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
