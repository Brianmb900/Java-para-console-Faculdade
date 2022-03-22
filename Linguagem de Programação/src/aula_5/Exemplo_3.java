package aula_5;

public class Exemplo_3 {

	public static void main(String[] args) {
		String str1 = new String("Fatec"), str2 = "Fatec", str3 = "fatec";
		System.out.println("str1: " + str1 + '\n' + "str2: " + str2 + '\n' + "str3: " + str3);
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
		System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
		System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
		System.out.println("str3.compareTo(str2): " + str3.compareTo(str2));
		System.out.println("str3.compareToIgnoreCase(str2): " + str3.compareToIgnoreCase(str2));
	}
}