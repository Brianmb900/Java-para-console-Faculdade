package aula_1;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		double n1, n2, m;
		int o;
		do {
			System.out.print("Digite a 1� nota: ");
			n1 = Entrada.nextDouble();
			System.out.print("Digite a 2� nota: ");
			n2 = Entrada.nextDouble();
			m = (n1 + n2) / 2;
			System.out.println("Sua m�dia �: " + m);
			System.out.print("Digite 1 para calcular outra m�dia ou 0 para sair: ");
			o = Entrada.nextInt();

		} while (o == 1);

	}
}
