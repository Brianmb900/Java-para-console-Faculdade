package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d, m, a;
		String m�s;
		m�s = "a";
		System.out.println("Insira a data no seguitne formato: dd mm aaaa");
		d = in.nextInt();
		m = in.nextInt();
		a = in.nextInt();
		switch (m) {
		case 1:
			m�s = "Janeiro";
			break;
		case 2:
			m�s = "Fevereiro";
			break;
		case 3:
			m�s = "Mar�o";
			break;
		case 4:
			m�s = "Abril";
			break;
		case 5:
			m�s = "Maio";
			break;
		case 6:
			m�s = "Junho";
			break;
		case 7:
			m�s = "Julho";
			break;
		case 8:
			m�s = "Agosto";
			break;
		case 9:
			m�s = "Setembro";
			break;
		case 10:
			m�s = "Outrubro";
			break;
		case 11:
			m�s = "Novembrp";
			break;
		case 12:
			m�s = "Dezembro";
			break;
		}
		System.out.println("" + d + "/" + m�s + "/" + a);
	}
}