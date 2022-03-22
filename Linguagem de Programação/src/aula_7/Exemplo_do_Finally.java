package aula_7;

public class Exemplo_do_Finally {

	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exceção pega");
		}
		procB();
		procC();
	}

	// Lança uma exceção para for a do método
	static void procA() {
		try {
			System.out.println("dentro de procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("finally de procA");
		}
	}

	// Retorna de dentro de um bloco try
	static void procB() {
		try {
			System.out.println("dentro de procB");
			return;
		} finally {
			System.out.println("finally de procB");
		}
	}

	// Executa um bloco try normalmente
	static void procC() {
		try {
			System.out.println("dentro de procC");
		} finally {
			System.out.println("finally de procC");
		}
	}

}