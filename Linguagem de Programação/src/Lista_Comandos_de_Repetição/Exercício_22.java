package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 1, n = 2;
		System.out.print("Digite um número: ");
		for (;;) {
			n2 += n1;
			System.out.println(n2);
			n1 += n2;
			System.out.println(n1);
		}
	}

}
