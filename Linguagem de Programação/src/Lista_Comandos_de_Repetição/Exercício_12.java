package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r = 1;
		System.out.print("Digite um número para ser fatorado: ");
		n = in.nextInt();
		for (int i = n; i >= 1 && i <= i; i--) {
			r = r * i;
		}
		System.out.print(r);

	}

}
