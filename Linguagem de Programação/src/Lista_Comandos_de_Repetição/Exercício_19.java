package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, r, an, at = 0;
		System.out.println("Digite dois n�meros para calcular o m�ximo divisor comum deles: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		an = n1;
		at = n2;
		r = an % at;
		while (r != 0) {
			an = at;
			at = r;
			r = an % at;
		}
		System.out.print("O mdc �: " + at);

	}

}
