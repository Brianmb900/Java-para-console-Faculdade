package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mês, n, d, m, a;
		int z;
		mês = "a";
		System.out.println("Insira sua data de nascimento no seguitne formato: dd mm aaaa");
		d = in.next();
		m = in.next();
		a = in.next();
		n = d + m + a;
		z = Integer.parseInt(n) % 9;
		switch (z) {
		case 0:
			mês = "Irresistível";
			break;
		case 1:
			mês = "Impetuoso";
			break;
		case 2:
			mês = "Discreto";
			break;
		case 3:
			mês = "Amoroso";
			break;
		case 4:
			mês = "Tímido";
			break;
		case 5:
			mês = "Paquerador";
			break;
		case 6:
			mês = "Estudioso";
			break;
		case 7:
			mês = "Sohador";
			break;
		case 8:
			mês = "Charmoso";
			break;
		}
		System.out.println("Você é: " + mês);
	}
}