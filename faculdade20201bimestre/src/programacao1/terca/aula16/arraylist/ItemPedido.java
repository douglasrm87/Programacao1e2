package programacao1.terca.aula16.arraylist;

public class ItemPedido {
	private String  descItem;
	private double valorItem;
	public String getDescItem() {
		return descItem;
	}
	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}
	public double getValorItem() {
		return valorItem;
	}
	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
	public ItemPedido(String descItem, double valorItem) {
		super();
		this.descItem = descItem;
		this.valorItem = valorItem;
	}
	@Override
	public String toString() {
		return "ItemPedido [descItem=" + descItem + ", valorItem=" + valorItem + "]";
	}
	
	

}
