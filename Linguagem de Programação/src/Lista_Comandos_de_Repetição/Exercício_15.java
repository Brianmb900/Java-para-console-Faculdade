package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, cont = 0;
		System.out.print("Digite um número: ");
		n = in.nextInt();
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.print("O número é primo");
		} else {
			System.out.print("O número não é primo");
		}
	}
}