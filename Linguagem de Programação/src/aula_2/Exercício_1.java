package aula_2;

import java.util.Scanner;

public class Exercício_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, m;
		System.out.print("Digite a primeira nota: ");
		n1 = in.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = in.nextDouble();
		m = (n1 + n2) / 2;
		if (m >= 6) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
	}
}