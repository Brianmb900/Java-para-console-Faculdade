package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Digite um inteiro positivo para calcular o quadrado dele ou 0 para sair: ");
		n = in.nextInt();
		for (int i = 1; n != 0; i++) {
			if (n > 0) {
				System.out.println(n * n);
			}
			n = in.nextInt();
		}

	}

}
