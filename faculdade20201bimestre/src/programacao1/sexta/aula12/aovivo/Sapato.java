package programacao1.sexta.aula12.aovivo;

public class Sapato {
	private String modelo;
	private int tamanho;
	
	
	
	@Override
	public String toString() {
		return "Sapato [modelo=" + modelo + ", tamanho=" + tamanho + "]";
	}
	public Sapato(String modelo, int tamanho) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	

}
