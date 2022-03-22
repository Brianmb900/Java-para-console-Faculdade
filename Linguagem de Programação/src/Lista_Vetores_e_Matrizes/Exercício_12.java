package Lista_Vetores_e_Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercício_12 {

	public static void main(String[] args) {
		// URI 1245
		Scanner en = new Scanner(System.in);
		int[] esq = new int[31];
		int[] dir = new int[31];
		char pe;
		int tam, n, pares;
		while (en.hasNext()) {
			n = en.nextInt();
			Arrays.fill(esq, 0);
			Arrays.fill(dir, 0);
			for (int i = 0; i < n; i++) {
				tam = en.nextInt();
				pe = en.next().charAt(0);
				if (pe == 'E') {
					esq[tam - 30]++;
				} else {
					dir[tam - 30]++;
				}
			}
			pares = 0;
			for (int i = 0; i < 31; i++) {
				pares += (esq[i] < dir[i] ? esq[i] : dir[i]);
			}
			System.out.println(pares);
		}
	}
}