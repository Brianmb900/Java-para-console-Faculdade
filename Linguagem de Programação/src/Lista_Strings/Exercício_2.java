package Lista_Strings;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int cont = 0;
		String a;
		boolean t;
		System.out.println("Digite uma frase:");
		a = en.nextLine();
		char b[] = a.toCharArray();
		for (int i = 0; i <= a.length() - 1; i++) {
			t = Character.isUpperCase(b[i]);
			if (t) {
				cont++;
			}
		}
		System.out.println("Essa frase possui " + cont + " letras maiúsculas");
	}
}