package trabalho_Prático_2;

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
import trabalho_Prático_2.Clientes;
//DESENVOLVIDO POR BRIAN MELINSKI BIANCHINI, ERIK FARIA DA SILVA, JOÃO PEDRO ALEXANDRE VIEIRA E FRANCIELLY ALMEIDA GONÇALVES DA SILVA.
public class Compras implements Serializable {
	private String data;
	private float valor;
	private String cppf;
	private String titularr;

	public static void main(String[] args) {
	}

	public static void listarPorCPF() {
		float vt = 0;
		int cont = 0;
		Scanner en = new Scanner(System.in);
		try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))) {
			String CPF;
			System.out.print("Digite o CPF: ");
			CPF = en.nextLine();
			if (cpfCadastrado(CPF) == 0) {
				System.out.println("Não existe cliente cadastrado com este CPF!");
				return;
			}
			while (true) {
				Compras v = (Compras) in.readObject();
				if (CPF.compareTo(v.getCppf()) == 0) {
					System.out.printf("CPF: %s Nome: %s Valor: %.2f\n", v.getCppf(), v.getTitularr(), v.getValor());
					vt += v.getValor();
					cont++;
				}
			}
		} catch (EOFException e) {
			if (cont == 0) {
				System.out.println("Este cliente não fez nehuma compra");
			} else {
				System.out.printf("O valor total gasto por este cliente: R$ %.2f\n", vt);
			}
			System.out.println("Fim da listagem\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	public static void listarPorData() {
		float vt = 0;
		int cont = 0;
		Scanner en = new Scanner(System.in);
		try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))) {
			String dia;
			System.out.print("Digite a data da compra: ");
			dia = en.nextLine();
			while (true) {
				Compras v = (Compras) in.readObject();
				if (dia.compareTo(v.getData()) == 0) {
					System.out.printf("CPF: %s Nome: %s Valor: %.2f\n", v.getCppf(), v.getTitularr(), v.getValor());
					vt += v.getValor();
					cont++;
				}
			}
		} catch (EOFException e) {
			if (cont == 0) {
				System.out.println("Não foi feita compra nesta data");
			} else {
				System.out.printf("O valor total gasto nessa data foi: R$ %.2f\n", vt);
			}
			System.out.println("Fim da listagem\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	public static void exportarCSV() {
		try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")));
				FileWriter fw = new FileWriter("Compras.csv");
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("CPF;Titular;Data;Valor\n");
			while (true) {
				Compras v = (Compras) in.readObject();
				bw.write(v.getCppf() + ";" + v.getTitularr() + ";" + v.getData() + ";" + v.getValor() + "\n");
			}
		} catch (EOFException e) {
			System.out.println("Exportação Concluída\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo");
		}
	}

	public static void novaCompra() {
		Scanner en = new Scanner(System.in);
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))) {
			Compras v = new Compras();
			System.out.print("Cpf: ");
			v.cppf = en.nextLine();
			if (cpfCadastrado(v.getCppf()) == 0) {
				System.out.println("Não existe cliente cadastrado com este CPF!");
				return;
			}
			while (true) {
				Clientes c = (Clientes) input.readObject();
				if (v.getCppf().equals(c.getCpf()) == true) {
					System.out.println(c.getTitular());
					v.setTitularr(c.getTitular());
					break;
				}
			}
			System.out.print("Data: ");
			v.setData(en.nextLine());
			System.out.print("Valor: R$ ");
			v.setValor(en.nextFloat());
			Path path = Paths.get("compras.dat");
			if (Files.exists(path)) {
				try (FileOutputStream fos = new FileOutputStream("compras.dat", true);
						AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
					output.writeObject(v);
					System.out.println("Compra Concluída\n");
				} catch (FileNotFoundException e) {
					System.out.println("Nao foi possível abrir o arquivo clientes.dat!");
				} catch (IOException e) {
					System.out.println("Erro de escrita no arquivo compras.dat!");
				}
			} else {
				try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
					output.writeObject(v);
					System.out.println("Cadastro Concluído\n");
				} catch (IOException e) {
					System.out.println("Erro de escrita no arquivo compras.dat!");
				}
			}
		} catch (InvalidPathException e) {
			System.out.println("Nao foi possivel encontrar o arquivo compras.dat!");
		} catch (IOException e) {
			System.out.println("Erro leitura/escrita/abertura do arquivo crompras.dat");
		} catch (ClassNotFoundException e) {
			System.out.println("A classe não foi encontrada");
		}
	}

	public static void importarCSVCompras() {
		int cont = 0;
		String DELIMITER = ";";
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("Compras.csv"))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				records.add(values);
			}
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita:");
		}
		Compras v = new Compras();
		for (String[] linha : records) {
			for (String s : linha) {
				if (cont == 0) {
					v.setCppf(s);
				} else if (cont == 1) {
					v.setTitularr(s);
				} else if (cont == 2) {
					v.setData(s);
				} else if (cont == 3) {
					v.setValor(Float.parseFloat(s));
				}
				cont++;
			}
			if (cont == 4) {
				Path path = Paths.get("compras.dat");
				if (Files.exists(path)) {
					try (FileOutputStream fos = new FileOutputStream("compras.dat", true);
							AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
						output.writeObject(v);
					} catch (FileNotFoundException e) {
						System.out.println("Nao foi possível abrir o arquivo clientes.dat!");
					} catch (IOException e) {
						System.out.println("Erro de escrita no arquivo clientes.dat!");
					}
				} else {
					try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
						output.writeObject(v);
					} catch (IOException e) {
						System.out.println("Erro de escrita no arquivo clientes.dat!");
					} catch (InvalidPathException e) {
						System.out.println("Nao foi possivel encontrar o arquivo clientes.dat!");
					}
				}
			}
			cont = 0;
		}
		System.out.println("Importação Concluída\n");
	}

	public static int cpfCadastrado(String cpf) {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))) {
			while (true) {
				Clientes c = (Clientes) input.readObject();
				if (c.getCpf().compareToIgnoreCase(cpf) == 0) {
					return 1;
				}
			}
		} catch (EOFException e) {
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
		return 0;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getCppf() {
		return cppf;
	}

	public void setCppf(String cppf) {
		this.cppf = cppf;
	}

	public String getTitularr() {
		return titularr;
	}

	public void setTitularr(String titularr) {
		this.titularr = titularr;
	}

}