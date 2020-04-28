package programacao1.terca.aula13.aovivo;

public class Principal {
	public static void main(String[] args) {
		
		Pet p;
		p = new Ave();
		p.emitirSom();
		
		p = new Cachorro();
		p.emitirSom();
		
		p = new Gato();
		p.emitirSom();
		
		Pet pVet[] = new Pet[3];
		pVet [0] = new Gato();
		pVet [1] = new Cachorro();
		pVet [2] = new Ave();
		for (int i = 0; i < pVet.length; i++) {
			// mesma linha porem executa o emitir som de cada um de seus objetos, polimorfismo
			pVet[i].emitirSom();
		}
		
		
	}

}
