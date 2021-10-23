package dao;

import bean.EscolasBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EscolasDAO {
	
	public static void adicionar(EscolasBean escolas) {
		
		String sql = "INSERT INTO escolas (nome, email, cnpj, telefone, endereco) VALUES (?,?,?,?,?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString (1, escolas.getNome());
			stmt.setString (2, escolas.getEmail());
			stmt.setString (3, escolas.getCnpj());
			stmt.setString (4, escolas.getTelefone());
			stmt.setString (5, escolas.getEndereco());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicionar escolas: "+e.toString());
		}
		
	}
	
	public static ArrayList<EscolasBean> listar(){
		
		ArrayList<EscolasBean> escolas = new ArrayList<>();
		
		String sql = "SELECT * FROM escolas";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				EscolasBean temporario = new EscolasBean();
				
				temporario.setId	(dados.getInt("id"));
				temporario.setNome 	(dados.getString("nome"));
				temporario.setEmail (dados.getString("email"));
				temporario.setCnpj 	(dados.getString("cnpj"));
				temporario.setTelefone (dados.getString("telefone"));
				temporario.setEndereco (dados.getString("endereco"));
				
				escolas.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de Escolas: "+e.toString());
		}
		
		return escolas;
	}
	
	public static EscolasBean mostraEscolas(int id) {
		
		EscolasBean escolas = null;
		
		String sql = "SELECT * FROM escolas WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				escolas = new EscolasBean();
				
				escolas.setId	(registro.getInt("id"));
				escolas.setNome (registro.getString("nome"));
				escolas.setEmail (registro.getString("email"));
				escolas.setCnpj  (registro.getString("cnpj"));
				escolas.setTelefone	(registro.getString("telefone"));
				escolas.setEndereco (registro.getString("endereco"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de escolas: "+e.toString());
		}
		return escolas;
		
	}
	
	public static void atualizar(EscolasBean escolas) {
		
		String sql = " UPDATE escolas SET nome= ?, email = ?, cnpj = ?, telefone = ?, endereco = ? WHERE id = ?";

		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString (1, escolas.getNome());
			stmt.setString (2, escolas.getEmail());
			stmt.setString (3, escolas.getCnpj());
			stmt.setString (4, escolas.getTelefone());
			stmt.setString (5, escolas.getEndereco());
			stmt.setInt    (6, escolas.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}	
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar escolas: "+e.toString());
		}
	}	
}
