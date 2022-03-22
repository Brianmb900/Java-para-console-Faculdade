package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double va, vn;
		System.out.print("Digite o preço atual do produto: ");
		vn = en.nextDouble();
		System.out.print("Digite o preço antigo do produto: ");
		va = en.nextDouble();
		System.out.printf("O percentual de acréscimo é de %d por cento \n", calcularPecentualdoAcréscimo(va, vn));
	}

	public static int calcularPecentualdoAcréscimo(double va, double vn) {
		int p = (int) ((vn * 100) / va) - 100;
		return p;
	}
}