package aula_2;

import java.util.Scanner;

public class Exerc�cio_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sm, c;
		c = 1;
		System.out.print("Insira seu saldo m�dio: R$ ");
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
		System.out.printf("O cr�dito que lhe foi concedido � R$ %.2f %n", (c));
	}
}