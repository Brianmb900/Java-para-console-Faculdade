package aula_6;

import java.util.Scanner;

public class Exercício_2 {
	public static int somarNúmeros(int a, int b) {
		int soma = 0;
		if (a > b) {
			for (int i = b; i <= a; i++) {
				soma += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				soma += i;
			}
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite dois números: ");
		n1 = en.nextInt();
		n2 = en.nextInt();
		System.out.printf("Somas do valores entre %d e %d: %d\n", n1, n2, somarNúmeros(n1, n2));
	}
}