package lista_Subprogramas;

import java.util.Scanner;

public class Exerc�cio_3 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double[] notas = new double[3];
		String ap;
		for (int a = 0; a < 3; a++) {
			System.out.printf("Digite a %d� nota do aluno(a): ", a + 1);
			notas[a] = en.nextDouble();
		}
		System.out.print("Digite A para m�dia aritm�tica ou P para m�dia Ponderada: ");
		ap = en.next();
		System.out.printf("A m�dia do aluno(a) � %.2f \n", calcularMedia(notas, ap));
	}

	public static double calcularMedia(double[] notas, String ap) {
		double m�dia;
		if (ap.equals("A")) {
			m�dia = (notas[0] + notas[1] + notas[2]) / 3;
		} else {
			m�dia = ((notas[0] * 5) + (notas[1] * 3) + (notas[2] * 2)) / 10;
		}
		return m�dia;
	}
}