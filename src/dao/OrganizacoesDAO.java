package dao;

import bean.OrganizacoesBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class OrganizacoesDAO {
	public static void adicionar(OrganizacoesBean organizacoes) {
		
		String sql = "INSERT INTO organizacoes (nome, email, cnpj, telefone, endereco, tipo) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString (1, organizacoes.getNome());
			stmt.setString (2, organizacoes.getEmail());
			stmt.setString (3, organizacoes.getCnpj());
			stmt.setString (4, organizacoes.getTelefone());
			stmt.setString (5, organizacoes.getEndereco());
			stmt.execute();
			conexao.close();
		}catch(Exception e) {
			System.err.println("Erro ao adicionar organização: "+e.toString());
		}
	}
	
	public static ArrayList<OrganizacoesBean> listar(){
		
		ArrayList<OrganizacoesBean> organizacoes = new ArrayList<>();
		
		String sql = "SELECT * FROM organizacoes";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				OrganizacoesBean temporario = new OrganizacoesBean();
				
				temporario.setId(dados.getInt("id"));
				temporario.setNome (dados.getString("nome"));
				temporario.setEmail (dados.getString("email"));
				temporario.setCnpj (dados.getString("cnpj"));
				temporario.setTelefone (dados.getString("telefone"));
				temporario.setEndereco (dados.getString("endereco"));
				temporario.setTipo (dados.getString("tipo"));
				
				organizacoes.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de organizacoes: "+e.toString());
		}
		
		return organizacoes;
	}
	
	public static OrganizacoesBean mostraOrganizacoes(int id) {
		
		OrganizacoesBean organizacoes = null;
		
		String sql = "SELECT * FROM organizacoes WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				organizacoes = new OrganizacoesBean();
				
				organizacoes.setId(registro.getInt("id"));
				organizacoes.setNome (registro.getString("nome"));
				organizacoes.setEmail (registro.getString("email"));
				organizacoes.setCnpj (registro.getString("cnpj"));
				organizacoes.setTelefone (registro.getString("telefone"));
				organizacoes.setEndereco (registro.getString("endereco"));
				organizacoes.setTipo (registro.getString("tipo"));
			
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de organizacoes: "+e.toString());
		}
		return organizacoes;
	}
	
	public static void atualizar(OrganizacoesBean organizacoes) {
		
		
		String sql = " UPDATE organizacoes SET nome = ?, email = ?, cnpj = ?, telefone = ?, endereco = ?, tipo = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, organizacoes.getNome());
			stmt.setString(2, organizacoes.getEmail());
			stmt.setString(3, organizacoes.getCnpj());
			stmt.setString(4, organizacoes.getTelefone());
			stmt.setString(5, organizacoes.getEndereco());
			stmt.setString(6, organizacoes.getTipo());
			stmt.setInt(7, organizacoes.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar organizacoes: "+e.toString());
		}
	
	

}}