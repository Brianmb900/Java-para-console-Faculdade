package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, cont = 0;
		System.out.println("Digite um n�mero para ser divido e outro para dividi-lo:");
		x = in.nextInt();
		y = in.nextInt();
		for (int i = x; i > 0; i = i - y) {
			if (y > x) {
				break;
			} else {
				cont++;
			}

		}
		System.out.print(cont);

	}

}
