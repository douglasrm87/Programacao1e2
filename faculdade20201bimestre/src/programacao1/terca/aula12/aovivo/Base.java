package programacao1.terca.aula12.aovivo;

public class Base {
	private String msg[] = new String[5];
	private int contador = 0;

	public void efetuarLigacao(int numero) {
		System.out.println("Ligando para : " + numero);
	}

	public void registrarMsg(String msgNova) {
		if (this.contador < 5) {
			this.msg[this.contador] = msgNova;
			this.contador += 1;
		}
		else {
			System.out.println("Atingiu o limite de mensagens. Regravando em cima da primeira");
			this.contador = 0;
			this.msg[this.contador] = msgNova;
		}

	}

}
