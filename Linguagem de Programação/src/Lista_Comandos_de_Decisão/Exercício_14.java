package Lista_Comandos_de_Decis�o;

import java.util.Scanner;

public class Exerc�cio_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double vp, vv;
		System.out.print("Insira o valor do prouto: R$ ");
		vp = in.nextDouble();
		if (vp < 20) {
			vv = vp + (vp * 0.45);
		}else {
			vv = vp + (vp * 0.3);
		}
		System.out.printf("O valor da venda �: R$ %.2f %n", (vv));

	}
}
