package programacao1.terca.aula11.aovivo;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		Caixa c = new Caixa();
		c.processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() {
		int op = 0;
		do {
			System.out.println("1 - Adicionar Marmita");
			System.out.println("2 - Adicionar Buffet");
			System.out.println("3 - Adicionar Espeto Corrido");
			System.out.println("4 - Adicionar Executivo");
			System.out.println("7 - Fechar Pedido");
			System.out.println("9 - Sair sistema");
			System.out.println("Digite sua opção:");
			op = this.leia.nextInt();

			switch (op) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 7:

				break;
			case 9:

				break;

			default:
				break;
			}
		} while (op != 0);

	}

}
