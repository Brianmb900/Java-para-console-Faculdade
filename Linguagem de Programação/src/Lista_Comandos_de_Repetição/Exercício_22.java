package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0, n2 = 1, n = 2;
		System.out.print("Digite um n�mero: ");
		for (;;) {
			n2 += n1;
			System.out.println(n2);
			n1 += n2;
			System.out.println(n1);
		}
	}

}
