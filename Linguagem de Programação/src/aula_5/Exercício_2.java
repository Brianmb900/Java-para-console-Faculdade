package aula_5;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		String f1, f2;
		System.out.println("Digite duas frases:");
		f1 = en.nextLine();
		f2 = en.nextLine();
		System.out.println("As frases ir�o ser exibidas em ordem alfab�tica:");
		if (f1.compareToIgnoreCase(f2) < 0) {
			System.out.println(f1);
			System.out.println(f2);
		} else {
			System.out.println(f2);
			System.out.println(f1);
		}
	}
}