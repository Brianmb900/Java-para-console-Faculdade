package aula_6;

import java.util.Scanner;

public class Exerc�cio_2 {
	public static int somarN�meros(int a, int b) {
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
		System.out.println("Digite dois n�meros: ");
		n1 = en.nextInt();
		n2 = en.nextInt();
		System.out.printf("Somas do valores entre %d e %d: %d\n", n1, n2, somarN�meros(n1, n2));
	}
}