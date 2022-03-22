package Lista_Comandos_de_Decisão;

import java.util.Scanner;

public class Exercício_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, p, imc;
		System.out.println("Insira sua altura e peso no seguinte formato a,aa pp,pp");
		a = in.nextDouble();
		p = in.nextDouble();
		imc = p / (Math.pow(a, 2));
		if (imc < 20) {
			System.out.print("Abaixo do peso");
		} else if (imc > 20 && imc <= 25) {
			System.out.print("Normal");
		} else if (imc > 25 && imc <= 30) {
			System.out.print("Excesso de peso");
		} else if (imc > 30 && imc <= 35) {
			System.out.print("Obesidade");
		} else {
			System.out.print("Obesidade mórbida");
		}

	}

}
