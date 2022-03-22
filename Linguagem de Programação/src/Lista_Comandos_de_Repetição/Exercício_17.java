package Lista_Comandos_de_Repetição;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.##");

		double ma, s, mi, h, tt = 0;
		s = 0;
		mi = 0;
		h = 0;
		System.out.print("Insira a massa do material: ");
		ma = in.nextDouble();
		for (double i = ma; i >= 0.5; i = i / 2) {
			tt += 50;
			s = (tt % 3600) % 60;
			mi = (tt % 3600) / 60;
			h = tt / 3600;
		}
		System.out.println("Levou " + df.format(s) + " segundos");
		System.out.println("Levou " + df.format(mi) + " minutos");
		System.out.println("Levou " + df.format(h) + " horas");
	}

}
