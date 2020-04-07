package programacao1.terca.aula11.aovivo;

public class Espeto extends Prato {
	private int qdadeTpCarne;
	private boolean acessarBuffet;
	public int getQdadeTpCarne() {
		return qdadeTpCarne;
	}
	public void setQdadeTpCarne(int qdadeTpCarne) {
		this.qdadeTpCarne = qdadeTpCarne;
	}
	public boolean isAcessarBuffet() {
		return acessarBuffet;
	}
	public void setAcessarBuffet(boolean acessarBuffet) {
		this.acessarBuffet = acessarBuffet;
	}
	@Override
	public String toString() {
		return super.toString() +  " Espeto [qdadeTpCarne=" + qdadeTpCarne + ", acessarBuffet=" + acessarBuffet + "]";
	}

	
	
}
