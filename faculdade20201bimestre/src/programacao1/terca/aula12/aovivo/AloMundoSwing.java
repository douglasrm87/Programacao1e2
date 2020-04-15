package programacao1.terca.aula12.aovivo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AloMundoSwing {
	public static void main(String[] args) {
		AloMundoSwing a = new AloMundoSwing();
		a.processar();
	}
	public void processar() {
		// Construtor
		JFrame frame = new JFrame("AloMundoSwing");
		
		// métodos estáticos são executados como nome da calsse
		JFrame.setDefaultLookAndFeelDecorated(true);

		JLabel label = new JLabel("Alo Mundo");

		Container con = frame.getContentPane();
		con.add(label);

		frame.pack();
		frame.setVisible(true);;


		
		
	}

}
