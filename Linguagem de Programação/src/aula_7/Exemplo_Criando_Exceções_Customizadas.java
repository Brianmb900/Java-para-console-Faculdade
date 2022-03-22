package aula_7;

public class Exemplo_Criando_Exceções_Customizadas {

	public static void main(String[] args) {
		class MyException extends Exception {
			private int detail;

			MyException(int a) {
				detail = a;
			}

			public String toString() {
				return "MyException[" + detail + "]";
			}
		}
		class ExceptionDemo {
			static void compute(int a) throws MyException {
				System.out.println("compute(" + a + ") chamado");
				if (a > 10) {
					throw new MyException(a);
				}
				System.out.println("Saída normal");
			}

			public static void main(String args[]) {
				try {
					compute(1);
					compute(20);
				} catch (MyException e) {
					System.out.println("Pego " + e);
				}
			}
		}
	}
}