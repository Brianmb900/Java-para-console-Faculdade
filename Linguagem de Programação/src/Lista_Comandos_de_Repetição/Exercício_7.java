package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, l;
		System.out.print("Digite um num�ro para atuar como limite: ");
		l = in.nextInt();
		for (i = 0; i < l; i = i + 2) {
			if (i > 0) {
				System.out.println(i);

			}

		}
	}

}
