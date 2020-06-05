package programacao1.sexta.aula13.aovivo1;

public class Cliente {
	private String nome;
	private long cpf;

	private Endereco endereco;
	private Pedido pedido;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Cliente(String nome, long cpf ) {
		super();
		this.nome = nome;
		this.cpf = cpf;
 
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", pedido=" + pedido + "]";
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
