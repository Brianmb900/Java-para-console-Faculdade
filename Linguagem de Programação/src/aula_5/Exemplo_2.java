package aula_5;

public class Exemplo_2 {

	public static void main(String[] args) {
		String nome = "Ciro";
		String sobrenome = "Trindade";
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		System.out.println("Nome completo: ".concat(nome).concat(" ").concat(sobrenome));
		System.out.println(String.format("%s %s %s", "Nome completo:", nome, sobrenome));
	}
}