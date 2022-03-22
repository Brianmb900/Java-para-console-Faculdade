package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdm, nc, mnm = 0, cnm = 0;
		double vl = 1, tt, ti = 0;
		tt = 0;
		int f = 1;
		do {
			System.out.print("Digite o número da carteira de mororista: ");
			nc = in.nextInt();
			System.out.print("Digite o número de multas: ");
			qtdm = in.nextInt();
			if (f == 1) {
				cnm = nc;
				mnm = qtdm;
				f = 0;
			}
			if (qtdm > mnm) {
				cnm = nc;
				mnm = qtdm;
			}
			if (qtdm == 0) {
				vl = 0;
			}
			for (int i = 1; i <= qtdm; i++) {
				System.out.printf("Digite o valor da %dª multa: R$ ", i);
				System.out.print("");
				vl = in.nextDouble();
				ti += vl;
			}
			tt += ti;
			System.out.printf("O valor da dívida é: R$ %.2f \n", ti);
			ti = 0;
		} while (vl != 0);
		System.out.printf("O total arrecadado foi: R$ %.2f \n", tt);
		System.out.printf("A carteira com maior quantidade de multas foi a carteira: " + cnm);

	}

}
