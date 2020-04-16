package programacao2.aula10.aovivo;

public class ContaCorrente {
	private int agencia;
	private int conta;
	private double saldo;
	private String nome;
	
	
	
	public ContaCorrente(int agencia, int conta, double saldo, String nome) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
