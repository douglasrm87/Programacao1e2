package programacao1.sexta.aula11.aovivo;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaConta {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(10,20,100.80);
		List<ContaCorrente> listaConta = new ArrayList<>();
		listaConta.add(c);
		
		ContaCorrente c2 = new ContaCorrente(310,2320,1044.80);
		listaConta.add(c2);
		
		ContaCorrente c3 = new ContaCorrente(440,2440,1444480);
		listaConta.add(c3);
		
		for (int i = 0; i < listaConta.size(); i++) {
			System.out.println("Conta: " + listaConta.get(i).getConta());
			System.out.println("Agencia: " + listaConta.get(i).getAgencia());
			System.out.println("Nome: " + listaConta.get(i).getSaldo());
		}
		// neste ponto
		System.out.println(listaConta.get(0)); // executar o metodo toString
		
	}

}
