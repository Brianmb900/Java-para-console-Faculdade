package Lista_Comandos_de_Repeti��o;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			if (i % 4 == 0) {
				System.out.println("Bobo");
			}
		}
		System.out.print("A sa�da ser�: 0, bobo, 3, bobo, 6, bobo e 9");

	}

}
