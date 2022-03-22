package Lista_Strings;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		String a, ca = "", ce = "", ci = "", co = "", cu = "";
		int n = 0, A = 0, e = 0, I = 0, o = 0, u = 0;
		System.out.println("Digite uma frase: ");
		a = en.nextLine();
		a = a.toLowerCase();
		char b[] = a.toCharArray();
		for (int i = 0; i <= a.length() - 1; i++) {
			if (b[i] == 'a') {
				ca += "*";
				A++;
			} else if (b[i] == 'e') {
				ce += "*";
				e++;
			} else if (b[i] == 'i') {
				ci += "*";
				I++;
			} else if (b[i] == 'o') {
				co += "*";
				o++;
			} else if (b[i] == 'u') {
				cu += "*";
				u++;
			}
		}
			System.out.println("a:" + ca + "(" + A + ")");
			System.out.println("e:" + ce + "(" + e + ")");
			System.out.println("o:" + co + "(" + o + ")");
			System.out.println("i:" + ci + "(" + I + ")");
			System.out.println("u:" + cu + "(" + u + ")");
	}
}