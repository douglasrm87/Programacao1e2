package programacao1.sexta.aula13.aovivo1;

public class Endereco {
	private String logradouro;
	private String cidade;
	private int numero;
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Endereco(String logradouro, String cidade, int numero) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cidade=" + cidade + ", numero=" + numero + "]";
	};
	

}
