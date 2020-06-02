package programacao3;

public class Base implements InterfaceBase {
	public static void main(String[] args) {
		new Base().processar();
	}

	private void processar() {
		System.out.println(valor);
//		valor = "novo valor";
	}

}
