package aula_7;

public class Exemplo_Uso_Throw_2 {

	public static void main(String[] args) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Pego " + e);
		}
	}

	static void throwOne() throws IllegalAccessException {
		System.out.println("Dentro de throwOne.");
		throw new IllegalAccessException("demo");
	}
}