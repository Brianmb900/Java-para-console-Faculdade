package aula_1;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		Scanner En = new Scanner(System.in);
		double r, h, a, v;
		int o;
		do {
			System.out.println("Digite o raio da base do cone e sua altura para calcular o volume dele.");
			System.out.print("Digite o raio: ");
			r = En.nextDouble();
			System.out.print("Digite a altura: ");
			h = En.nextDouble();
			a = (Math.pow(r, 2)) * Math.PI;
			v = (a * h) / 3;
			System.out.printf("O volume é: %.2f %n", (v));
			System.out.print("Digite 1 para continuar ou 0 para sair: ");
			o = En.nextInt();
		} while (o == 1);
	}
}
