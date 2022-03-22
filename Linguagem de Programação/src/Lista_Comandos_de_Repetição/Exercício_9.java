package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, dv, ma;
		int a, dvi;
		System.out.println("Insira o dia do mês e quantidade de discos vendidos nele:");
		a = in.nextInt();
		dv = in.nextInt();
		ma = dv;
		dvi = a;
		for (i = 1; i <= 30; i++) {
			a = in.nextInt();
			dv = in.nextInt();
			if (dv > ma) {
				ma = dv;
				dvi = a;
			}
		}
		System.out.print("O dia com maior venda foi dia " + dvi + " e a quantidade de discos vendidos foi: " + ma);

	}

}
