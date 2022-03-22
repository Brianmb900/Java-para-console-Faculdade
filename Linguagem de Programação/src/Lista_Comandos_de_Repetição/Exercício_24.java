package Lista_Comandos_de_Repetição;

import java.util.Scanner;

public class Exercício_24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, pot2;
		r = 0;
		pot2 = 1;
		System.out.print("Digite um número em forma binária para ele ser convertido: ");
		n = in.nextInt();
		while (n != 0) {
			r = r + n % 10 * pot2;
			n /= 10;
			pot2 *= 2;
		}System.out.print("Número convertido: "+r);
	}
}