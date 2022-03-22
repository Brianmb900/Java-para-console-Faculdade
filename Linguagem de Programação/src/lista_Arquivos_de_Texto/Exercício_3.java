package lista_Arquivos_de_Texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercício_3 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Erro de sintaxe!");
			System.out.println("Para executar faca:");
			System.out.println("java NomeDaClasse <string> <arquivo>");
			return;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(args[1]))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				if (linha.indexOf(args[0]) != -1) {
					System.out.println(linha);
				}
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}