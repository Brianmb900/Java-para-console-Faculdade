package Lista_Comandos_de_Repeti��o;

import java.util.Scanner;

public class Exerc�cio_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, i, cont = 0;
		System.out.println("Insira um n�mero e quantos n�meros impares voc� quer que sejam exibidos:");
		n1 = in.nextInt();
		n2 = in.nextInt();
		for (i = n1; i > 0; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
				cont++;
			}
			if (cont == n2) {
				break;
			}
		}

	}

}
