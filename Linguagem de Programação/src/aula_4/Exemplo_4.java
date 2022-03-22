package aula_4;
import java.util.Arrays;
import java.util.Random;

public class Exemplo_4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] vetor = new int[20];
		Arrays.fill(vetor, 10);
		for (int x : vetor)
			System.out.print(x + " ");
		System.out.println();
		for (int i = 0; i < vetor.length; vetor[i++] = rand.nextInt(25))
			;
		for (int x : vetor)
			System.out.print(x + " ");
		System.out.println();
		Arrays.sort(vetor);
		for (int x : vetor)
			System.out.print(x + " ");
		System.out.println();
		int val = rand.nextInt(25);
		int index = Arrays.binarySearch(vetor, val);
		if (index >= 0) {
			System.out.println(val + " está na posicao " + index + " do vetor");
		} else {
			System.out.println(val + " nao está contido no vetor");
		}

	}

}
