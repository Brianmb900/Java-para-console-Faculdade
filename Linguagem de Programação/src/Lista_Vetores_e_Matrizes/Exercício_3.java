package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Digite 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
		System.out.println("Listagem dos números");
		for (int a = 0; a < numeros.length; a++) {
			if (numeros[a] % 2 == 0) {
				System.out.println("O número " + numeros[a] + " é par");
			} else {
				System.out.println("O número " + numeros[a] + " é impar");
			}
		}

	}

}
