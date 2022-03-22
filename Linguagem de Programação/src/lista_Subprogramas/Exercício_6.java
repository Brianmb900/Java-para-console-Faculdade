package lista_Subprogramas;

import java.util.Scanner;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int l, c, i = 1;
		double m;
		System.out.print("Digite o n�mero de linhas da matriz: ");
		l = en.nextInt();
		System.out.print("Digite o n�mero de colunas da matriz: ");
		c = en.nextInt();
		System.out.print("Digite o valor que ir� multiplicar a mariz: ");
		m = en.nextDouble();
		double[][] matriz = new double[l][c];
		for (int a = 0; a < l; a++) {
			for (int b = 0; b < c; b++, i++) {
				System.out.printf("Digite o %d� elemento da matriz: ", i);
				matriz[a][b] = en.nextDouble();
			}
		}
		multiplicarMatriz(matriz, m);
		imprimirMatriz(matriz);
	}

	public static void multiplicarMatriz(double matriz[][], double multiplicador) { // Quando voc� altera uma matriz em
																					// uma fun��o voc� n�o precisa
																					// retorna j� que a pr�ppria matriz
																					// usada ir� ser alterada
		double nova_Matriz[][] = matriz;
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				nova_Matriz[a][b] = matriz[a][b] * multiplicador;
			}
		}
	}

	public static void imprimirMatriz(double[][] matriz) {
		System.out.println("Matriz:");
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				System.out.printf("%.2f\t", matriz[a][b]);
			}
			System.out.println();
		}
	}
}