package aula_8;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Obetendo_Informações_Sobre_Arquivos_OU_Diretórios {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o nome de um arquivo ou diretorio: ");
		Path path = Paths.get(in.nextLine());
		if (Files.exists(path)) {
			System.out.printf("\n%s existe\n", path.getFileName());
			System.out.printf("%s um diretorio\n", Files.isDirectory(path) ? "É" : "Nao é");
			System.out.printf("%s um caminho absoluto\n", path.isAbsolute() ? "É" : "Nao é");
			System.out.printf("Última modificação: %s\n", Files.getLastModifiedTime(path));
			System.out.printf("Tamanho: %s bytes\n", Files.size(path));
			System.out.printf("Caminho: %s\n", path);
			System.out.printf("Caminho absoluto: %s\n", path.toAbsolutePath());
			if (Files.isDirectory(path)) {
				System.out.println("\nConteúdo do diretorio:");
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				for (Path p : directoryStream) {
					System.out.println(p);
				}
			}
		} else {
			System.out.printf("%s nao existe\n", path);
		}
		in.close();
	}
}