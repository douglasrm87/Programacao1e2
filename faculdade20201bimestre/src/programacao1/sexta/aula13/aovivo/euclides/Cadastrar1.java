package programacao1.sexta.aula13.aovivo.euclides;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastrar1 {
	Scanner input = new Scanner(System.in);

	private String nome_completo;
	private int rg;
	private int cpf;
	List item = new ArrayList(0);

	ArrayList<Cadastrar1> cl = new ArrayList<Cadastrar1>();

	public void addItem() {
		int j = 0;
		item.add(j + 1);
		j++;
	}

	public void ListarProdutos() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Produto " + i + " = " + item);
		}
	}

	public void Login() {
		for (int i = 0; i < 10; i++) {
			if (cl.get(i) != cl.get(i + 1)) {
				System.out.println("Login efetuado");
			} else {
				System.out.println("Não há Cadastro");
			}
		}
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cadastrar [nome_completo=" + nome_completo + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
}
