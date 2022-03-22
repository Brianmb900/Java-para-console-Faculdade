package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, nt, nd, n, mo, ct, nm = 1;
		ct = 0;
		mo = 0;
		n = 0;
		nt = 0;
		System.out.print("Digite um número: ");
		m = in.nextInt();
		while (nm <= m) {
			if (nm == 1) {
				nt = nm;
				nd = n - 1;
				if (nd != 0) {
					mo = nt % nd;
				}
				if (mo == 0) {
					ct += nd;
				}
			} else {
				for (n = nm; n >= 1; n += -1) {
					nt = nm;
					nd = n - 1;
					if (nd != 0) {
						mo = nt % nd;
					}
					if (mo == 0) {
						ct += nd;
					}
				}
				if (ct == nt) {
					System.out.printf(" Número perfeito encontrado entre 1 até " + m + " é: " + nt + "\n");
				}
				nt = 0;
				nd = 0;
				ct = 0;
			}
			nm += 1;
		}
	}
}