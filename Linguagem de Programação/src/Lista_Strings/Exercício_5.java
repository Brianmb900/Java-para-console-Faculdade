package Lista_Strings;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n, cont = 0;
		char letra;
		System.out.print("Informe o numero de strings: ");
		n = en.nextInt();
		en.nextLine();
		System.out.print("Informe uma letra: ");
		letra = en.next().toLowerCase().charAt(0);
		en.nextLine();
		System.out.printf("Informe %d palavras que comecem com a letra %c\n", n, letra);
		String[] palavras = new String[n];
		while (cont < n) {
			palavras[cont] = en.nextLine().toLowerCase();
			if (palavras[cont].charAt(0) != letra) {
				System.out.printf("Esta palavra nao comeca com a letra %c\n", letra);
			} else {
				cont++;
			}
		}
		System.out.println("Palavras aceitas:");
		for (int i = 0; i < n; i++) {
			System.out.println(palavras[i]);
		}
	}
}