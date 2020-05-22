package programacao2.aula14.jdbc.aovivo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabela {
	private static final String AUTO_INCREMENT = " serial ";
	private static final String REFERENCES = " REFERENCES ";
	private static final String FOREIGN_KEY = " FOREIGN KEY ";

	private static final String CREATE_TABLE_IF_NOT_EXISTS = " CREATE TABLE IF NOT EXISTS  ";
	private static final String DROP_TABLE = " DROP TABLE ";
	private static final String PRIMARY_KEY = " PRIMARY KEY ";

	private static final String TEXT_NOT_NULL = " TEXT NOT NULL ";
	private static final String INT_NOT_NULL = " INT NOT NULL ";
	private static final String NOT_NULL = " NOT NULL ";
	private static final String DATE_NOT_NULL = " DATE NOT NULL";

	protected static final String TABELA_CARTAO_FIDELIDADE = " CARTAO_FIDELIDADE ";
	protected static final String ID_CARTAO = "id_cartao";// não permite espaços.
	protected static final String DATA_INCLUSAO = "data_inclusao";// não permite espaços.

	protected static final String TABELA_CLIENTE = " CLIENTE_CARTAO_FIDELIDADE ";
	protected static final String ID_CLIENTE = "id_cliente";// não permite espaços.
	protected static final String CPF_CLIENTE = "cpf_cliente";// não permite espaços.
	protected static final String NOME = "nome";// não permite espaços.
	protected static final String DATA_REGISTRO = "data_registro";// não permite espaços.
	protected static final String VIRGULA = " , ";

	protected static final String FECHA_PARENTESES = " ) ";
	protected static final String ABRE_PARENTESES = " ( ";

	public static void main(String[] args) {
		new CriaTabela().processar();
	}

	private void processar() {
		Conexao obj = new Conexao();
		Connection myCon = obj.conectarPostGree();
		criarTabelaCliente(myCon);
		criarTabelaCartao(myCon);

		try {
			myCon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void criarTabelaCliente(Connection con) {
		StringBuilder sql = new StringBuilder();
		sql.append(CREATE_TABLE_IF_NOT_EXISTS);
		sql.append(TABELA_CLIENTE);
		sql.append(ABRE_PARENTESES);
		sql.append(ID_CLIENTE);
		sql.append(AUTO_INCREMENT);
		sql.append(NOT_NULL);
		sql.append(VIRGULA);
		sql.append(CPF_CLIENTE);// cpf
		sql.append(INT_NOT_NULL);
		sql.append(PRIMARY_KEY);
		sql.append(VIRGULA);
		sql.append(NOME);// nome
		sql.append(TEXT_NOT_NULL);
		sql.append(VIRGULA);
		sql.append(DATA_REGISTRO);// data
		sql.append(DATE_NOT_NULL);
		sql.append(FECHA_PARENTESES);

		System.out.println("Comando criar tabela: " + sql);
		
		try (Statement comando = con.createStatement();) {
			comando.execute(sql.toString());
		} catch (SQLException e) {
			Conexao.printSQLException(e, null);
		}
	}
	
	private void criarTabelaCartao(Connection con) {
		StringBuilder sql = new StringBuilder();
		sql.append(CREATE_TABLE_IF_NOT_EXISTS);
		sql.append(TABELA_CARTAO_FIDELIDADE);
		sql.append(ABRE_PARENTESES);
		sql.append(ID_CARTAO);
		sql.append(AUTO_INCREMENT);
		sql.append(NOT_NULL);
		sql.append(VIRGULA);
		sql.append(CPF_CLIENTE);// cpf
		sql.append(INT_NOT_NULL);
		sql.append(VIRGULA);
		sql.append(DATA_INCLUSAO);
		sql.append(DATE_NOT_NULL);
		sql.append(VIRGULA);
		sql.append(PRIMARY_KEY);
		sql.append(ABRE_PARENTESES);
		sql.append(ID_CARTAO);
		sql.append(FECHA_PARENTESES);
		sql.append(VIRGULA);
		sql.append(FOREIGN_KEY);
		sql.append(ABRE_PARENTESES);
		sql.append(CPF_CLIENTE);// cpf
		sql.append(FECHA_PARENTESES);
		sql.append(REFERENCES);
		sql.append(TABELA_CLIENTE);
		sql.append(ABRE_PARENTESES);
		sql.append(CPF_CLIENTE);// cpf
		sql.append(FECHA_PARENTESES);
		sql.append(FECHA_PARENTESES);

		System.out.println("Comando criar tabela: " + sql);
		try (Statement statement = con.createStatement();) {
			statement.execute(sql.toString());
		} catch (SQLException e) {
			Conexao.printSQLException(e, null);
		}
	}
	
}
