package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, na, nf, m;
		System.out.print("Insira a 1� nota: ");
		n1 = in.nextDouble();
		System.out.print("Insira a 2� nota: ");
		n2 = in.nextDouble();
		System.out.print("Insira a 3� nota: ");
		n3 = in.nextDouble();
		System.out.print("Insira a quantidade de aulas: ");
		na = in.nextDouble();
		System.out.print("Insira a quantidade de faltas: ");
		nf = in.nextDouble();
		na = na * 0.25;
		m = (n1 + n2 + n3) / 3;
		if (nf > na) {
			System.out.println("REPROVADO");
			System.out.print("Sua m�dia foi: " + m);
		} else {
			if (m >= 7) {
				System.out.println("APROVADO");
			} else if (m < 3) {
				System.out.println("REPROVADO");
			} else {
				System.out.println("EXAME");
			}System.out.print("Sua m�dia foi: " + m);
		}
	}
}
