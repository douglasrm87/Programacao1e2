package programacao2.aula09.swing.aovivo;

public class FilhaRuntime {
	public static void main(String[] args) {
		try {

			int a = 10;
			int b = 0;
			double r = a / b;
		} catch (Exception e) {
			System.out.println("Problemas de: " + e.toString());
		}

	}

}
