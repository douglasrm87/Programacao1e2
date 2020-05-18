package programacao2.aula12.map.aovivo;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<Integer, String> meuMapa = new HashMap<>();
		meuMapa.put(0, "Alexandre");
		meuMapa.put(1, "Bruno");
		meuMapa.put(2, "Carlos");
		meuMapa.put(3, "Fabricio");
		meuMapa.put(4, "Henrique");
		meuMapa.put(5, "Joao cleber");
		meuMapa.put(6, "Joao Pedro");
		meuMapa.put(7, "Samuel");
		meuMapa.put(8, "Vagner");
		meuMapa.put(9, "Wesley");
		meuMapa.put(10, "Rafaela");
		for (int i = 0; i < meuMapa.size(); i++) {
			System.out.println("item Mapa: " + meuMapa.get(i));
		}
	 /*
	  * Resultado do mapa
item Mapa: null
item Mapa: Rafael
item Mapa: null
item Mapa: null
item Mapa: Alexandre
	  */
		
	}

}
