package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double c4 = 0, c5 = 0, c7 = 0, c12 = 0, c = 1, tp, p4, p5, p7, p12, cont = 0;
		while (c != 0) {
			System.out.println(
					"Digite o canal que estava sendo assistido e quantas pessoas o estava assistido ou zero para encerrar a entrada de dados:");
			c = in.nextInt();
			if (c == 0) {
				break;
			}
			if (c == 4) {
				++c4;
			} else if (c == 5) {
				++c5;
			} else if (c == 7) {
				c7++;
			} else {
				c12++;
			}
			tp = in.nextInt();
			++cont;
		}
		p4 = (c4 / cont) * 100;
		p5 = (c5 / cont) * 100;
		p7 = (c7 / cont) * 100;
		p12 = (c12 / cont) * 100;
		System.out.println("Porcentagem de casas concetadas no canal 4 é: " + p4);
		System.out.println("Porcentagem de casas concetadas no canal 5 é: " + p5);
		System.out.println("Porcentagem de casas concetadas no canal 7 é: " + p7);
		System.out.println("Porcentagem de casas concetadas no canal 12 é: " + p12);
	}

}
