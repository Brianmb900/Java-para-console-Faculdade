package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int a[] = new int[11], b[] = new int[11];
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: ", i);
			a[i] = en.nextInt();
		}System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Quadrado do %dº número: ", i);
			b[i] = a[i] * a[i];
			System.out.println(b[i]);
		}
	}

}
