package aula_5;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		String a;
		System.out.println("Digite uma frase:");
		a = en.nextLine();
		System.out.println("A frase digitada ira ser exibida de trás para frente");
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}