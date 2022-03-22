package aula_2;

import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args) {
		/* programa que determina o maior entre 2 números inteiros diferentes */
		Scanner in = new Scanner(System.in);
		int a, b, maior;
		System.out.print("Digite 2 numeros inteiros diferentes: ");
		a = in.nextInt();
		b = in.nextInt();
		if (a > b) {
			maior = a;
		} else {
			maior = b;
		}
		System.out.println("Maior = " + maior);

	}

}
