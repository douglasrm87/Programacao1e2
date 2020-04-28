package programacao1.terca.aula13.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExemploListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei no botão");
		
	}
	public static void main(String[] args) {
		new ExemploListener().processar();
	}
 
	private void processar() {

		// Cria e organiza a janela
		JFrame frame = new JFrame("AloMundoSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adiciona o rotulo "Alo Mundo".

		// Faz com que tenha uma decoracao de janela
		JFrame.setDefaultLookAndFeelDecorated(true);

		JLabel label = new JLabel("Alo Mundo");
		
		JButton botao = new JButton("Meu botão com clique");
		botao.addActionListener(this);
		
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(botao);
		
		// Exibe a janela
		frame.pack();
		frame.setVisible(true);
	}
}
