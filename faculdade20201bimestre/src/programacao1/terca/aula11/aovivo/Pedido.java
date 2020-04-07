package programacao1.terca.aula11.aovivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date periodoPerm;
	List<Prato> listaPrato = new ArrayList<Prato>(); 
	
	
	public Pedido(Date periodoPerm) {
		super();
		this.periodoPerm = periodoPerm;
	}
	public void registrarPrato(Prato pratoLocal) {
		this.listaPrato.add(pratoLocal);
		
	}
	public double fecharPedido() {
		double totLocal = 0.0;
		for (Prato pratoLocal : this.listaPrato) {
			totLocal = totLocal + pratoLocal.getPreco();
			System.out.println("Item:" + pratoLocal.toString());
		}
		System.out.println("Entrada no restaurante:" + this.periodoPerm);
		System.out.println("Saída no restaurante:" + new Date());
		
		return totLocal;
	}
	public void avaliarAtendimento(int avaliaçao) {
		System.out.println("Avalie o atendimento recebido 5-10:");
		System.out.println("Avaliação:" + avaliaçao);
		
	}

}
