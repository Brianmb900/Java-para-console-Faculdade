package aula_2;

import java.util.Scanner;

public class Exemplo_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float preco, custo;
		int num_ingressos;
		System.out.print("Preco do ingresso: R$ ");
		preco = in.nextFloat();
		System.out.print("Numero de ingressos: ");
		num_ingressos = in.nextInt();
		custo = num_ingressos * preco;
		if (num_ingressos > 5) {
			custo = custo - custo * 0.2F;
		}
		System.out.printf("Custo de %d ingressos: R$ %.2f\n", num_ingressos, custo);//%d é usado para exibir inteiros na base decimal
	}
}
