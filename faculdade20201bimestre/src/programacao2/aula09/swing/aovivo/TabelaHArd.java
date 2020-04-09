package programacao2.aula09.swing.aovivo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelaHArd {

	public static void main(String[] args) {
		// massa
		String colunas[] = { "Móveis", "Eletro", "Utensílios", "Pets" };
		String linhas[][] = { /* 0 */{ "Sofá", "TV", "Faca", "Dog" }, /* 1 */{ "Cama", "Aspirador", "Colher", "Cat" },
				/* 2 */{ "Estante", "Som", "Garfo", "Duck" } };

		JTable table = new JTable(linhas, colunas); // uso do construtopr
		JScrollPane scrollPane = new JScrollPane(table);

		// recheio
		JPanel painel = new JPanel();
		painel.add(scrollPane, BorderLayout.CENTER); // usando atributo estático
		painel.setBackground(Color.GREEN);// usando atributo estático

		// levar ao forno
		JFrame tela = new JFrame("Minha tabela bonita");
		tela.add(painel);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // usando atributo estático
		tela.setSize(900, 500);
		tela.setVisible(true);

	}

}
