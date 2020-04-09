package programacao2.aula09.swing.aovivo;

public class ContaCorrente {
	private int conta, agencia;
	private double saldo;
	private String nomeCliente;
	
	
	
	public ContaCorrente(int conta, int agencia, double saldo, String nomeCliente) {
		super();
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	

}
