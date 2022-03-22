package aula_1;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		Scanner En = new Scanner(System.in);
		double vg, g;
		int o;
		do {
			System.out.print("Insira o valor da conta: R$ ");
			vg = En.nextDouble();
			g = vg * 0.1;
			System.out.printf("O valor da gorjeta é: R$ %.2f %n", (g));
			System.out.print("Digite 1 para continuar ou 0 para sair: ");
			o = En.nextInt();

		} while (o == 1);
	}

}
