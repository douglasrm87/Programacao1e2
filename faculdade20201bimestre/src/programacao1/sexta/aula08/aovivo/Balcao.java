package programacao1.sexta.aula08.aovivo;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

//https://github.com/douglasrm87/Programacao1e2
public class Balcao {

	public static void main(String[] args) {
		Balcao b = new Balcao();
		b.processar();
	}

	Scanner leia = new Scanner(System.in);

	Contrato cont = new Contrato();

	private double preco;
	private String marca;
	private String modelo;

	private void lerDadosComuns() {
		System.out.println("Digite a Marca:");
		this.marca = this.leia.next();
		System.out.println("Digite o modelo:");
		this.modelo = this.leia.next();
		System.out.println("Digite o preco:");
		this.preco = this.leia.nextDouble();
	}

	private void processar() {
		System.out.println("1-Adicionar Moto");
		System.out.println("2-Adicionar Bicicleta");
		System.out.println("3-Adicionar Patinete");
		System.out.println("4-Adicionar Carro");
		System.out.println("7-Encerrar vigencia");
		System.out.println("9 - encerrar aplicação");
		System.out.println("Digite sua opção:");
		int op = leia.nextInt();
		switch (op) {
		case 1:
			System.out.println("Adicionar Moto");
			lerDadosComuns();
			System.out.println("Digite a cilindrada:");
			int cilindrada = this.leia.nextInt();
			Moto moto = new Moto();
			moto.setCilindrada(cilindrada);
			moto.setMarca(this.marca);
			moto.setModelo(this.modelo);
			moto.setPreco(this.preco);

			this.cont.adicionarVeiculo(moto);

			break;
		case 2:
			System.out.println("Adicionar Bicicleta");
			lerDadosComuns();

			int raioAro = this.leia.nextInt();
			String tpFreio = this.leia.next();
			String tpMarcha = this.leia.next();
			
			Bicicleta bike = new Bicicleta();
			bike.setMarca(this.marca);
			bike.setModelo(this.modelo);
			bike.setPreco(this.preco);
			bike.setRaioAro(raioAro);
			bike.setTpFreio(tpFreio);
			bike.setTpMarcha(tpMarcha);
			
			this.cont.adicionarVeiculo(bike);
			
			
			
			
			
			

			break;
		case 3:
			System.out.println("Adicionar Patinete");
			lerDadosComuns();
			break;
		case 4:
			System.out.println("Adicionar Carro");
			lerDadosComuns();
			break;
		case 7:
			System.out.println("Encerrar vigencia Contrato");
			break;
		case 9:
			System.out.println("Encerrar aplicação");
			break;
		default:
			break;
		}

	}
}
