package lista_Tratamento_Exceções;

public class Exercício_3 {

	public static void main(String[] args) {
		/*try {
		} catch (Exception e) {

		} catch (ArithmeticException a) {

		}*/
		
		System.out.println("O código não compila, pois ao criar o catch(Exception) "
		+ "você já está pegando todos os tipos de exceção, "
		+ "então ao usar o catch(ArithmeticException) ele gera um erro e não compila");

	}

}
