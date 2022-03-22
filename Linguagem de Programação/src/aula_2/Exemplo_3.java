package aula_2;

import java.util.Scanner;

public class Exemplo_3 {
	public static void main(String[] args) {
		/* programa que determina o maior entre 2 números inteiros sem a premisa de quesão diferentes */
		Scanner in = new Scanner(System.in);
		int a, b, maior;
		System.out.print("Digite dois numeros inteiros:");
		a = in.nextInt();
		b = in.nextInt();
		if (a == b) {
			System.out.println("Os numeros sao iguais");
		} else {
			if (a > b) {
				maior = a;
			} else {
				maior = b;
			}
			System.out.println("Maior = " + maior);
		}
	}
}
