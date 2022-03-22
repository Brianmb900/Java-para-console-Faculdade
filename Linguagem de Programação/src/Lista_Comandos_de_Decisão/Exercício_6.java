package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sb, ve, vp;
		int np;
		System.out.print("Insira o valor do seu salário bruto: R$ ");
		sb = in.nextDouble();
		sb = sb * 0.3;
		System.out.print("Insira o valor do crédito desejado: R$ ");
		ve = in.nextDouble();
		System.out.print("Insira em quantas parcelas você deseja pagar: ");
		np = in.nextInt();
		vp = ve / np;
		if (vp <= sb) {
			System.out.printf("O empréstimo pode ser concedido e o valor de cada parcela é: R$ %.2f %n", (vp));

		}
		else {
			System.out.printf("O valor da parcela é: %.2f %n", (vp));
			System.out.printf("O empréstimo não pode ser concedido, o valor máximo aceitável para cada parcela é: R$ %.2f %n", (sb));
		}

	}
}
