package programacao2.aula09.swing.aovivo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RelogioMain extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel panel;
	JButton botaoIniciar;
	JTextField hora;

	public void criarJanela() {
		this.panel = new JPanel();
		this.hora = new JTextField("");
		this.botaoIniciar = new JButton("Iniciar");
		// Classe Anônima
		this.botaoIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Relogio relogio = new Relogio(hora);
				relogio.start(); // iniciando a thread.
			}
		});
		this.panel.add(this.hora);
		this.panel.add(this.botaoIniciar);
		this.panel.setLayout(new GridLayout(0, 1));
		Container x = getContentPane();
		x.add(this.panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(620, 400); // largura , 2 - altura
		setVisible(true);
	}

	public static void main(String[] args) {
		new RelogioMain().processar();
	}

	public void processar() {
		criarJanela();
	}
}
