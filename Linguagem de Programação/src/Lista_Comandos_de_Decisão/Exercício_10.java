package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l1, l2, l3, sl12, sl13, sl23;
		System.out.print("Insira o 1� lado: ");
		l1 = in.nextInt();
		System.out.print("Insira o 2� lado: ");
		l2 = in.nextInt();
		System.out.print("Insira o 3� lado: ");
		l3 = in.nextInt();
		sl12 = l1 + l2;
		sl13 = l1 + l3;
		sl23 = l2 + l3;
		if (l1 < sl23 && l2 < sl13 && l3 < sl12) {
			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.print("Isto � um tri�ngulo equil�tero");
			} else if (l1 == l2 || l2 == l3 || l3 == l1) {
				System.out.print("Isto � um tri�ngulo is�celes");
			} else if (l1 != l2 && l1 != l3 && l2 != l3) {
				System.out.print("Isto � um tri�ngulo escaleno");
			}
		} else {
			System.out.print("N�o � um tri�ngulo");
		}

	}
}
