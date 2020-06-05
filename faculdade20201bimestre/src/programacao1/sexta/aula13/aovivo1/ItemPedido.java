package programacao1.sexta.aula13.aovivo1;

public class ItemPedido {
	private String desc;
	private double valorItem;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

	public ItemPedido() {
	}

	public ItemPedido(String desc, double valorItem) {
		super();
		this.desc = desc;
		this.valorItem = valorItem;
	}

	@Override
	public String toString() {
		return "ItemPedido [desc=" + desc + ", valorItem=" + valorItem + "]";
	}

}
