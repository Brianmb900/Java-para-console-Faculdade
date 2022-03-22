package aula_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ler_CSV {

	public static final String DELIMITER = ";";

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			String line;
			br.readLine(); // linha de cabeçalho
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				records.add(values);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita: " + e.getMessage());
		}

		for (String[] linha : records) {
			for (String s : linha) {
				System.out.print(s + DELIMITER);
			}
			System.out.println();
		}

	}
}