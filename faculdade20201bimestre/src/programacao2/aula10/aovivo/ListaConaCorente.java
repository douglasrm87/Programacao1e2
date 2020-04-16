package programacao2.aula10.aovivo;

import java.util.ArrayList;
import java.util.List;

public class ListaConaCorente {
	public static void main(String[] args) {
		List <ContaCorrente> listaContas = new ArrayList<>();
		
		ContaCorrente c1 = new ContaCorrente(10, 2020, 1000.50, "Douglas");
		listaContas.add(c1);
		
		ContaCorrente c2 = new ContaCorrente(30, 1030, 5600.50, "João");
		listaContas.add(c2);
		
		for (int i = 0; i < listaContas.size(); i++) {
			ContaCorrente c = listaContas.get(i);
			System.out.println(c.getAgencia());
			System.out.println(c.getConta());
			System.out.println(c.getSaldo());
		}
		
		for (int i = 0; i < listaContas.size(); i++) {
			System.out.println(listaContas.get(i).getAgencia());
			System.out.println(listaContas.get(i).getConta());
			System.out.println(listaContas.get(i).getSaldo());
		}
		// for avançado - Enhanced For
		for (ContaCorrente c : listaContas) {
			System.out.println(c.getAgencia());
			System.out.println(c.getConta());
			System.out.println(c.getSaldo());
		}
	}
}
