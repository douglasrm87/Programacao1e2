package programacao1.sexta.aula13.aovivo.felipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

public class Main1 {
	login1 lg = new login1();

	public static void main(String[] args) {
		Main1 obj = new Main1();
		obj.processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int opcao = 0;
		while (opcao != 9) {
			System.out.println("1 - Login");
			System.out.println("2 - Cadastrar no Site");
			System.out.println("3 - Adicionar Compra");
			System.out.println("4 - Carrinho");
			System.out.println("5 - Escolher metodo de Pagamento");
			System.out.println("6 - Cancelar Compra");
			System.out.println("7 - Confirmar Compra");
			System.out.println("8 - Ver dados");
			System.out.println("9 - Sair");
			System.out.println("Escolha um opção");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				realizarlogin();
				break;
			case 2:
				cadastra();
				break;
			case 3:
				addcompra();
				break;
			case 4:
				car();
			case 5:
				pag();
				break;
			case 6:
				cance();
				break;
			case 7:
				conf();
				break;
			case 8:
				dados();
			case 9:
				sair();
				break;
			}
			 
		}
	}

	public void realizarlogin() {
		System.out.println("Digite o CPF");
		this.lg.cpf = leia.nextLong();
		System.out.println("Login efetuado");

	}

	public void cadastra() {
		System.out.println("Digite o CPF");
		this.lg.cpf = leia.nextLong();
		System.out.println("Nome completo");
		this.lg.nome = leia.next();
		System.out.println("Email");
		this.lg.email = leia.next();
		System.out.println("CEP");
		this.lg.cep = leia.nextLong();
		System.out.println("Numero de Telefone");
		this.lg.telefone = leia.nextLong();
	}

	public void addcompra() {
		List<produto1> listaProduto = new ArrayList<>();

		produto1 p1 = new produto1("Razer DeathAdder", 6400, "R$650");
		listaProduto.add(p1);

		produto1 p2 = new produto1("Logitech G402 Hyperion Fury", 10000, "R$530");
		listaProduto.add(p2);

		produto1 p3 = new produto1("SteelSeries Sensei Laser Gaming", 8600, "R$250");
		listaProduto.add(p3);

		produto1 p4 = new produto1("Corsair Harpoon", 3600, "R$ 160");
		listaProduto.add(p4);

		for (produto1 produto : listaProduto) {
			System.out.println(produto);
		}

	}

	public void car() {
		List<produto1> listaProduto = new ArrayList<>();

		produto1 p1 = new produto1("Razer DeathAdder", 6400, "R$650");
		listaProduto.add(p1);

		produto1 p2 = new produto1("Logitech G402 Hyperion Fury", 10000, "R$530");
		listaProduto.add(p2);

		produto1 p3 = new produto1("SteelSeries Sensei Laser Gaming", 8600, "R$250");
		listaProduto.add(p3);

		produto1 p4 = new produto1("Corsair Harpoon", 3600, "R$ 160");
		listaProduto.add(p4);

		for (produto1 produto : listaProduto) {
			System.out.println(produto);
		}
	}

	public void pag() {
		this.lg.pagamento();
	}

	public void cance() {
		this.lg.cancelar();
	}

	public void conf() {
		this.lg.confirmacao();
	}

	public void dados() {
		this.lg.imprimir();
	}

	public void sair() {
		this.lg.logoff();
	}
}