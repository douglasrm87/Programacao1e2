package programacao1.terca.aula16.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private double valor;
	private int idPedido;
	private List<ItemPedido> itens = new ArrayList<>();
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public Pedido(double valor, int idPedido, List<ItemPedido> itens) {
		super();
		this.valor = valor;
		this.idPedido = idPedido;
		this.itens = itens;
	}
	
	public Pedido() {
		super();
	}
	@Override
	public String toString() {
		return "Pedido [valor=" + valor + ", idPedido=" + idPedido + ", itens=" + itens + "]";
	}

}
