package programacao2.aula10.aovivo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinhaLista {
	public static void main(String[] args) {
//		List lista = new ArrayList();// formato livre
		// Generics ou Tipos Parametrizados
		List <Integer> lista = new ArrayList<>(5);// formato Generics
		
		lista.add(10);
		lista.add(10);
		lista.add(30);
		lista.add(40);
		int total = 0;
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			total = total + (int) lista.get(i);
		}
		System.out.println("Média: " + total/lista.size());
		
		List lista2 = new ArrayList();
		
		lista2.add("eu");
		lista2.add("tu");
		lista2.add("ele");
		lista2.add("nos");
		 
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		
		
		

	}

}
