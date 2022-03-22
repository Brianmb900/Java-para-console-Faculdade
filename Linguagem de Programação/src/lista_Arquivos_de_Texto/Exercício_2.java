package lista_Arquivos_de_Texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercício_2 {

	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Erro de sintaxe!");
			System.out.println("Para executar faca:");
			System.out.println("java NomeDaClasse <arquivo-entrada> <-c|-d> <chave> <arquivo-saida>");
			return;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[3]))) {
			int chave = Integer.parseInt(args[2]);
			if (args[1].equals("-d")) {
				chave = -chave;
			}
			int b;
			while (br.ready()) {
				b = br.read();
				b += chave;
				bw.write(b);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Erro: a chave de rotacao deve ser um numero inteiro");
		}
	}
}