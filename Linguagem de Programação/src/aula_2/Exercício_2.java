package aula_2;

import java.util.Scanner;

public class Exercício_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sm, c;
		c = 1;
		System.out.print("Insira seu saldo médio: R$ ");
		sm = in.nextDouble();
		if (sm > 5000) {
			c = sm * 2;
		} else if (sm >= 3001) {
			c = sm * 1.5;
		} else if (sm >= 1001) {
			c = sm * 1;
		} else {
			c = sm * 0.75;
		}
		System.out.printf("O crédito que lhe foi concedido é R$ %.2f %n", (c));
	}
}