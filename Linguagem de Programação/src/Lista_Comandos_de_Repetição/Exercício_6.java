package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_6 {

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
