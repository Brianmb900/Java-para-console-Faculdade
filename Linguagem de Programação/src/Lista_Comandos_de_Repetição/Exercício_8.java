package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, k, b;
		System.out.println("Digite um n�mero n e um n�mero k para elevar n: ");
		n = in.nextInt();
		k = in.nextInt();
		b = n;
		for (int i = 1; i <= k; i++) {
			if (i == 1) {
				System.out.println(n);
			} else {
				System.out.println(n = b * n);
			}

		}

	}
}
