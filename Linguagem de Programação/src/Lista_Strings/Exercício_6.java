package Lista_Strings;

import java.util.Scanner;

public class Exercício_6 {
	// URI 1581
	
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int N = en.nextInt();
		for (int y = 0; y < N; y++) {
			boolean diferentes = false;
			int quantLinguas = en.nextInt();
			en.nextLine();
			String[] lingua = new String[quantLinguas];
			for (int i = 0; i < quantLinguas; i++) {
				lingua[i] = en.nextLine();
			}

			String compara = lingua[0];
			for (int i = 1; i < quantLinguas; i++) {
				if (!compara.equals(lingua[i])) {
					diferentes = true;
					break;
				}
			}

			if (!diferentes) {
				System.out.println(lingua[0]);
			} else {
				System.out.println("ingles");
			}
		}
		en.close();
	}
}