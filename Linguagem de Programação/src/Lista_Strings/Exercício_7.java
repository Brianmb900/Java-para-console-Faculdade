package Lista_Strings;

import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		// URI 1024
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), half, length;
		in.nextLine();
		for (int i = 0; i < n; i++) {
			StringBuffer m = new StringBuffer(in.nextLine());
			length = m.length();
			half = length / 2;
			for (int j = 0; j < length; j++) {
				if (Character.isLetter(m.charAt(j))) {
					m.setCharAt(j, (char) (m.charAt(j) + 3));
				}
			}
			m.reverse();
			for (int j = half; j < length; j++) {
				m.setCharAt(j, (char) (m.charAt(j) - 1));
			}
			System.out.println(m);
		}
	}

}