package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int l, c, i = 1;
		double m;
		System.out.print("Digite o número de linhas da matriz: ");
		l = en.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		c = en.nextInt();
		System.out.print("Digite o valor que irá multiplicar a mariz: ");
		m = en.nextDouble();
		double[][] matriz = new double[l][c];
		for (int a = 0; a < l; a++) {
			for (int b = 0; b < c; b++, i++) {
				System.out.printf("Digite o %dº elemento da matriz: ", i);
				matriz[a][b] = en.nextDouble();
			}
		}
		multiplicarMatriz(matriz, m);
		imprimirMatriz(matriz);
	}

	public static void multiplicarMatriz(double matriz[][], double multiplicador) { // Quando você altera uma matriz em
																					// uma função você não precisa
																					// retorna já que a próppria matriz
																					// usada irá ser alterada
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