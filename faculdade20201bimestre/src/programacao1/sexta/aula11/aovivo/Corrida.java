package programacao1.sexta.aula11.aovivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corrida {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		List<String> listaNome = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o nome " + (i + 1) + "- ");
			String nome = leia.next();
			listaNome.add(nome);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("NOme " + (i + 1) + " - " + listaNome.get(i));
		}

		leia.close();
	}

}
