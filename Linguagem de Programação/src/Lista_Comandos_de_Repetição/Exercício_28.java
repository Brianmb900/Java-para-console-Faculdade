package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ai;
		double pai, pbi;
		System.out.println("Digite as popula��es iniciais americanas e brasileiras e o ano:");
		pai = in.nextDouble();
		pbi = in.nextDouble();
		ai = in.nextInt();
		do {
			pbi += (pbi * 0.04);
			pai += (pai * 0.02);
			ai += 1;
		} while (pbi <= pai);
		System.out.print("No ano " + ai + " a popula��o brasileira superou ou igualou a americana");
	}
}