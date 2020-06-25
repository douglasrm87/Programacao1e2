package programacao1.terca.aula17.arraylist;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		double b = 0.0;
		double a = 0.0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a base:");
		b = leia.nextDouble();
		System.out.println("Digite a altura:");
		a = leia.nextDouble();		
		double area = (b * a) / 2.0;
		leia.close();
	}

}
