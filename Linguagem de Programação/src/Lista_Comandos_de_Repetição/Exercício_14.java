package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r;
		System.out.print("Digite um n�mero: ");
		n = in.nextInt();
		for (int a = n; a > 0; a--) {
			r = (a) * (a - 1) * (a - 2);
			if (r == n) {
				System.out.print("O n�mero digitado � triangualar");
			}
		}
		System.out.print("O n�mero digitado n�o � triangular");

	}

}
