package Lista_Strings;

import java.util.Scanner;

public class Exerc�cio_4 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n, cont = 0;
		System.out.print("Digite quantas strings ir�o ser inseridas: ");
		n = en.nextInt();
		en.nextLine();
		String v[] = new String[n], p;
		System.out.println("Digite as strings: ");
		for (int i = 0; i < n; i++) {
			v[i] = en.nextLine();
		}
		System.out.print("Digite uma nova string: ");
		p = en.nextLine();

		for (int i = 0; i < n; i++) {
			if (v[i].indexOf(p) != -1) {
				cont++;
			}
		}
		if (cont > 0) {
			System.out.println(cont + " strings tem a �ltima string digitada");
		} else {
			System.out.println("Nenhuma string possui a �ltima string digitada");
		}
	}
}