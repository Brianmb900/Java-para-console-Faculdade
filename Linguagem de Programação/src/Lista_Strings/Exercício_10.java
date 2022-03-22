package Lista_Strings;

import java.util.Scanner;

public class Exercício_10 {

	public static void main(String[] args) {
		// URI 2815
		Scanner in = new Scanner(System.in);
		String fraseModificada = "";
		String frase = in.nextLine();
		String[] palavras = frase.split(" ");
		for (int x = 0; x < palavras.length; x++) {
			if (palavras[x].length() >= 4) {
				if (palavras[x].substring(0, 2).equals(palavras[x].substring(2, 4))) {
					palavras[x] = palavras[x].substring(2);
				}
			}
		}

		for (int x = 0; x < palavras.length; x++) {
			fraseModificada += palavras[x] + " ";
		}

		System.out.println(fraseModificada.trim());
	}

}