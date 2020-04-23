package programacao2.aula11.aovivo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ExemploSet {
	public static void main(String[] args) {
		Collection<String> set = new HashSet<>();
		set.add("Java");
		set.add("C ++");
		set.add("Smalltalk");
		// Por ser repetido não será inserido no Conjunto
		set.add("Java");
		set.add("Delphi");
		set.add("PHP");
		// imprime todo o conjunto.
		// os elementos serão apresentados em qualquer ordem.
		System.out.println("Imprimindo todos os elemento de uma única vez: " + set);
		/*
		 * Impressão ficará: Imprimindo todos os elemento de uma única vez: [Java,
		 * Smalltalk, C ++, PHP, Delphi]
		 */
		/*
		 * Para recuperar os elementos de um objeto do tipo SET utilizar um iterator
		 */
		Iterator it = set.iterator();
		System.out.println("Imprimindo cada elemento do conjunto.");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("*********************************************");
			System.out.println(val.toString());
		}
	}
}
