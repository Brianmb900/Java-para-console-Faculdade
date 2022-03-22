package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, i, cont = 0;
		System.out.println("Insira um número e quantos números impares você quer que sejam exibidos:");
		n1 = in.nextInt();
		n2 = in.nextInt();
		for (i = n1; i > 0; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
				cont++;
			}
			if (cont == n2) {
				break;
			}
		}

	}

}
