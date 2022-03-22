package Lista_Vetores_e_Matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.##");
		float t[] = new float[13], ma = 0, me = 0;
		int mea = 0, mee = 0;
		for (int i = 1; i <= 12; i++) {
			System.out.printf("Digite a temperatura do %dº mês: ", i);
			t[i] = en.nextFloat();
			if (i == 1) {
				ma = t[i];
				me = t[i];
			}
			if (t[i] < me) {
				me = t[i];
				mee = i;
			} else if (t[i] > ma) {
				ma = t[i];
				mea = i;
			}
		}
		System.out.println();
		for (int i = 1; i <= 12; i++) {
			System.out.printf("Temperatura do mês %d = %s°C \n", i, df.format(t[i]));
		}
		System.out.println();
		System.out.printf("A maior temperatura foi %s°C, ocorrendo no mês %d \n", df.format(ma), mea);
		System.out.printf("A menor temperatura foi %s°C, ocorrendo no mês %d", df.format(me), mee);
	}

}