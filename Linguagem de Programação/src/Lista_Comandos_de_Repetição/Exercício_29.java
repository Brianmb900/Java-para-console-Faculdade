package Lista_Comandos_de_Repetição;

public class Exercício_29 {

	public static void main(String[] args) {
		int r;
		for (int i = 3; i <= 9; i++) {
			System.out.printf("Tabuada do %d\n",i);
			for (int a = 1; a <= 10; a++) {
				r = a * i;
				System.out.println(r);
			}
		}

	}

}
