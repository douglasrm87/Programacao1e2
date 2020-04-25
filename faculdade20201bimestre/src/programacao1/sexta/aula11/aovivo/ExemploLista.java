package programacao1.sexta.aula11.aovivo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLista {
/*
A partir do Java 5 ofi criado os Tipos Parametrizados = Generics
 */
	public static void main(String[] args) {
		List <String> lista; // apenas uma referencia
		lista = new ArrayList<>(); // criamso um objeto
		lista.add("Douglas");
		lista.add("Mendes");
		lista.add("Rocha");
		lista.add("João");
		lista.add("Pedro");
		lista.add("Eu");
		lista.add("1");
		lista.add("22");
		lista.add("134");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		List <Integer> lista2 = new LinkedList<>();
		lista2.add(90);
		lista2.add(30);
		lista2.add(90);
		double total = 0.0;
		for (int i = 0; i < lista2.size(); i++) {
			total = total + (int) lista2.get(i);
			System.out.println("total:" + total);
		}
		System.out.println("Media: " + total / lista2.size());

	}

}
