package programacao2.aula16.preparestm.aovivo;

import java.util.Date;

public class Venda {
	private int matricula;
	private String nome;
	private Date data;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Venda(int matricula, String nome, Date data) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.data = data;
	}
	

}
