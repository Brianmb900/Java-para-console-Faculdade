package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, n, cont = 0;
		System.out.println("Digite 3 n�meros:");
		n = in.nextInt();
		i = in.nextInt();
		j = in.nextInt();
		System.out.println(0);
		for (int a = 1; a >= 0; a++) {
			if (a % i == 0) {
				System.out.println(a);
				cont++;
			}
			if (a % j == 0) {
				System.out.println(a);
				cont++;
			}
			if (cont == n) {
				break;
			}
		}

	}

}
