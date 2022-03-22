package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, l;
		System.out.print("Digite um numéro para atuar como limite: ");
		l = in.nextInt();
		for (i = 0; i < l; i = i + 2) {
			if (i > 0) {
				System.out.println(i);

			}

		}
	}

}
