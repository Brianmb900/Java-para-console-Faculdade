package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.print("Insira o 1º número: ");
		n1 = in.nextInt();
		System.out.print("Insira o 2º número: ");
		n2 = in.nextInt();
		if (n1 > n2) {
			System.out.println(n1);
			System.out.print(n2);
		}
		else {
			System.out.println(n2);
			System.out.print(n1);
		}

	}
}