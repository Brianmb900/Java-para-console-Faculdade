package aula_1;

public class Exerc�cio_1 {

	public static void main(String[] args) {
		/*1. Considere as declara��es de vari�veis em Java abaixo e assinale as instru��es que provocam
		erro:
			float x;
			byte y;
			int z = 5;
			( ) x = z;
			(x) y = z;
			( ) x = 4.25F;
			(x) x = z / 2.0;
			( ) y = (byte) z;*/
		
		float x;
		byte y;
		int z = 5;
		x = z;
		/*y = z;*/
		x = 4.25F;
		/*x = z / 2.0;*/
		y = (byte) z;
		System.out.println(x + " " + y);

	}

}
