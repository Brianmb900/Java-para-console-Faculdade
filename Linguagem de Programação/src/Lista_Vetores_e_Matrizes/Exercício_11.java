package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_11 {

	public static void main(String[] args) {
		// URI 1175
		Scanner en = new Scanner(System.in);
		int n, v[] = new int[20];
		for (int i = 0; i < 20; i++) {
			v[i] = en.nextInt();
		}
		for (int i = 0, a = 19; i < 10; i++, a--) {
			n = v[i];
			v[i] = v[a];
			v[a] = n;
		}
		for (int i = 0; i < 20; i++) {
			System.out.printf("N[%d] = " + v[i] + "\n", i);
		}
	}

}
