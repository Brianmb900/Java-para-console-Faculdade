package Lista_Comandos_de_Repeti��o;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio_27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.##");
		double c, j, m = 0;
		System.out.println("Digite a quantidade de capital investido e o valor do juros:");
		c = in.nextDouble();
		j = in.nextDouble();
		m = c;
		System.out.println("Valor do montante em cada m�s:");
		for (int i = 1; i <= 12; i++) {
			m *= (1 + (j / 100));
			System.out.println(df.format(m));
		}
	}
}