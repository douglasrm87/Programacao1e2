package programacao1.terca.aula16.arraylist;

public class Cliente {
	private String nome;
	private Endereco end;
	private Pedido ped;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public Pedido getPed() {
		return ped;
	}
	public void setPed(Pedido ped) {
		this.ped = ped;
	}
	public Cliente(String nome, Endereco end) {
		super();
		this.nome = nome;
		this.end = end;
 	}
	public Cliente(String nome, Pedido ped) {
		super();
		this.nome = nome;
 		this.ped = ped;
	}	

}
