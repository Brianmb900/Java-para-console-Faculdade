package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�co_18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, p, p_2, m, cont = 0;
		p = 2;
		System.out.print("Digite um n�mero para calcular a raiz quadrada dele: ");
		x = in.nextDouble();
		while (cont != x) {
			p_2 = p * p;
			if (p_2 == x) {
				System.out.print("A raiz �: " + p);
				cont++;
			} else {
				m = (p + (x / p)) / 2;
				p = m;
			}
		}
	}

}
