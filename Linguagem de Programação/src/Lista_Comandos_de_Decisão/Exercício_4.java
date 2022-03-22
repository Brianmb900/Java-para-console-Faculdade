package Lista_Comandos_de_Decisão;

public class Exercício_4 {

	public static void main(String[] args) {
		/* Dado o trecho de programa esquemático em Java abaixo, responda:
		a) Quais comandos serão executados se cond1 e cond2 forem verdadeiras e cond3 for falsa?
		b) Quais comandos serão executados se cond1 for falsa, cond2 e cond3 forem verdadeiras?
		c) Quais comandos serão executados se cond1, cond2 e cond3 forem falsas?
		d) Que condições devem ser verdadeiras e quais devem ser falsas para que comando4, comando6 e comando7 sejam executados?
...
public static void main(String[] args) {
 if (cond1) {
 comando1;
 comando2;
 } else {
 if (cond2) {
 comando3;
 }
 if (cond3) {
 comando4;
 } else {
 comando5;
 }
 comando6;
 }
 comando7;
}
 */
		System.out.print("a) Comandos 1,2,7");
		System.out.print("b) Comandos 3,4,6");
		System.out.print("c) Comandos 5,6,7");
		System.out.print("d) Cond 1 falsa, Cond2 falsa, Cond3 verdadeira");

	}

}