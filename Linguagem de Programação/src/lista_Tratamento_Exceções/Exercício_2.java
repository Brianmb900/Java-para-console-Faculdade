package lista_Tratamento_Exceções;

public class Exercício_2 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Todas as exceções");
	}

}
