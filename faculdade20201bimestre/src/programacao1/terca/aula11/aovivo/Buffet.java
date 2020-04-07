package programacao1.terca.aula11.aovivo;

public class Buffet extends Prato {
	private double precoKg;
	private boolean livre;

	public Buffet() {
		super();
		
		setIdPedido(Prato.numeroPedidoGeral);
	}

	public double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(double precoKg) {
		this.precoKg = precoKg;
	}

	public boolean isLivre() {
		return livre;
	}

	public void setLivre(boolean livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return super.toString() + " Buffet [precoKg=" + precoKg + ", livre=" + livre + "]";
	}

}
