package programacao1.sexta.aula13.aovivo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Cliente [nome=Douglas, cpf=123456, 
endereco=Endereco [logradouro=hugo simas, cidade=Curitiba, numero=201], 
pedido=Pedido [numero=10, valorTotal=211.3, 
listaitem=[ItemPedido [desc=Sapato, valorItem=50.9], 
		ItemPedido [desc=Meia, valorItem=30.3], 
		ItemPedido [desc=Camisa, valorItem=130.1]]]]

 */
public class Principal {
	public static void main(String[] args) {
		new Principal().processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op = 0;
		Cliente cliente = new Cliente();
		System.out.println("1 - Cadatrar cliente");
		System.out.println("2 - Cadatrar endereoço do cliente");
		System.out.println("3 - Adciionar itens");
		System.out.println("Digite sua opção:");
		op = leia.nextInt();
		switch (op) {
		case 1:
			cliente = new Cliente("Douglas", 123456);
			break;
		case 2:
			if (cliente.getNome() != null && cliente.getNome().length() > 0) {
				Endereco end = new Endereco("hugo simas", "Curitiba", 201);
				cliente.setEndereco(end);
			} else {
				System.out.println("Favor cadastrar o cliente.");
			}
		case 3:
			if (cliente.getNome() != null && cliente.getNome().length() > 0) {
				ItemPedido it1 = new ItemPedido("Sapato", 50.90);
				ItemPedido it2 = new ItemPedido("Meia", 30.30);
				ItemPedido it3 = new ItemPedido("Camisa", 130.10);

				List<ItemPedido> listaItem = new ArrayList<ItemPedido>();
				listaItem.add(it1);
				listaItem.add(it2);
				listaItem.add(it3);
				double vTot = 0.0;
				for (ItemPedido it : listaItem) {
					vTot = vTot + it.getValorItem();
				}
				Pedido pedido = new Pedido(10, vTot, listaItem);
				cliente.setPedido(pedido);
				System.out.println(cliente);
			} else {
				System.out.println("Favor cadastrar o cliente.");
			}

			break;
		default:
			break;
		}

	}

}
