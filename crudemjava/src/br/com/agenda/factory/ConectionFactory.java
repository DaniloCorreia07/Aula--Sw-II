package br.com.agenda.factory;

 import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionFactory {
	
	//nome do usu�rio
	private static final String USERNAME = "root";
	
	//senha do banco
	private static final String PASSWORD = "";
	
	//caminho pro banco
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	/*
	 * Conex�o com o banco de dados
	 */
	
	public static Connection createConnectionToMysql() throws Exception{
		//Classe carregada JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria conex�o com o bd
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String [] args) {
		
		//Recuperar conex�o
		Connection con = creatConnectionToMysql ();
		
		//Test
		if(con!=null) {
			System.out.println("Conex�o obtida");
			con.close();
		}
		
	}

}
