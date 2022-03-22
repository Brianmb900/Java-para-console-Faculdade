package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		System.out.print("Insira a idade do nadador: ");
		i = in.nextInt();
		if (i <= 10) {
			System.out.print("R$ 150,00");
		} else if (i > 10 && i <= 18) {
			System.out.print("R$ 250,00");
		} else if (i <= 24 && i > 18) {
			System.out.print("R$ 300,00");
		} else if (i <= 50 && i > 24) {
			System.out.print("R$ 500,00");
		} else if (i > 50 && i <= 65){
			System.out.print("R$ 750,00");
		}else {
			System.out.print("R$ 900,00");
		}

	}

}
