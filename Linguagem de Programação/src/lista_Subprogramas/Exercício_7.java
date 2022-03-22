package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int tv, ma = 0, me = 0;
		System.out.print("Digite o tamanho do vetor: ");
		tv = en.nextInt();
		int vet[] = new int[tv];
		for (int a = 0; a < tv; a++) {
			System.out.printf("Digite o %dº valor do vetor: ", a + 1);
			vet[a] = en.nextInt();
		}
		vet = novoVetor(vet);
		imprimirVetor(vet);
	}

	public static int[] novoVetor(int vet[]) {
		int v2[] = new int[2];
		for (int a = 0; a < vet.length; a++) {
			if (a == 0) {
				v2[1] = vet[a];
				v2[0] = vet[a];
			}
			if (vet[a] > v2[1]) {
				v2[1] = vet[a];
			} else if (vet[a] < v2[0]) {
				v2[0] = vet[a];
			}
		}
		return v2;
	}

	public static void imprimirVetor(int[] vet2) {
		System.out.println("Vetor:");
		for (int a = 0; a < vet2.length; a++) {
			System.out.printf("%d\t", vet2[a]);
		}
		System.out.println();
	}
}