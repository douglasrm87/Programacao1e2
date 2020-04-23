package programacao2.aula11.aovivo;

import java.util.Scanner;

public class TesteString {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		System.out.println("Digite sua confirmação (sim/nap):");
		String confirma =  leia.next();
		if (confirma.equalsIgnoreCase("sim")) {
			System.out.println("Vamos continuar.");
		}
		
		leia.close();
	}

}
