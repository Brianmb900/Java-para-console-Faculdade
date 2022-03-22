package Lista_Comandos_de_Decisão;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double a, b, c, d, x1, x2;
		System.out.print("Insira o valor de a: ");
		a = in.nextDouble();
		System.out.print("Insira o valor de b: ");
		b = in.nextDouble();
		System.out.print("Insira o valor de c: ");
		c = in.nextDouble();
		d = (Math.pow(b, 2)) - (4 * a * c);
		x1 = (-b + Math.sqrt(d)) / (2 * a);
		x2 = (-b - Math.sqrt(d)) / (2 * a);
		if (d < 0) {
			System.out.print("Não possui raiz real");
		}
		else if (d == 0) {
			System.out.printf("Possui duas raizez reais idênticas: %.2f %n", (x1));
		} else {
			System.out.printf("Possui duas raizes reais diferentes. x1: " + df.format(x1) + " e x2: "+ df.format(x2));
		}

	}

}
