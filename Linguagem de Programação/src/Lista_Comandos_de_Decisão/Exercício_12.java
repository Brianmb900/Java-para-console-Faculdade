package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dn, da, mn, ma, an, aa, i;
		System.out.println("Digite sua data de nascimetno no formato: dd mm aaaa");
		dn = in.nextInt();
		mn = in.nextInt();
		an = in.nextInt();
		System.out.println("Digite a data atual no formato: dd mm aaaa");
		da = in.nextInt();
		ma = in.nextInt();
		aa = in.nextInt();
		i = aa - an;
		if(ma < mn) {
			i--;
		}
		else if(ma == mn) {
			if (da < dn) {
				i--;
			}
		}
		System.out.print("Sua idade é: " + i + "anos");

	}

}
