package programacao2.aula11.aovivo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploListaConjuntoChamda {
	public static void main(String[] args) {
		List <Chamada> listaChamada = new ArrayList<>();
		Chamada c = new Chamada(1,"Douglas");
		listaChamada.add(c);
		listaChamada.add(c);
		
		c = new Chamada(1,"Douglas");
		listaChamada.add(c);
		for (Chamada chamada : listaChamada) {
			System.out.println(chamada.getMatricula());
			System.out.println(chamada.getNome());
		}
		System.out.println("_______________________________");
		Set <Chamada> setChamada = new HashSet<>();
		c = new Chamada(1,"Douglas");
		setChamada.add(c);
		setChamada.add(c);
		
		c = new Chamada(1,"Douglas");
		setChamada.add(c);
		for (Chamada chamada : setChamada) {
			System.out.println(chamada.getMatricula());
			System.out.println(chamada.getNome());
		}
		
	}

}
