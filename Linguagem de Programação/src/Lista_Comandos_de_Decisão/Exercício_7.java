package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.print("Insira o 1� n�mero: ");
		n1 = in.nextInt();
		System.out.print("Insira o 2� n�mero: ");
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