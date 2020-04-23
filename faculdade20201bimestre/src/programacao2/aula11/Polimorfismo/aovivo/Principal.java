package programacao2.aula11.Polimorfismo.aovivo;

public class Principal {
	public static void main(String[] args) {
		Animal animal;
		animal = new Ave();
		animal.emitirSom();//polimorfismo + sobrescrita de metodo(Override)
		
		animal = new Cachorro();
		animal.emitirSom();
		
		animal = new Gato();
		animal.emitirSom();
		
	}

}
