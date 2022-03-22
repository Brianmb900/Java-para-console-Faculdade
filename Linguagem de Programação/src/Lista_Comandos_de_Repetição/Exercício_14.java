package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r;
		System.out.print("Digite um número: ");
		n = in.nextInt();
		for (int a = n; a > 0; a--) {
			r = (a) * (a - 1) * (a - 2);
			if (r == n) {
				System.out.print("O número digitado é triangualar");
			}
		}
		System.out.print("O número digitado não é triangular");

	}

}
