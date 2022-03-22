package prova_1;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int N, cont = 0;
		System.out.print("Digite o comprimento da expressão: ");
		N = en.nextInt();
		while (N < 1 || N > 10) {
			System.out.print("Valor indevido digite o comprimento da expressão novamente: ");
			N = en.nextInt();
		}
		int V[] = new int[N];
		for (int a = 0; a < N; a++) {
			System.out.printf("Digite o %dº termo: ", a + 1);
			V[a] = en.nextInt();
			while (V[a] < 10 || V[a] > 9999) {
				System.out.print("Valor indevido, digite novamente: ");
				V[a] = en.nextInt();
			}
			if (V[a] % 10 == 0) {
				V[a] = 1;
			} else {
				String b = String.valueOf(V[a]);
				b = b.substring(0, b.length() - 1);
				int c = Integer.parseInt(b);
				double U = (double) V[a];
				V[a] = (int) Math.pow(c, (U % 10));
			}
			cont += V[a];
		}
		System.out.println(cont);
	}
}