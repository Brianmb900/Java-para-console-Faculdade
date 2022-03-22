package Lista_Vetores_e_Matrizes;

import java.util.Random;

public class Exercício_23 {

	public static void main(String[] args) {
		Random rand = new Random();
		double[][] vendas = new double[12][4];
		System.out.println("Vendas do Ano");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 4; j++) {
				vendas[i][j] = rand.nextDouble() * 1000000;
				System.out.printf("%10.2f\t", vendas[i][j]);
			}
			System.out.println();
		}
		double vendasMes;
		System.out.println("\nTotal de vendas por mes");
		for (int i = 0; i < 12; i++) {
			vendasMes = 0;
			for (int j = 0; j < 4; j++) {
				vendasMes += vendas[i][j];
			}
			System.out.printf("Mes %2d: R$ %.2f\n", i + 1, vendasMes);
		}
		double vendasSemana, totalVendas = 0;
		System.out.println("\nTotal de vendas por semana");
		for (int j = 0; j < 4; j++) {
			vendasSemana = 0;
			for (int i = 0; i < 12; i++) {
				vendasSemana += vendas[i][j];
			}
			System.out.printf("Semana %d: R$ %.2f\n", j + 1, vendasSemana);
			totalVendas += vendasSemana;
		}
		System.out.printf("\nTotal de vendas no ano: R$ %.2f\n", totalVendas);
	}

}