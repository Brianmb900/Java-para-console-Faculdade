package aula_1;

import java.util.Scanner;

public class Exerc�cio_3 {

	public static void main(String[] args) {
		Scanner En = new Scanner(System.in);
		double r, a, d, c;
		int o;
		do {
			System.out.print("Insira o valor do Raio para calcular o di�metro, �rea e circunfer�ncia do circulo: ");
			r = En.nextDouble();
			a = (Math.pow(r, 2)) * Math.PI;
			c = 2 * Math.PI * r;
			d = 2 * r;
			System.out.printf("O valor do di�metro �: %.2f %n", (d));
			System.out.printf("O valor da �rea �: %.2f %n", (a));
			System.out.printf("O valor da circunfer�ncia �: %.2f %n", (c));
			System.out.print("Digite 1 para continuar ou 0 para sair: ");
			o = En.nextInt();
		} while (o == 1);
	}

}
