package programacao1.sexta.aula13.aovivo1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numero;
	private double valorTotal;
	private List<ItemPedido> listaitem = new ArrayList<ItemPedido>();
	
	
	public Pedido(int numero, double valorTotal, List<ItemPedido> listaitem) {
		super();
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.listaitem = listaitem;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<ItemPedido> getListaitem() {
		return listaitem;
	}
	public void setListaitem(List<ItemPedido> listaitem) {
		this.listaitem = listaitem;
	}
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", valorTotal=" + valorTotal + ", listaitem=" + listaitem + "]";
	}
	

}
