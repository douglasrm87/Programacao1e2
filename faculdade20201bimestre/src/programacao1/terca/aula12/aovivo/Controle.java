package programacao1.terca.aula12.aovivo;

import java.util.Scanner;

//https://github.com/douglasrm87/Programacao1e2
public class Controle {

	public static void main(String[] args) {
		Controle c = new Controle();
		c.processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		System.out.println("1 - Aumentar Volume");
		System.out.println("2 - Reduzir Volume");
		System.out.println("3 - Aumentar Canal");
		System.out.println("4 - Reduzir canal");
		System.out.println("5 - Ligar TV");
		System.out.println("6 - Setar Canal");

	}

}
