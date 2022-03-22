package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_13 {

	public static void main(String[] args) {
		// URI 2162
		Scanner en = new Scanner(System.in);
		int q, cont = 1, r = 0;
		System.out.print("Digite a quantida de medidas que serão inseridas: ");
		q = en.nextInt();
		int m[] = new int[q];
		for (int i = 0; i < q; i++) {
			System.out.print("Digite a medida: ");
			m[i] = en.nextInt();
		}
		if (q > 2) {
			for (int i = 2; i < q; i++) {
				if (m[i - 2] > m[i - 1] && m[i - 1] < m[i] || m[i - 2] < m[i - 1] && m[i - 1] > m[i]) {
					System.out.printf("Penetrei %d vezes \n", cont);
					cont++;
				}
			}
			System.out.println(cont);
			if (cont == (q - 1)) {
				r = 1;
			} else {
				r = 0;
			}
		} else {
			if (m[0] != m[1]) {
				r = 1;
			}
		}
		System.out.println(r);
	}
}