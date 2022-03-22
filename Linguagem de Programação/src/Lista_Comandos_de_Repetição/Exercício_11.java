package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, cont = 0;
		System.out.println("Digite um número para ser divido e outro para dividi-lo:");
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
