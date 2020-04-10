package programacao2.aula09.swing.aovivo;

import java.util.Scanner;

public class TrataExcecaoExcecao {
	public static void main(String[] args) {
		new TrataExcecaoExcecao().processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		System.out.println("Digite dua idade:");
		int idade = this.leia.nextInt();
		try {
			validarDirecao(idade);
		} catch (Exception e) {// capturar excecao
			
			System.out.println("msg: " + e.toString());
		}
	}

	private void validarDirecao(int idade)  throws Exception {
		if (idade >= 18) {
			System.out.println("Digite seus pontos");
			int pontos = this.leia.nextInt();
			try {
				validarRetencaoCarteira(pontos);	
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			throw new Exception("Pode dirigir"); // lancar excecao
		}else {
			throw new Exception("Nao Pode dirigir");
		}
	}

	private void validarRetencaoCarteira(int pontos) throws Exception{
		if (pontos >= 40) {
			throw new Exception("Esta suspenso");
		}
		throw new Exception("Não Esta suspenso");
	}
}
