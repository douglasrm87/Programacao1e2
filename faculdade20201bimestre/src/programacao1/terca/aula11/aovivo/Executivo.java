package programacao1.terca.aula11.aovivo;

public class Executivo extends Prato {
	private double pesoRefeicao;

	public Executivo() {
		super();
		
		setIdPedido(Prato.numeroPedidoGeral);
	}
	
	public double getPesoRefeicao() {
		return pesoRefeicao;
	}

	public void setPesoRefeicao(double pesoRefeicao) {
		this.pesoRefeicao = pesoRefeicao;
	}

	@Override
	public String toString() {
		return super.toString() + " Executivo [pesoRefeicao=" + pesoRefeicao + "]";
	}

}
