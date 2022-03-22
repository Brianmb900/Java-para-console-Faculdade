package aula_5;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		String nome;
		System.out.print("Digite o seu nome: ");
		nome = en.nextLine();
		String[] separado = nome.split(" ");
		System.out.print(separado[separado.length - 1] + ", " + separado[0]);
	}
}