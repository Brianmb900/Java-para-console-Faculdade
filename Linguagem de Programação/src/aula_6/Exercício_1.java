package aula_6;

import java.util.Scanner;

public class Exerc�cio_1 {
	public static boolean verificarSeONumeroePar(int n) {
		boolean par;
		if (n % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
	}

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n;
		System.out.print("Digite um n�mero inteiro: ");
		n = en.nextInt();
		if (verificarSeONumeroePar(n)) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		}
	}
}