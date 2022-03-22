package lista_Tratamento_Exceções;

import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		int[] counts = new int[26];
		int i = 0;
		Scanner in = new Scanner(System.in);
		// recebe a palavra do usuário
		System.out.print("Informe uma unica palavra (apenas letras, por favor): ");
		String word = in.nextLine();
		// converte para maiúsculo
		word = word.toUpperCase();
		// conta a frequência de cada letra na palavra
		for (i = 0; i < word.length(); i++) {
			try {
				counts[word.charAt(i) - 'A']++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Caractere inválido: " + word.charAt(i));
			}
		}
		// imprime as frequências
		System.out.println();
		for (i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((char) (i + 'A') + ": " + counts[i]);
			}
		}
	}
}