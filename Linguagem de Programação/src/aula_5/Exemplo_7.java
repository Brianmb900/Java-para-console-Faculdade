package aula_5;

public class Exemplo_7 {

	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer(" StringBuffer");
		String str = "Fatec Praia Grande ";
		strBuffer.insert(0, str);
		strBuffer.insert(str.length(), 2021);
		System.out.println(strBuffer);
	}
}