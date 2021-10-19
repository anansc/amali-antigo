package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoDB {
	
	//coloque seu nome de usuario do mysql
	private static final String USUARIO = "root";
	
	//coloque sua senha de conex�o
	private static final String SENHA = "Innounp163";
	
	//se voc� n�o tiver o banco de dados criado, n�o coloque o nome do bd ap�s a indica��o do local host
	//caso j� tenha criado, coloque o nome do banco do banco de dados a ser utilizado
	private static final String URL_BANCO = "jdbc:mysql://localhost:3306/projeti";
	
		
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
	
		Connection con = null;
		
			try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);
			}catch (SQLException ex) {
					System.err.println("Erro ao conectar BD : "+ ex.toString());
			}catch(ClassNotFoundException ex) {
					System.err.println("Erro de classe : "+ ex.toString());
			}
		
		return con;
	}
}
