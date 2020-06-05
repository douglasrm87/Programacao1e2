package programacao1.sexta.aula13.aovivo.felipe;

public class produto1 {
private String Modelo;
private int DPI;
private String Valor;
public produto1() {
	
}

public String getModelo() {
	return Modelo;
}
public void setModelo(String modelo) {
	Modelo = modelo;
}
public int getDPI() {
	return DPI;
}
public void setDPI(int dPI) {
	DPI = dPI;
}
public String getValor() {
	return Valor;
}
public void setValor(String valor) {
	Valor = valor;
}


@Override
public String toString() {
	return "produto [Modelo=" + Modelo + ", DPI=" + DPI + ", Valor=" + Valor + "]";
}

public produto1(String modelo, int dPI, String valor) {
	super();
	Modelo = modelo;
	DPI = dPI;
	Valor = valor;
}

}
