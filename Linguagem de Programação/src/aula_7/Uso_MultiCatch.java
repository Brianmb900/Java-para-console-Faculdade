package aula_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Uso_MultiCatch {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://fatecpg.edu.br/");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = reader.readLine();
			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
			Date date = (Date) format.parse(line);
		} catch (IOException | ParseException e) {
			// trate seus problemas aqui
		}
	}
}