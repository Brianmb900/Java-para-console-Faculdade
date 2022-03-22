package aula_7;

import java.util.Scanner;

public class ExercicioExcecao1 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println("i = " + i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você não passou argumentos para o programa");
		}catch (NumberFormatException e) {
			System.out.println("O valor passado não pode ser convertido para inteiro");
		}
		
		// cd eclipse-workspace\Linguagem de Programação\bin 
	   //Java aula_7.ExercicioExcecao1
	}
}