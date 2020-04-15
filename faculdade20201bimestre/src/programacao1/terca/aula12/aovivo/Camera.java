package programacao1.terca.aula12.aovivo;

//https://github.com/douglasrm87/Programacao1e2
public class Camera {

	private int canal = 12;
	private int volume = 10;
	private boolean estaLigada = false;

	@Override
	public String toString() {
		return "Camera [canal=" + this.canal + ", volume=" + this.volume + ", estaLigada=" + this.estaLigada + "]";
	}

	public void setarCanal(int novoCanal) {
		if (novoCanal >= 1 && novoCanal <= 99) {
			this.canal = novoCanal;
		} else {
			throw new IllegalArgumentException("Canal Recebido fora do limite - 1...99");
		}

	}

	public void aumentarCanal() {
		if (this.canal < 99) {
			this.canal = this.canal + 1;
		} else {
			this.canal = 1;
		}
	}

	public void reduzirCanal() {
		if (this.canal > 1) {
			this.canal = this.canal - 1;
		}
		this.canal = 99;
	}

	public void aumentarVolume() {
		if (this.volume < 15) {
			this.volume += 1;
		} else {
			this.volume = 1;
		}
	}

	public void reduzirVolume() {
		if (this.volume > 1) {
			this.volume -= 1;
		} else {
			this.volume = 15;
		}
	}

	public void ligatTV() {
		this.estaLigada = true;
	}

}
