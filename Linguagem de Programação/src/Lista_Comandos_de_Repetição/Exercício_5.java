package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n;
		System.out.println("Insira 10 n�meros para que o quadrado deles sejam calculados");
		for (int i = 0; i <= 9; i++) {
			n = in.nextDouble();
			System.out.println(Math.pow(n, 2));

		}

	}
}
