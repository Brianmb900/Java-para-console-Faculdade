package prova_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula_9.AppendingObjectOutputStream;


public class Exercício_1{
	public static final String DELIMITER = ";";

	public static void main(String[] args) {
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				records.add(values);
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + ".csv"))) {
				int i;
				for (String[] values : records) {
					for (i = 0; i < values.length - 1; i++) {
						bw.write(values[i]);
					}
					bw.write(values[i]);
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Erro de leitura/escrita: " + e.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Uso incorreto!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita: " + e.getMessage());
		}
	}

}