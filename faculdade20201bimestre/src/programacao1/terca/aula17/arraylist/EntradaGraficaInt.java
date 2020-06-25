package programacao1.terca.aula17.arraylist;

import javax.swing.JOptionPane;

public class EntradaGraficaInt {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite o numero 1.");

		String n2 = JOptionPane.showInputDialog("Digite o numero 2.");

		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);

		try {

			int n1d = Integer.parseInt(n1);
			int n2d = Integer.parseInt(n2);
			System.out.println("n1+n2: " + (n1d + n2d));
		} catch (Exception e) {
			System.out.println("Entrada de Número incorreto.");
		}

	}

}
