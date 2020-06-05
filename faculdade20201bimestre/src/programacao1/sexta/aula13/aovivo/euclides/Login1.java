package programacao1.sexta.aula13.aovivo.euclides;

import java.util.Scanner;

public class Login1 {

	public static void main(String[] args) {
		
		Cadastrar1 c = new Cadastrar1();
		ListadeCadastros1 li = new ListadeCadastros1();
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		int op = 0;
		
		do {
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Entrar");
		System.out.println("3 - Listar Produtos");
		System.out.println("4 - Adicionar item");
		System.out.println("0 - Exit");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			li.Cadastramento();		
			break; 
		case 2:
			c.Login();
			break;
			
		case 3:
			c.ListarProdutos();
			break;
			
		case 4:
			c.addItem();
			break;

		case 0 :
			loop = false;
			break;
		}
		
		} while (loop == true);
		
		input.close();
	}
	
}
