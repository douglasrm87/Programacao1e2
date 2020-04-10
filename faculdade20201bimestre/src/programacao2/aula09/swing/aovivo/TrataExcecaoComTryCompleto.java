package programacao2.aula09.swing.aovivo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrataExcecaoComTryCompleto {
	public static void main(String[] args) {
		try {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digitar uma idade:");
			int idade = leia.nextInt();

			TrataExcecaoComTryCompleto obj = new TrataExcecaoComTryCompleto();
			try {
				obj.avaliarIdadeTSE(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				obj.avaliarDetran(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				obj.avaliarCasamento(idade);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			leia.close();
		} catch (InputMismatchException e) {// Unchecked
			System.out.println("Dado de entrada inválido.");
		} catch (Exception e) {// checked
			System.out.println("mensagem:" + e.getMessage());
		}
	}

	private void avaliarIdadeTSE(int idade) throws Exception {

		if (idade >= 16) {
			throw new Exception("Pode votar");
		}
		throw new Exception("Nâo Pode votar");
	}

	private void avaliarDetran(int idade) throws Exception {

		if (idade < 18) {
			throw new Exception("Não pode dirigir");
		}
		throw new Exception("Pode casar");
	}

	private void avaliarCasamento(int idade) throws Exception {
		if (idade < 21) {
			throw new Exception("Não pode casar");
		}
		throw new Exception("Pode casar");
	}

}
