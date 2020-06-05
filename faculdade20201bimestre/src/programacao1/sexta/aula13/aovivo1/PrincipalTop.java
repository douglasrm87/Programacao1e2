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
public class PrincipalTop {
	public static void main(String[] args) {
		new PrincipalTop().processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op = 0;
		Cliente cliente = new Cliente();
		ItemPedido it = new ItemPedido();
		List<ItemPedido> listaItem = new ArrayList<ItemPedido>();

		System.out.println("1 - Cadatrar cliente");
		System.out.println("2 - Cadatrar endereoço do cliente");
		System.out.println("3 - Adciionar item");
		System.out.println("4 - Fechar Pedido");
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
				System.out.println("digite descricap:");
				String d = leia.next();
				System.out.println("digite valor:");
				double v = leia.nextDouble();
				it = new ItemPedido(d, v);
				listaItem.add(it);
			} else {
				System.out.println("Favor cadastrar o cliente.");
			}

			break;
		case 4:
			double vTot = 0.0;
			for (ItemPedido iat : listaItem) {
				vTot = vTot + iat.getValorItem();
			}
			Pedido pedido = new Pedido(10, vTot, listaItem);
			cliente.setPedido(pedido);
			System.out.println(cliente);
			break;
		default:
			break;
		}

	}

}
