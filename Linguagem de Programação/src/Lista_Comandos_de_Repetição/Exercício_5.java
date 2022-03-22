package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n;
		System.out.println("Insira 10 números para que o quadrado deles sejam calculados");
		for (int i = 0; i <= 9; i++) {
			n = in.nextDouble();
			System.out.println(Math.pow(n, 2));

		}

	}
}
