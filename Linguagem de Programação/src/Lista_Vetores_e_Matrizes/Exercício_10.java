package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_10 {

	public static void main(String[] args) {
		// URI 1172
		Scanner en = new Scanner(System.in);
		int X[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o valor: ");
			X[i] = en.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (X[i] <= 0) {
				X[i] = 1;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("X[%d] = " + X[i] + "\n", i);
		}
	}
}
