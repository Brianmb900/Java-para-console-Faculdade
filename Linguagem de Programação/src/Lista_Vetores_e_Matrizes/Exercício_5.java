package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas mercadorias foram vendidas?");
		int n_m = in.nextInt();
		int contl10 = 0;
		int contl10_20 = 0;
		int contl21 = 0;
		double l, l10, l10_20;
		double[] compra = new double[n_m];
		double[] venda = new double[n_m];
		System.out.printf("Insira o valor de compra das %d mercadorias\n", n_m);
		for (int a = 0; a < compra.length; a++) {
			compra[a] = in.nextDouble();
		}
		System.out.printf("Insira o valor de venda das %d mercadorias\n", n_m);
		for (int a = 0; a < compra.length; a++) {
			venda[a] = in.nextDouble();
		}
		for (int b = 0; b < compra.length; b++) {

			l = venda[b] - compra[b];
			l10 = compra[b] * 0.1;
			l10_20 = compra[b] * 0.2;
			if (l < l10) {
				contl10++;
			} else if (l <= l10_20) {
				contl10_20++;
			} else {
				contl21++;
			}
		}
		System.out.println(contl10 + " mercadorias tiveram lucro menor que 10 por cento");
		System.out.println(contl10_20 + " mercadorias tiveram lucro entre 10 e 20 por cento");
		System.out.println(contl21 + " mercadorias tiveram lucro maior que 20 por cento");
	}
}