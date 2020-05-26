package programacao1.terca.aula15.excecoes.aovivo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploExcecao {

	public static void main(String[] args) {
		new ExemploExcecao().processar();
	}

	public Connection getConexao() throws ClassNotFoundException, SQLException {
		// informa que vamos nos conectar com o driver do MySQL. Precisa-se ter o
		// arquivo mysql-connector-java-5.1.7-bin adicionado ao seu projeto.
		Class.forName("com.mysql.jdbc.Driver");
		// Nesta linha vamos apontar para o banco de dados MySQL instalado no
		// computador. Será necessário instalar o MySQL nos notebooks. Seguro será o
		// nome do database (banco de dados) deste exemplo
		String url = "jdbc:mysql://localhost:3306/seguro?createDatabaseIfNotExist=true";
		// Nesta linha vamos nos conectar, passando a url o usuário e senha. Estes devem
		// ser os mesmos que utilizou quando instalou o MySQl em seu notebook.
		Connection con = DriverManager.getConnection(url, "root", "");
		return con;
	}

	private void processar() {

		try (Connection x = getConexao();) {

		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Soma: " + calculadora(10, 10, "+"));
		try {
			System.out.println("Soma: " + calculadora(10, 0, "/"));
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();

		}

		try {
			avaliarIdade02(90);
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();

		}

		try {
			avaliarIdade(18);
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();
		}

	}

	private void avaliarIdade(int idade) throws Exception {
		if (idade >= 16 && idade < 18) {
			throw new Exception("Pode votar - Facultativo");
		}
		if (idade >= 18) {
			throw new Exception("Pode dirigir");
		}
		if (idade >= 60) {
			throw new Exception("voto Facultativo");
		}
	}

	private void avaliarIdade02(int idade) {
		if (idade >= 16 && idade < 18) {
			throw new IllegalArgumentException("Pode votar - Facultativo");
		}
		if (idade >= 18) {
			throw new IllegalArgumentException("Pode dirigir");
		}
		if (idade >= 60) {
			throw new IllegalArgumentException("voto Facultativo");
		}
	}

	private double calculadora(int a, int b, String operacao) {
		switch (operacao) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;

		default:
			break;
		}
		return 0.0;
	}

}
