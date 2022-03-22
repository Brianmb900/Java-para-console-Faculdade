package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_8 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n, face, vetor[] = new int[6], lado;
		System.out.print("Digite o nº de vezes que o dado foi lançado: ");
		n = en.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o lado que caiu: ");
			lado = en.nextInt();
			vetor[lado - 1]++;
		}
		System.out.println();
		for (int i = 1; i < 6; i++) {
			System.out.printf("O lado %d caiu %d vezes. \n", i + 1, vetor[i]);
		}
	}
}