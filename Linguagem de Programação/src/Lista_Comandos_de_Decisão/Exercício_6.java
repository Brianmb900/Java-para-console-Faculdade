package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sb, ve, vp;
		int np;
		System.out.print("Insira o valor do seu sal�rio bruto: R$ ");
		sb = in.nextDouble();
		sb = sb * 0.3;
		System.out.print("Insira o valor do cr�dito desejado: R$ ");
		ve = in.nextDouble();
		System.out.print("Insira em quantas parcelas voc� deseja pagar: ");
		np = in.nextInt();
		vp = ve / np;
		if (vp <= sb) {
			System.out.printf("O empr�stimo pode ser concedido e o valor de cada parcela �: R$ %.2f %n", (vp));

		}
		else {
			System.out.printf("O valor da parcela �: %.2f %n", (vp));
			System.out.printf("O empr�stimo n�o pode ser concedido, o valor m�ximo aceit�vel para cada parcela �: R$ %.2f %n", (sb));
		}

	}
}
