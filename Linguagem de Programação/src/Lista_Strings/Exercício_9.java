package Lista_Strings;

import java.util.Scanner;

public class Exercício_9 {
	public static void main(String[] args) {
		// URI 1871
		Scanner in = new Scanner(System.in);
		int m, n;
		String s;
		m = in.nextInt();
		n = in.nextInt();
		while (m != 0 && n != 0) {
			s = Integer.toString(m + n);
			s = s.replace("0", "");
			System.out.println(s);
			m = in.nextInt();
			n = in.nextInt();
		}
	}

}