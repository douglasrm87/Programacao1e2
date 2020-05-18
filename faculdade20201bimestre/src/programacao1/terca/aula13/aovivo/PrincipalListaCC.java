package programacao1.terca.aula13.aovivo;

import java.util.ArrayList;
import java.util.List;



public class PrincipalListaCC {
	public static void main(String[] args) {
		
		List <ContaCorrente> listaCC = new ArrayList<>();
		ContaCorrente c1 = new ContaCorrente(10, 20, 1000.90);
		listaCC.add(c1);
		
		ContaCorrente c2 = new ContaCorrente(40, 3420, 44400.90);
		listaCC.add(c2);
		
		System.out.println("Dados Dados c1:" + listaCC.get(0).toString());
		System.out.println("Dados Conta c1:" + listaCC.get(0).getConta());
		System.out.println("Dados Agencia c1:" + listaCC.get(0).getAgencia());
		
		for (int i = 0; i < listaCC.size(); i++) {
			System.out.println("Dados: " + listaCC.get(i).toString());
			System.out.println("Conta:" + listaCC.get(i).getConta());
		}
		// for avançado
		for (ContaCorrente cc : listaCC) {
			System.out.println("Dados: " + cc.toString());
			System.out.println("Conta:" + cc.getConta());
			System.out.println("Aagencia:" + cc.getAgencia());
			System.out.println("Saldo:" + cc.getSaldo());
		}
		
		
		
	}

}
