package Trabalho_Pr�tico;

import java.util.Scanner;

public class Trabalho_Pr�tico_1 {

	public static void main(String[] args) {
		// DESENVOLVIDO POR BRIAN MELINSKI BIANCHINI, ERIK FARIA DA SILVA E JO�O PEDRO ALEXANDRE VIEIRA.

		Scanner en = new Scanner(System.in);
		int AL, OR, QH, FS, Cont = 0, Cont2 = 0, CM = 0;
		System.out.println("Digite a quantidade de alunos, o or�amento, quantidade de hot�is a ser considerado e quantas semanas ser�o:");
		AL = en.nextInt();
		OR = en.nextInt();
		QH = en.nextInt();
		FS = en.nextInt();
		int VL_Hospedagem[] = new int[QH];// Vetor do custo por semana
		int Q_Disponiveis[][] = new int[QH][FS];// Matriz com os quartos dispon�veis
		for (int i = 0; i < QH; i++) {
			System.out.printf("Digite o custo por fim de semana do %d� hotel: ", (i + 1));
			VL_Hospedagem[i] = en.nextInt();
		}
		/* Ciro: a entrada de dados n�o est� de acordo com o especificado no trabalho (Corretude: -1.0) */
		System.out.println();
		for (int i = 0; i < QH; i++) {
			for (int a = 0; a < FS; a++) {
				System.out.printf("Digite quantos quartos o %d� hotel tem dipon�vel na %d� semana: ", (i + 1), (a + 1));
				Q_Disponiveis[i][a] = en.nextInt();
			}
			System.out.println();
		}
		do { // Ciro: esse do-while � desnecess�rio (Corretude: -0.25) (Legibilidade: -1.0)
			for (int i = 0; i < QH; i++) {
				for (int a = 0; a < FS; a++) {
					if (i == 0 && a == 0) {
						CM = AL * VL_Hospedagem[i];
					}
					if (Q_Disponiveis[i][a] >= AL) {
						if ((AL * VL_Hospedagem[i]) <= OR) {
							if (AL * VL_Hospedagem[i] < CM) {
								CM = AL * VL_Hospedagem[i];
							}
							Cont++; 
						}
					}
				}
				Cont2++;
			}
		} while (Cont2 < QH);
		if (Cont == 0) {
			System.out.println("fique em casa");
		} else {
			System.out.println(CM);
		}
	}
}