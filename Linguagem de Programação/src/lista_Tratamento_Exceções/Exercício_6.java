package lista_Tratamento_Exce��es;

public class Exerc�cio_6 {

	public static void main(String[] args) {
		int waitTime = 12;
		try {
			System.out.println("Entrei no bloco try.");
			if (waitTime > 30) {
				throw new Exception("Maior que 30.");
			} else if (waitTime < 30) {
				throw new Exception("Menor que 30.");
			} else {
				System.out.println("Nenhuma exce��o.");
			}
			System.out.println("Deixando o bloco try.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Ap�s o bloco catch.");
		System.out.println("\nA s�ida �: \nEntrei no bloco try. \nMenor que 30. \nAp�s o bloco catch.");
	}
}
