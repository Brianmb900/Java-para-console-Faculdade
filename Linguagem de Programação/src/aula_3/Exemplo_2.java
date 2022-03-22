package aula_3;

import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double media = 0;
		int n;
		System.out.print("Quantidade de numeros: ");
		n = in.nextInt();
		System.out.println("Informe " + n + " numeros inteiros:");
		for (int i = 1; i <= n; i++) {
			media += in.nextInt();
		}
		media /= n;
		System.out.printf("Media: %.2f\n", media);
		in.close();
	}

}
