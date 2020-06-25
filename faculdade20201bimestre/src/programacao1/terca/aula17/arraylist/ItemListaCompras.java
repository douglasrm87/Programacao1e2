package programacao1.terca.aula17.arraylist;

public class ItemListaCompras {
	private String descricao;
	private Double quantidade;
	private Boolean isComprado;

	public ItemListaCompras() {
		this.setDescricao(new String(""));
		this.setQuantidade(new Double(0));
		this.setIsComprado(new Boolean(false));
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Boolean getIsComprado() {
		return isComprado;
	}

	public void setIsComprado(Boolean isComprado) {
		this.isComprado = isComprado;
	}
	 
}
