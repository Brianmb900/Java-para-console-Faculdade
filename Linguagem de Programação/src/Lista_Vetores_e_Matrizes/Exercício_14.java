package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_14 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n;
		System.out.print("Digite um número n para gerar uma matriz nxn: ");
		n = en.nextInt();
		int b = n - 1;
		int m[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int a = 0; a < n; a++) {
				System.out.print("Digite um número: ");
				m[i][a] = en.nextInt();
			}
		}
		System.out.println("");
		System.out.println("Elementos da diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(m[i][i] + "\t");
		}
		System.out.println("\n");
		System.out.println("Todos os elementos exceto a diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Vrum");
		}
		System.out.println("\n");
		System.out.println("Elementos da diagonal secundária: ");
		for (int i = 0; i < n; i++) {
			System.out.print(m[i][b] + "\t");
			b--;
		}
	}
}