package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_8 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n;
		System.out.print("Digite o tamanho da matriz identidade: ");
		n = en.nextInt();
		imprimirMatriz(criarMatrizIdentidade(n));

	}

	public static int[][] criarMatrizIdentidade(int n) {
		int[][] matriz = new int[n][n];
		for (int a = 0; a < n; a++) {
				matriz[a][a] = 1;
			}
		return matriz;
	}

	public static void imprimirMatriz(int[][] matriz) {
		System.out.println("\n" + "Matriz:");
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				System.out.printf("%d\t", matriz[a][b]);
			}
			System.out.println();
		}
	}
}