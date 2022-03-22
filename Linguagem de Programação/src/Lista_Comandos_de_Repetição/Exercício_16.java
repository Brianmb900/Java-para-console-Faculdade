package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, cont = 0;
		int cont2 = 0;
		System.out.print("Digite um número: ");
		n = in.nextInt();
		do {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					cont2++;
				}
			}
			if (cont2 >= 3) {
				cont2 = 0;
			}
			if (cont2 == 2) {
				System.out.println(n);
				cont2 = 0;
			}
			n = n - 1;
		} while (cont != n);
	}
}