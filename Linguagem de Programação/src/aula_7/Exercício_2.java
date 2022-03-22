package aula_7;

import java.io.*;

public class Exercício_2 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso: java CopiaArquivoExcecao<arq1> <arq2>");
			return;
		}
		File arqEntrada = new File(args[0]);
		File arqSaida = new File(args[1]);
		FileReader leitor = null;
		FileWriter escritor = null;
		try {
			leitor = new FileReader(arqEntrada);
			escritor = new FileWriter(arqSaida);
			int c;
			while ((c = leitor.read()) != -1)
				escritor.write(c);
		} catch (IOException e) {
			System.out.println("Não foi possível escrever o arquivo ou encontra-lo ou o caminho está vazio");
		} finally {
			try {
				leitor.close();
				escritor.close();
			} catch (IOException | NullPointerException e) {
				System.out.println("Não foi possível fechar o arquivo");
			}
		}
	}
}