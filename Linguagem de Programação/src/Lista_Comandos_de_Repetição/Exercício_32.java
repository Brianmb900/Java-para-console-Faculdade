package Lista_Comandos_de_Repetição;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício_32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.##");
		double p, id, idt = 0, pt = 0, mp = 0, mi = 0, medi, medp;
		for (int i = 1; i <= 11; i++) {
			System.out.printf("Digite a idade e peso do %dºjogador: \n", i);
			id = in.nextDouble();
			p = in.nextDouble();
			idt += id;
			pt += p;
			if (i == 0) {
				mp = p;
				mi = id;
			}
			if (id > mi) {
				mi = id;
			}
			if (p > mp) {
				mp = p;
			}
		}
		medi = idt / 11;
		medp = pt / 11;
		System.out.println("A idade média do time é: " + df.format(medi) + " anos");
		System.out.println("O peso médiodo time é: " + df.format(medp) + " Kg");
		System.out.println("O maior peso do time é: " + mp + " Kg");
		System.out.println("A maior idade do time é: " + mi + " anos");
	}

}
