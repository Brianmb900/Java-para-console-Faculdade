package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);
		int t;
		System.out.print("Digite o tamnho do vetor: ");
		t = en.nextInt();
		int[] v = new int[t];
		for (int i = 0; i < t; i++) {
			System.out.printf("Digite o %dº valor do vetor: ", (i + 1));
			v[i] = en.nextInt();
		}
		v = inverterVetor(v);
		imprimirVetor(v);
	}

	public static int[] inverterVetor(int[] v) {
		int[] i = new int[v.length];
		int b = 1;
		for (int a = 0; a < v.length; a++, b++) {
			i[a] = v[v.length - b];
		}
		return i;
	}

	public static void imprimirVetor(int[] v) {
		System.out.print("Vetor: ");
		for (int a = 0; a < v.length - 1; a++) {
			System.out.printf("%d, ", v[a]);
		}
		System.out.printf("%d\n", v[v.length - 1]);
	}
}