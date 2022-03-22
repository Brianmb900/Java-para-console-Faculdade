package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		System.out.print("Digite sua idade: ");
		i = in.nextInt();
		if (i < 16) {
			System.out.print("Não pode votar");
		} else if (i >= 16 && i < 18 || i >= 65) {
			System.out.print("Voto faccultativo");
		} else {
			System.out.print("Voto obrigatório");
		}
	}

}
