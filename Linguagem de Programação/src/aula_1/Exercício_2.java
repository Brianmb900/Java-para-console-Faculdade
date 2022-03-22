package aula_1;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		double n1, n2, m;
		int o;
		do {
			System.out.print("Digite a 1ª nota: ");
			n1 = Entrada.nextDouble();
			System.out.print("Digite a 2º nota: ");
			n2 = Entrada.nextDouble();
			m = (n1 + n2) / 2;
			System.out.println("Sua média é: " + m);
			System.out.print("Digite 1 para calcular outra média ou 0 para sair: ");
			o = Entrada.nextInt();

		} while (o == 1);

	}
}
