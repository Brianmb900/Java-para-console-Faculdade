package aula_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo_Try_With_Resources {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nome do arquivo: ");
		try (BufferedReader br = new BufferedReader(new FileReader(in.nextLine()))) {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}