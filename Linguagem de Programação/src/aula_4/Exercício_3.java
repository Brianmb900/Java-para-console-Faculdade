package aula_4;

import java.util.Random;
import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas e colunas da matriz");
		int l = in.nextInt();
		int c = in.nextInt();
		int acu = 0;
		int matriz[][] = new int[l][c];
		Random rand = new Random();
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				matriz[a][b] = rand.nextInt(30);
				acu += matriz[a][b];
			}
		}
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz[a].length; b++) {
				System.out.print(matriz[a][b] + "\t");
			}
			System.out.println();
		}
		System.out.print("A soma dos valores da matriz é: " + acu);
	}
}