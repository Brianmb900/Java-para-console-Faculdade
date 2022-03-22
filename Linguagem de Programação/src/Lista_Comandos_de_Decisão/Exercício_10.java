package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l1, l2, l3, sl12, sl13, sl23;
		System.out.print("Insira o 1º lado: ");
		l1 = in.nextInt();
		System.out.print("Insira o 2º lado: ");
		l2 = in.nextInt();
		System.out.print("Insira o 3º lado: ");
		l3 = in.nextInt();
		sl12 = l1 + l2;
		sl13 = l1 + l3;
		sl23 = l2 + l3;
		if (l1 < sl23 && l2 < sl13 && l3 < sl12) {
			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.print("Isto é um triângulo equilátero");
			} else if (l1 == l2 || l2 == l3 || l3 == l1) {
				System.out.print("Isto é um triângulo isóceles");
			} else if (l1 != l2 && l1 != l3 && l2 != l3) {
				System.out.print("Isto é um triângulo escaleno");
			}
		} else {
			System.out.print("Não é um triângulo");
		}

	}
}
