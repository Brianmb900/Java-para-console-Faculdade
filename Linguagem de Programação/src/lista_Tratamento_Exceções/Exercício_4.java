package lista_Tratamento_Exceções;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercício_4 {

	public static void main(String[] args) {
		File arqEntrada = new File(args[0]);
		cat(arqEntrada);
	}

	public static void cat(File file) {
		String line = null;
		try (RandomAccessFile input = new RandomAccessFile(file, "r");) {
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}