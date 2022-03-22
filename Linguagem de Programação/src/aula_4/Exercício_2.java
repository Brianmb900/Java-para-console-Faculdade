package aula_4;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o n�mero de elementos da lista:");
		int n = in.nextInt();
		int cont = 0;
		int[] Numeros = new int[n];
		System.out.printf("Digite %d n�meros:\n", n);
		for (int a = 0; a < Numeros.length; a++) {
			Numeros[a] = in.nextInt();
		}
		System.out.println("N�meros pares:");
		for (int b = 0; b < Numeros.length; b++) {
			if (Numeros[b] % 2 == 0) {
				System.out.println(Numeros[b]);
				cont++;
			}
		}
		/*Usando Enhanced-for/For-each
		System.out.println("N�meros pares:");
		for (int b: Numeros) {
			if (Numeros[b] % 2 == 0) {
				System.out.println(Numeros[b]);
				cont++;
			}
		}*/
		if (cont == 0) {
			System.out.print("N�o existe nenhum n�mero par na lista");
		}

	}

}
