package aula_3;

import java.util.Scanner;

public class URI_Elevador {

	public static void main(String[] args) {
		int nl, cp, s, e, c = 0;
		String r = "N";
		Scanner in = new Scanner(System.in);
		System.out.print("Insira quantidade de leituras realizadas pelo elevador: ");
		nl = in.nextInt();
		System.out.print("Insira a capacidade máxima do elevador: ");
		cp = in.nextInt();
		System.out.println("Insira as sáidas e entradas do elevador");
		for (int i = 0; i < nl; i++) {
			s = in.nextInt();
			e = in.nextInt();
			c += e - s;
			if (c > cp) {
				r = "S";
			}
			System.out.println(r);

		}
		
	}

}
