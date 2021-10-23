package dao;

import bean.EscolasBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EscolasDAO {
	
	public static void adicionar(EscolasBean escolas) {
		
		String sql = "INSERT INTO escolas (id, nome, email, cnpj, telefone, endereco) VALUES (?,?,?,?,?,?)";
		
	}

}
