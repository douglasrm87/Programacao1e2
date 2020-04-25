package programacao1.sexta.aula11.aovivo;

public class ContaCorrente {
	private int agencia;
	private int conta;
	private double saldo;
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
	public ContaCorrente(int agencia, int conta, double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + "]";
	}
	
	

}
