package aula_7;

public class Exemplo_Uso_Try_Catch {

	public static void main(String[] args) {
		int a, d = 0;
		try {
			a = 42 / d;
			System.out.println("Isto n�o ser� exibido");
		} catch (ArithmeticException e) {
			System.out.println("Divis�o por zero");
		}
		System.out.println("Ap�s o catch");
	}
}