package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d, m, a;
		String mês;
		mês = "a";
		System.out.println("Insira a data no seguitne formato: dd mm aaaa");
		d = in.nextInt();
		m = in.nextInt();
		a = in.nextInt();
		switch (m) {
		case 1:
			mês = "Janeiro";
			break;
		case 2:
			mês = "Fevereiro";
			break;
		case 3:
			mês = "Março";
			break;
		case 4:
			mês = "Abril";
			break;
		case 5:
			mês = "Maio";
			break;
		case 6:
			mês = "Junho";
			break;
		case 7:
			mês = "Julho";
			break;
		case 8:
			mês = "Agosto";
			break;
		case 9:
			mês = "Setembro";
			break;
		case 10:
			mês = "Outrubro";
			break;
		case 11:
			mês = "Novembrp";
			break;
		case 12:
			mês = "Dezembro";
			break;
		}
		System.out.println("" + d + "/" + mês + "/" + a);
	}
}