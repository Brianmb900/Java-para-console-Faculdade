package Lista_Vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o n�mero de elementos da lista:");
		int n = in.nextInt();
		int cont = 0;
		int[] numeros = new int[n];
		System.out.printf("Digite %d n�meros:\n", n);
		for (int a = 0; a < numeros.length; a++) {
			numeros[a] = in.nextInt();
		}
		System.out.println("N�meros positivos");
		for (int b: numeros) {
			if (b >= 0) {
				System.out.println(b);
				cont++;
			}
		}
		if (cont == 0) {
			System.out.print("N�o existe n�mero positivo");

		}
	}

}
