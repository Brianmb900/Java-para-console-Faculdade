package aula_7;

public class Exemplo_Exce��o_N�o_Tratada_2 {

	public static void main(String[] args) {
		System.out.println("in�cio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("in�cio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("in�cio do metodo2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}
}