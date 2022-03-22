package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_9 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int indexMaior, indexAtual, tamMaior, tamAtual;
		System.out.print("Digite o número de elementos da sequência: ");
		int n = en.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Insira o elemento: ");
			v[i] = en.nextInt();
		}
		indexMaior = indexAtual = 0;
		tamMaior = tamAtual = 1;
		for (int i = 0; i < n - 1; i++) {
			if (v[i + 1] > v[i]) {
				tamAtual++;
				if (tamAtual > tamMaior) {
					tamMaior = tamAtual;
					indexMaior = indexAtual;
				}
			} else {
				tamAtual = 1;
				indexAtual = i + 1;
			}
		}
		System.out.println("Maior sequência crescente: ");
		for (int i = indexMaior; i < indexMaior + tamMaior; i++) {
			System.out.printf("%d ", v[i]);
		}
		System.out.println();
	}
}