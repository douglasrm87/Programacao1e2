package programacao1.terca.aula12.aovivo;

import java.util.Scanner;

//https://github.com/douglasrm87/Programacao1e2
public class Controle {

	public static void main(String[] args) {
		Controle c = new Controle();
		c.processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op = 0;
		Camera cam = new Camera();
		do {
			System.out.println("1 - Aumentar Volume");
			System.out.println("2 - Reduzir Volume");
			System.out.println("3 - Aumentar Canal");
			System.out.println("4 - Reduzir canal");
			System.out.println("5 - Ligar TV");
			System.out.println("6 - Setar Canal");
			System.out.println("7 - Configuração atual");
			System.out.println("Digite sua opção:");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				cam.aumentarVolume();
				break;
			case 2:
				cam.reduzirVolume();
				break;
			case 3:
				cam.aumentarCanal();
				break;
			case 4:
				cam.reduzirCanal();
				break;
			case 5:
				cam.ligatTV();
				break;
			case 6:
				try {
					System.out.println("Digite sua novo canal:");
					int canal = this.leia.nextInt();
					cam.setarCanal(canal);
				} catch (IllegalArgumentException e) {
					System.out.println("MSG:" + e.toString());
				}
			case 7:
				System.out.println(cam.toString());
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while (op != 9);

	}

}
