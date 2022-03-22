package Lista_Comandos_de_Repetição;

public class Exercício_21 {

	public static void main(String[] args) {
		float vd, p, pi = 0;
		int cont1 = 0;
		int cont2 = 0;
		p = Float.parseFloat("3.14159");
		vd = 3;
		pi = 4 - (4 / vd);
		do {
			if (cont1 == 0) {
				vd += 2;
				pi += (4 / vd);
				cont1 = 0;
			}
			if (cont2 == 0) {
				vd += 2;
				pi -= (4 / vd);
			}
		} while (pi != p);
		System.out.print("PI");
	}
}