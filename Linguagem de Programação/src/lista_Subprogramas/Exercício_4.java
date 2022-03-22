package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int t;
		System.out.print("Digite quantas strings haverão no vetor: ");
		t = en.nextInt();
		en.nextLine();
		String[] vetor = new String[t];
		for (int a = 0; a < t; a++) {
			System.out.printf("Digite a %dª string: ", a + 1);
			vetor[a] = en.nextLine();
		}
		System.out.print(verificarOrdemAlfabetica(vetor));
	}

	public static boolean verificarOrdemAlfabetica(String[] vetor) {
		boolean v = true;
		for (int a = 0; a < vetor.length - 1; a++) {
			if (vetor[a].compareToIgnoreCase(vetor[a + 1]) > 0) {
				v = false;
				break;
			}
		}
		return v;
	}
}