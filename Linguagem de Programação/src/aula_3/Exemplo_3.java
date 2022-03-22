package aula_3;

import java.util.Scanner;

public class Exemplo_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 0) {
			System.out.println(n * n);
			n = in.nextInt();
		}

	}

}
