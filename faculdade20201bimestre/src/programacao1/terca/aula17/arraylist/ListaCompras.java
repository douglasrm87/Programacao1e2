package programacao1.terca.aula17.arraylist;

public class ListaCompras {
	public static final int TAMANHO_LISTA = 5;
	private String descricao = "";
	private ItemListaCompras[] itensListaCompras;

	public ListaCompras(String descricao) {
		this.setDescricao(descricao);
		this.setItensListaCompras(new ItemListaCompras[TAMANHO_LISTA]);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ItemListaCompras[] getItensListaCompras() {
		return itensListaCompras;
	}

	public void setItensListaCompras(ItemListaCompras[] itensListaCompras) {
		this.itensListaCompras = itensListaCompras;
	}

	public static int getTamanhoLista() {
		return TAMANHO_LISTA;
	}
	
}
