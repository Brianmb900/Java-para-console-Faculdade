package aula_3;

import java.util.Scanner;

public class Exemplo_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			n = in.nextInt();
			System.out.println(n * n);
		} while (n != 0);

	}

}
