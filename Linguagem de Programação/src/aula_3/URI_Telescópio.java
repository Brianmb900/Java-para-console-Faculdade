package aula_3;

import java.util.Scanner;

public class URI_Telesc�pio {

	public static void main(String[] args) {
		int at, ne, ff, cont = 0, m;
		Scanner in = new Scanner(System.in);
		System.out.print("Insira a abertura do telesc�pio: ");
		at = in.nextInt();
		System.out.print("Insira o n�mero de estrelas a serem estudadas: ");
		ne = in.nextInt();
		System.out.println("Insira o fluxo de f�tons de cada estrela:");
		for (int i = 0; i < ne; i++) {
			ff = in.nextInt();
			m = at * ff;
			if (m >= 40000000) {
				cont++;
			}
		}
		System.out.println(cont);

	}
}