package programacao1.sexta.aula11.aovivo;


// overload ou assinatura de metodos
public class ExemploSobrecargaMetodo {
	int a = 5;
	int b = 10;

	
	/*
	 
	 
	 Assinatura de um metodo = Nome + parametros, onde parametros 
	 pode variar em quantidade e tipo e ainda em posicao
	 *
	 *
	 */
	// sobrecarga de metodo
	public int somar() {
		return this.a + this.b;
	}
	// sobrecarga de metodo
	public int somar(int aL, int bL) {
		return aL + bL;
	}

//	metodo com mesma assinatura do anterior
//	public long somar(int aL, int bL) {
//		return aL + bL;
//	}

	public double somar(double aL, int bL) {
		return aL + bL;
	}
	
	public int somar(int bL) {
		return this.a + bL;
	}
	
	public double somar(double aL, double bL) {
		return aL + bL;
	}


}
