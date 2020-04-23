package programacao2.aula11.aovivo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploListaConjuntoString {
	public static void main(String[] args) {
		List <String> strLista = new ArrayList<>();
		strLista.add("Mendes");
		strLista.add("Mendes");
		strLista.add("Mendes");
		System.out.println("Primeira posição: " + strLista.get(0));
		
		for (String string : strLista) {
			System.out.println(string);
		}
		System.out.println("\nConjunto");
		Set<String> strCL = new HashSet<>();
		strCL.add("Douglas");
		strCL.add("Douglas");
		strCL.add("Douglas");
		
		 
		
		for (String string : strCL) {
			System.out.println(string);
		}
		System.out.println("\nOrdenado");
		SortedSet<String> strOrdenada = new TreeSet<>();
		strOrdenada.add("Banana");
		strOrdenada.add("banana");
		strOrdenada.add("Abacate");
		strOrdenada.add("Uva");
		strOrdenada.add("Morango");
		strOrdenada.add("Pitaya");
		strOrdenada.add("Manga");
		
		System.out.println("Chamndo o metodo tostring");
		System.out.println(strOrdenada);
		
		for (String string : strOrdenada) {
			System.out.println(string);
		}
		
		System.out.println("______________________________________");
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
		 
		
	}

}
