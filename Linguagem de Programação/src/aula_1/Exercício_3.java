package aula_1;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner En = new Scanner(System.in);
		double r, a, d, c;
		int o;
		do {
			System.out.print("Insira o valor do Raio para calcular o diâmetro, área e circunferência do circulo: ");
			r = En.nextDouble();
			a = (Math.pow(r, 2)) * Math.PI;
			c = 2 * Math.PI * r;
			d = 2 * r;
			System.out.printf("O valor do diâmetro é: %.2f %n", (d));
			System.out.printf("O valor da área é: %.2f %n", (a));
			System.out.printf("O valor da circunferência é: %.2f %n", (c));
			System.out.print("Digite 1 para continuar ou 0 para sair: ");
			o = En.nextInt();
		} while (o == 1);
	}

}
