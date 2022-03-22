package lista_Subprogramas;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double[] notas = new double[3];
		String ap;
		for (int a = 0; a < 3; a++) {
			System.out.printf("Digite a %dº nota do aluno(a): ", a + 1);
			notas[a] = en.nextDouble();
		}
		System.out.print("Digite A para média aritmética ou P para média Ponderada: ");
		ap = en.next();
		System.out.printf("A média do aluno(a) é %.2f \n", calcularMedia(notas, ap));
	}

	public static double calcularMedia(double[] notas, String ap) {
		double média;
		if (ap.equals("A")) {
			média = (notas[0] + notas[1] + notas[2]) / 3;
		} else {
			média = ((notas[0] * 5) + (notas[1] * 3) + (notas[2] * 2)) / 10;
		}
		return média;
	}
}