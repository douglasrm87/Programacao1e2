package programacao2.aula11.aovivo;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploTreeSet {
	public static void main(String[] args) {
		SortedSet<String> c = new TreeSet<>();
		c.add("Java");
		c.add("C ++");
		c.add("Smalltalk");
		// Por ser repetido não será inserido no Conjunto
		c.add("Java");
		c.add("Delphi");
		c.add("PHP");
		// imprime todo o conjunto ordenado
		System.out.println("Imprimindo todos os elementos de uma única vez: " + c);
		/*
		 * Impressão ficará: Imprimindo todos os elementos de uma única vez: [C ++,
		 * Delphi, Java, PHP, Smalltalk]
		 */
	}
}
