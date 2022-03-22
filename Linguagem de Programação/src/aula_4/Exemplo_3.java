package aula_4;

public class Exemplo_3 {

	public static void main(String[] args) {
		int[] idades = new int[10];
		for (int i = 0; i < 10; i++) {
			idades[i] = i * 10;
		}
		for (int x : idades) {
			System.out.println(x);
		}

	}

}
