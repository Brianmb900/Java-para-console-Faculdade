package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String m�s, n, d, m, a;
		int z;
		m�s = "a";
		System.out.println("Insira sua data de nascimento no seguitne formato: dd mm aaaa");
		d = in.next();
		m = in.next();
		a = in.next();
		n = d + m + a;
		z = Integer.parseInt(n) % 9;
		switch (z) {
		case 0:
			m�s = "Irresist�vel";
			break;
		case 1:
			m�s = "Impetuoso";
			break;
		case 2:
			m�s = "Discreto";
			break;
		case 3:
			m�s = "Amoroso";
			break;
		case 4:
			m�s = "T�mido";
			break;
		case 5:
			m�s = "Paquerador";
			break;
		case 6:
			m�s = "Estudioso";
			break;
		case 7:
			m�s = "Sohador";
			break;
		case 8:
			m�s = "Charmoso";
			break;
		}
		System.out.println("Voc� �: " + m�s);
	}
}