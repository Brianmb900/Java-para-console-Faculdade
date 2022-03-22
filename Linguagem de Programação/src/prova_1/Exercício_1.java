package prova_1;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int R, M, L;
		System.out.print("Insira o seu resultado: ");
		R = en.nextInt();
		while (R < 1 || R > 1000) {
			System.out.print("Valor incorreto insira o seu resultado novamente: ");
			R = en.nextInt();
		}
		System.out.print("Insira o recorde mundial: ");
		M = en.nextInt();
		while (M < 1 || M > 1000) {
			System.out.print("Valor incorreto insira o recorde mundial novamente: ");
			M = en.nextInt();
		}
		System.out.print("Insira o recorde olimpíco: ");
		L = en.nextInt();
		while (L < 1 || L > 1000) {
			System.out.print("Valor incorreto insira o recorde olimpíco novamente: ");
			L = en.nextInt();
		}
		if (R < M) {
			System.out.println("RM");
		} else {
			System.out.println("*");
		}
		if (R < L) {
			System.out.println("RO");
		} else {
			System.out.println("*");
		}
	}
}