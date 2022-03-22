package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s;
		String n;
		System.out.println("Insira seu nome e sexo (h/m)");
		n = in.next();
		s = in.next().charAt(0);
		System.out.print((s == 'h' ? "Muito obrigado, Sr." + n + "!" : "Muito obrigado, Sra." + n + "!"));
	}
}