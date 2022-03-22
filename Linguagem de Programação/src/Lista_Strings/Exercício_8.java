package Lista_Strings;

import java.util.Scanner;

public class Exercício_8 {

	public static void main(String[] args) {
		// URI 2694
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int[][] limites = new int[3][2];
		String str = in.next();
		int index = 0;
		int tam = str.length();
		for (int i = 0; i < tam; i++) {
			if (Character.isDigit(str.charAt(i))) {
				limites[index][0] = i;
				int j;
				for (j = i + 1; j < tam; j++) {
					if (Character.isLetter(str.charAt(j))) {
						break;
					}
				}
				limites[index++][1] = j;
				i = j;
			}
		}
		int soma = 0;
		for (int i = 0; i < 3; i++) {
			soma += Integer.parseInt(str.substring(limites[i][0], limites[i][1]));
		}
		System.out.println(soma);

		for (int i = 1; i < n; i++) {
			str = in.next();
			soma = 0;
			for (int j = 0; j < 3; j++) {
				soma += Integer.parseInt(str.substring(limites[j][0], limites[j][1]));
			}
			System.out.println(soma);
		}
	}

}
