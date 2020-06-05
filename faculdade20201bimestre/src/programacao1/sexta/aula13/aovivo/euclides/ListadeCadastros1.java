package programacao1.sexta.aula13.aovivo.euclides;

import java.util.Scanner;

public class ListadeCadastros1 {
	Cadastrar1 colocar = new Cadastrar1();

	Scanner input = new Scanner(System.in); 
	
	public void Cadastramento() {
		System.out.println("Nome completo: ");
		colocar.setNome_completo(this.input.next());
		System.out.println("RG: ");
		colocar.setRg(this.input.nextInt());
		System.out.println("CPF: ");
		colocar.setCpf(this.input.nextInt());
		colocar.cl.add(colocar);
	}	
	
}
