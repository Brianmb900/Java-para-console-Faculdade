package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc�cio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Digite 10 n�meros:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
		System.out.println("Listagem dos n�meros");
		for (int a = 0; a < numeros.length; a++) {
			if (numeros[a] % 2 == 0) {
				System.out.println("O n�mero " + numeros[a] + " � par");
			} else {
				System.out.println("O n�mero " + numeros[a] + " � impar");
			}
		}

	}

}
