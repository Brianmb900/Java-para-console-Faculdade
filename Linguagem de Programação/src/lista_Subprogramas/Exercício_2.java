package lista_Subprogramas;

import java.util.Scanner;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double va, vn;
		System.out.print("Digite o pre�o atual do produto: ");
		vn = en.nextDouble();
		System.out.print("Digite o pre�o antigo do produto: ");
		va = en.nextDouble();
		System.out.printf("O percentual de acr�scimo � de %d por cento \n", calcularPecentualdoAcr�scimo(va, vn));
	}

	public static int calcularPecentualdoAcr�scimo(double va, double vn) {
		int p = (int) ((vn * 100) / va) - 100;
		return p;
	}
}