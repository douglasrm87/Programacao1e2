package programacao2.aula10.aovivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrida {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		List <String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome do corredor:");
			lista.add(leia.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Posição: " + (i + 1) + " - " + lista.get(i));
		}
		
		
		leia.close();
	}

}
