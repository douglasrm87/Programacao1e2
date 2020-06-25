package programacao1.terca.aula17.arraylist;

public class AppListaCompras {
	public static void main(String[] args) {
		int vet[] = new int[2];
		int a;
		ItemListaCompras itens[] = new ItemListaCompras[2];
		ItemListaCompras item = new ItemListaCompras();
		a = 1;
		vet[0] = a;
		a = 2;
		vet[1] = a;
		a = 3;
		item.setDescricao("Smartphone");
		itens[0] = item;
		item.setDescricao("TV");
		itens[1] = item;
		item.setDescricao("Açúcar");
		System.out.println("vet[0]: " + vet[0]);
		System.out.println("vet[1]: " + vet[1]);
		System.out.println("itens[0]: " + itens[0].getDescricao());
		System.out.println("itens[1]: " + itens[1].getDescricao());
	}
}
