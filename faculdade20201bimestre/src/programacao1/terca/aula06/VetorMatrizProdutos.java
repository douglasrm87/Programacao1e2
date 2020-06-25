package programacao1.terca.aula06;

import java.util.Scanner;
public class VetorMatrizProdutos {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAMMAT = 2;
		// ira representar a prateleira
		int prateleira[][] = new int[TAMMAT][TAMMAT];
		
		final int TAMVET = 6; // vai conter os produtos
		
		String produtos[] = { "vazio", "xampu", "condicionador",
				"hidratante", "tintura", "demaquilante", };
		
		System.out.println("0 " + produtos[0]);
		System.out.println("1 " + produtos[1]);
		System.out.println("2 " + produtos[2]);
		System.out.println("3 " + produtos[3]);
		System.out.println("4 " + produtos[4]);
		System.out.println("5 " + produtos[5]);
		
		/*Resposta questão A)
		 */
		// Carregar a matriz
		for (int i = 0; i < TAMMAT; i++) { // linha
			for (int j = 0; j < TAMMAT; j++) { // coluna
				int cdProd = 0;
				do {
					System.out
							.println("Digite o código do produto a ser armazenado na posição [" + i + "][" + j + "]: ");
					cdProd = leia.nextInt();
					if (cdProd < 0 || cdProd > produtos.length) {
						System.out.println("Código inválido. Redigite.");
					}
				} while (cdProd < 0 || cdProd > produtos.length);

				prateleira[i][j] = cdProd;
			}
		}
		// Apresentar a matriz
		for (int i = 0; i < TAMMAT; i++) {
			for (int j = 0; j < TAMMAT; j++) {
				System.out.println("Produto comprado: [" + i + "][" + j + "]: " + produtos[prateleira[i][j]]);
			}
		}

		/* Resposta questão b)
		 */
		// Contagem de Estoque
		System.out.println("\n Quantidade comprada:");
		int produtosContagem[] = new int[TAMVET];
		for (int i = 0; i < TAMMAT; i++) {
			for (int j = 0; j < TAMMAT; j++) {
				// O ponto central da questão e a seguinte linha
				produtosContagem[prateleira[i][j]]++;
			}
		}
		for (int i = 0; i < TAMVET; i++) {
			System.out.println(
					"Produto comprado: [" + i + "]" + produtos[i] + " igual a:" + produtosContagem[i] + " unidades.");
		}
		leia.close();
	}
}
