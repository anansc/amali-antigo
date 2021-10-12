package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoDB {

	private static final String USUARIO = "seunomedeusuario";
	private static final String SENHA = "suasenha";
	private static final String URL_BANCO = "jdbc:mysql://localhost:3306/onomedoseubanco";
	
		
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
