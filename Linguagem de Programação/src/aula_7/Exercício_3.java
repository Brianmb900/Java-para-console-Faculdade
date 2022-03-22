package aula_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercício_3 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso: java CopiaArquivoExcecao<arq1> <arq2>");
			return;
		}
		File arqEntrada = new File(args[0]);
		File arqSaida = new File(args[1]);
		try (FileReader leitor = new FileReader(arqEntrada); FileWriter escritor = new FileWriter(arqSaida);) {
			int c;
			while ((c = leitor.read()) != -1)
			escritor.write(c);
		} catch (IOException e) {
			System.out.println("Não foi possível escrever o arquivo/encontra-lo/o caminho está vazio");
		}
	}
}