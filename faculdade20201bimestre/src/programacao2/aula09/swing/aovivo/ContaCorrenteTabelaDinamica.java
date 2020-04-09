package programacao2.aula09.swing.aovivo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class ContaCorrenteTabelaDinamica {

	JTable table = new JTable();
	JFrame janela = new JFrame();
	JPanel painelPrincipal = new JPanel();

	public static void main(String[] args) {
		new ContaCorrenteTabelaDinamica().processar();
	}

	public void processar() {
		// Utiliza as classes ContaCorrente e TableModelContaCorreteModelo
		montarTableModel();
		// Utiliza a classe JFrame
		preparaJanela();
		// Utiliza a classe JPanel
		preparaPainelPrincipal();
		// Utiliza a classe JFrame tornando-a visivel.
		mostraJanela();
	}

	public void montarTableModel() {
		// por padrão, vem sem bordas, então colocamos:
		this.table.setBorder(new LineBorder(Color.red));
		this.table.setGridColor(Color.black);
		this.table.setShowGrid(true);
		this.table.setBackground(Color.cyan);
		this.table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().setBorder(null);
		scroll.getViewport().add(this.table);
		scroll.setSize(450, 450);

		List<ContaCorrente> listaContas = new ArrayList<>();
		ContaCorrente conta;
		
		for (int i = 0; i < 5; i++) {
			conta = new ContaCorrente(100, 123456, 200.0, "Cliente 01");
			listaContas.add(conta);
			
		}
		
		
		

		ModeloTabela ntm = new ModeloTabela(listaContas);
		this.table.setModel(ntm);

	}

	private void preparaJanela() {
		this.janela = new JFrame("Exemplo Table Model Conta Corrente");
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void preparaPainelPrincipal() {
		this.painelPrincipal = new JPanel();
		this.janela.add(this.painelPrincipal);
		this.janela.add(this.table);
	}

	private void mostraJanela() {
		this.janela.pack();
		this.janela.setSize(540, 540);
		this.janela.setVisible(true);
	}

}