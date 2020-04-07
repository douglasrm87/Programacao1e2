package programacao1.terca.aula11.aovivo;

public class Marmita {
	private int tipomarmita; // 1 - pequena, 2 - media e 3 -grande

	@Override
	public String toString() {
		return super.toString() + " Marmita [tipomarmita=" + tipomarmita + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getTipomarmita() {
		return tipomarmita;
	}

	public void setTipomarmita(int tipomarmita) {
		this.tipomarmita = tipomarmita;
	}
	

}
