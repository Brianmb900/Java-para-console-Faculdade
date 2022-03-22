package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, n3, cont;
		cont = 0;
		System.out.print("Insira o 1º número: ");
		n1 = in.nextInt();
		System.out.print("Insira o 2º número: ");
		n2 = in.nextInt();
		System.out.print("Insira o 3º número: ");
		n3 = in.nextInt();
		if (n1 < 0) {
			cont = cont + 1;
		}
		if (n2 < 0) {
			cont = cont + 1;
		}
		if (n3 < 0) {
			cont = cont + 1;
		}
		System.out.print("Há " + cont + " números negativos");

	}

}
