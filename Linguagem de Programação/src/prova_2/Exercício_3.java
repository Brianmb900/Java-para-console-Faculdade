package prova_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		System.out.println(inputAge());
	}

	public static int inputAge() throws InputMismatchException {
		Scanner en = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		try {
			int i = en.nextInt();
			if (i < 0 || i > 150) {
				throw new InputMismatchException("A idade deve estar entre 0 e 150");
			}
			return i;
		} catch (InputMismatchException e) {
			System.out.println(e + " A idade deve ser um valor inteiro");
		}
		return 0;
	}
}
