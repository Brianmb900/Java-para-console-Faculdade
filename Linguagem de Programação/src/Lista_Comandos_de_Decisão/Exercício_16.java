package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		System.out.print("Insira a idade do nadador: ");
		i = in.nextInt();
		if (i <= 17 && i >= 14) {
			System.out.print("JUVENIL B");
		} else if (i <= 13 && i >= 11) {
			System.out.print("JUVENIL A");
		} else if (i <= 10 && i >= 8) {
			System.out.print("INFANTIL B");
		} else if (i <= 7 && i >= 5) {
			System.out.print("INFANTIL A");
		} else {
			System.out.print("ADULTO");
		}

	}

}
