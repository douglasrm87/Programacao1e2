package programacao2.aula12.map.aovivo;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap2Each {
	public static void main(String[] args) {
		Map<Integer, String> meuMapa = new HashMap<>();
		meuMapa.put(4, "Alexandre");
		meuMapa.put(5, "Bruno");
		meuMapa.put(6, "Carlos");
		meuMapa.put(7, "Henrique");
		meuMapa.put(7, "Wesley");
		meuMapa.put(1, "Rafael");

		for (Map.Entry<Integer, String> value : meuMapa.entrySet()) {
			System.out.println("Chave: " + value.getKey());
			System.out.println("valor: " + value.getValue());
		}

	}
}
