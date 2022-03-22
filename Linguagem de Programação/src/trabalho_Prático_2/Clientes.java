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
import trabalho_Prático_2.Compras;
// DESENVOLVIDO POR BRIAN MELINSKI BIANCHINI, ERIK FARIA DA SILVA, JOÃO PEDRO ALEXANDRE VIEIRA E FRANCIELLY ALMEIDA GONÇALVES DA SILVA.
public class Clientes implements Serializable {
	private String cpf;
	private String titular;
	private String telefone;
	static Scanner en = new Scanner(System.in);

	public static void main(String[] args) {
		int op = 0;
		do {
			System.out.println("Loja de Departamentos");
			System.out.println("<1> Novo cliente");
			System.out.println("<2> Listar clientes");
			System.out.println("<3> Buscar clientes");
			System.out.println("<4> Realizar compra");
			System.out.println("<5> Listar Compra por data");
			System.out.println("<6> Listar Compra por CPF");
			System.out.println("<7> Exportar dados do clientes no formato CSV");
			System.out.println("<8> Exportar dados das compras no formato CSV");
			System.out.println("<9> Importar dados do clientes no formato CSV");
			System.out.println("<10> Importar dados das compras no formato CSV");
			System.out.println("<0> Sair");
			System.out.print("Opcao: ");
			op = en.nextInt();
			en.nextLine();
			switch (op) {
			case 1:
				novoCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				buscarCliente();
				break;
			case 4:
				realizarCompra();
				break;
			case 5:
				listarCompraData();
				break;
			case 6:
				listarCompraCPF();
				break;
			case 7:
				exportarCSVClientes();
				break;
			case 8:
				exportarCSVCompras();
				break;
			case 9:
				importarCSVClientes();
				break;
			case 10:
				importarCompraCSV();
				break;
			case 0:
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		} while (op != 0);
	}

	private static void listarClientes() {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))) {
			while (true) {
				Clientes c = (Clientes) input.readObject();
				System.out.printf("CPF: %s Nome: %s Telefone: %s\n", c.getCpf(), c.getTitular(), c.getTelefone());
			}
		} catch (EOFException e) {
			System.out.println("Fim\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	private static void buscarCliente() {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")))) {
			String nome;
			System.out.print("Digite o primeiro nome do cliente: ");
			nome = en.nextLine();
			while (true) {
				Clientes c = (Clientes) input.readObject();
				if (c.getTitular().startsWith(nome) == true) {
					System.out.printf("CPF: %s Nome: %s Telefone: %s\n", c.getCpf(), c.getTitular(), c.getTelefone());
				}
			}
		} catch (EOFException e) {
			System.out.println("Fim da Busca\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		}
	}

	private static void exportarCSVClientes() {
		try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("clientes.dat")));
				FileWriter fw = new FileWriter("Clientes.csv");
				BufferedWriter bw = new BufferedWriter(fw)) {
			Scanner en = new Scanner(System.in);
			bw.write("CPF;Titular;Telefone\n");
			while (true) {
				Clientes c = (Clientes) input.readObject();
				bw.write(c.getCpf() + ";" + c.getTitular() + ";" + c.getTelefone() + "\n");
			}
		} catch (EOFException e) {
			System.out.println("Exportação Concluída\n");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo");
		}
	}

	private static void novoCliente() {
		Clientes c = new Clientes();
		try {
			System.out.print("Cpf: ");
			c.setCpf(en.nextLine());
			while (cpfCadastrado(c.getCpf()) != 0) {
				System.out.println("Já existe uma conta cadastrada com este cpf!");
				System.out.print("Cpf: ");
				c.setCpf(en.nextLine());
			}
			System.out.print("Titular: ");
			c.setTitular(en.nextLine());
			System.out.print("Telefone: ");
			c.setTelefone(en.nextLine());
			Path path = Paths.get("clientes.dat");
			if (Files.exists(path)) {
				try (FileOutputStream fos = new FileOutputStream("clientes.dat", true);
						AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
					output.writeObject(c);
					System.out.println("Cadastro Concluído\n");
				} catch (FileNotFoundException e) {
					System.out.println("Nao foi possível abrir o arquivo clientes.dat!");
				} catch (IOException e) {
					System.out.println("Erro de escrita no arquivo clientes.dat!");
				}
			} else {
				try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
					output.writeObject(c);
					System.out.println("Cadastro Concluído\n");
				} catch (IOException e) {
					System.out.println("Erro de escrita no arquivo clientes.dat!");
				}
			}
		} catch (InvalidPathException e) {
			System.out.println("Nao foi possivel encontrar o arquivo clientes.dat!");
		}
	}

	private static void importarCSVClientes() {
		int cont = 0;
		String CPF = "";
		String DELIMITER = ";";
		List<String[]> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("Clientes.csv"))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(DELIMITER);
				records.add(values);
			}
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita:");
		}
		Clientes c = new Clientes();
		for (String[] linha : records) {
			for (String s : linha) {
				if (cont == 0) {
					CPF = s;
					c.setCpf(s);
				}
				if (cpfCadastrado(CPF) == 1) {
					break;
				} else {
					if (cont == 1) {
						c.setTitular(s);
					} else if (cont == 2) {
						c.setTelefone(s);
					}
				}
				cont++;
			}
			if (cont == 3) {
				Path path = Paths.get("clientes.dat");
				if (Files.exists(path)) {
					try (FileOutputStream fos = new FileOutputStream("clientes.dat", true);
							AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
						output.writeObject(c);
					} catch (FileNotFoundException e) {
						System.out.println("Nao foi possível abrir o arquivo clientes.dat!");
					} catch (IOException e) {
						System.out.println("Erro de escrita no arquivo clientes.dat!");
					}
				} else {
					try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
						output.writeObject(c);
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

	private static void realizarCompra() {
		Compras v = new Compras();
		v.novaCompra();
	}

	private static void exportarCSVCompras() {
		Compras v = new Compras();
		v.exportarCSV();
	}

	private static void listarCompraData() {
		Compras v = new Compras();
		v.listarPorData();
	}

	private static void listarCompraCPF() {
		Compras v = new Compras();
		v.listarPorCPF();
	}

	private static void importarCompraCSV() {
		Compras v = new Compras();
		v.importarCSVCompras();
	}

	private static int cpfCadastrado(String cpf) {
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
			System.out.println("Ainda não há dados cadastrados");
		}
		return 0;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}