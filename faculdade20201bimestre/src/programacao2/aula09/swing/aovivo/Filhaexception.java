package programacao2.aula09.swing.aovivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filhaexception {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("meuarq.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encotrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problemas para acessar o arquivo para leitura.");
			e.printStackTrace();
		}
		
		
		
		 
	}

}
