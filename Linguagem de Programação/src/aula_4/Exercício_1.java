package aula_4;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o número de elementos da lista:");
		int n = in.nextInt();
		int[] Numeros = new int[n];
		System.out.printf("Digite %d números:\n", n);
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = in.nextInt();
		}
		System.out.println("Números em ordem inversa:");
		for (int a = (Numeros.length - 1); a >= 0; a--) {
			System.out.println(Numeros[a]);
		}

	}

}
