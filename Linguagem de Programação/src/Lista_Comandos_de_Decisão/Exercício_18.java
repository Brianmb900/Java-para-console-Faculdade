package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double vc, vv;
		System.out.print("Insira o valor da compra: R$ ");
		vc = in.nextDouble();
		if (vc < 10) {
			vv = vc + (vc * 0.7);
			System.out.printf("Valor da venda: R$ %.2f %n", (vv));
		} else if (vc >= 10 && vc < 30) {
			vv = vc + (vc * 0.5);
			System.out.printf("Valor da venda: R$ %.2f %n", (vv));
		} else if (vc >= 30 && vc < 50) {
			vv = vc + (vc * 0.4);
			System.out.printf("Valor da venda: R$ %.2f %n", (vv));
		} else {
			vv = vc + (vc * 0.3);
			System.out.printf("Valor da venda: R$ %.2f %n", (vv));
		}

	}

}
