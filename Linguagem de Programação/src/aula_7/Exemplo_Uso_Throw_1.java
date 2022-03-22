package aula_7;

public class Exemplo_Uso_Throw_1 {

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Pega novamente: " + e);
		}
	}

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Pega dentro de demoproc.");
			throw e; // relança a exceção
		}
	}
}