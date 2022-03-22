package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, pideal;
		char s;
		System.out.print("Insira sua altura e sexo (h/m): ");
		a = in.nextDouble();
		s = in.next().charAt(0);
		if (s == 'h') {
			pideal = (72.7 * a) - 58;
		}else {
			pideal = (62.1 * a) - 44.7;
		}
		System.out.printf("Seu peso ideal é: %.2f %n", (pideal) );
	}

}
