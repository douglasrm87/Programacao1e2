package programacao1.sexta.aula11.aovivo;

public class PrincipalPoliMorfismo {
	public static void main(String[] args) {
		Pet p;// referencia para a classe PET.
		p = new Gato();
		p.emitirSom(); // mesma forma 3 vezes executada
		
		p = new Cachorro();
		p.emitirSom();
		
		p = new Ave();
		p.emitirSom();
				
				
		
		
		
	}

}
