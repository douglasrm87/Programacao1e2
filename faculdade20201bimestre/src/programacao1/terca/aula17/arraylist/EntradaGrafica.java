package programacao1.terca.aula17.arraylist;

import javax.swing.JOptionPane;

public class EntradaGrafica {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite o numero 1.");

		String n2 = JOptionPane.showInputDialog("Digite o numero 2.");

		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);

		try {

			double n1d = Double.parseDouble(n1);
			double n2d = Double.parseDouble(n2);
			System.out.println("n1+n2: " + (n1d + n2d));
		} catch (Exception e) {
			System.out.println("Entrada de Número incorreto.");
		}

	}

}
