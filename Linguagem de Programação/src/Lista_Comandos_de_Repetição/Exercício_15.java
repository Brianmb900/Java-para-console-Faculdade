package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, cont = 0;
		System.out.print("Digite um n�mero: ");
		n = in.nextInt();
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.print("O n�mero � primo");
		} else {
			System.out.print("O n�mero n�o � primo");
		}
	}
}