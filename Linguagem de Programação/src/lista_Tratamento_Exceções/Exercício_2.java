package lista_Tratamento_Exce��es;

public class Exerc�cio_2 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Todas as exce��es");
	}

}
