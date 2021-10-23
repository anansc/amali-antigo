package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.ProdutosBean;

public class ProdutosDao {
	
public static void adicionar(ProdutosBean produtos) {
		
		String sql = "INSERT INTO produtos (categoria_id, nome, unidade) VALUES (?,?,?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt (1, produtos.getCategoria_id());
			stmt.setString (2, produtos.getNome());
			stmt.setString (3, produtos.getUnidade());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicionar produtos: "+e.toString());
		}
		
	}

public static ArrayList<ProdutosBean> listar(){
	
	ArrayList<ProdutosBean> produtos = new ArrayList<>();
	
	String sql = "SELECT * FROM produtos";
	
	try {
		Connection conexao = (Connection) ConexaoDB.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet dados = stmt.executeQuery();
		
		while(dados.next()) {
			ProdutosBean temporario = new ProdutosBean();
			
			temporario.setId	(dados.getInt("id"));
			temporario.setCategoria_id 	(dados.getInt("categoria_id"));
			temporario.setNome (dados.getString("nome"));
			temporario.setUnidade 	(dados.getString("unidade"));
			
			
			produtos.add(temporario);
		}
	}catch(Exception e) {
		System.err.println("Erro no listar de Produtos: "+e.toString());
	}
	
	return produtos;
}

public static ProdutosBean mostraProdutos(int id) {
	
	ProdutosBean produtos = null;
	
	String sql = "SELECT * FROM produtos WHERE id = ?";
	
	try {
		
		Connection conexao = (Connection) ConexaoDB.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		ResultSet registro = stmt.executeQuery();
		
		while (registro.next()) {
			produtos = new ProdutosBean();
			
			produtos.setId	(registro.getInt("id"));
			produtos.setCategoria_id (registro.getInt("categoria_id"));
			produtos.setNome (registro.getString("nome"));
			produtos.setUnidade  (registro.getString("unidade"));
		}
		
	}catch(Exception e) {
		System.err.println("Erro na consulta de produtos: "+e.toString());
	}
	return produtos;
	
}

public static void atualizar(ProdutosBean produtos) {
	
	String sql = " UPDATE produtos SET categoria_id = ?, nome = ?, unidade = ? WHERE id = ?";

	try {
		Connection conexao = (Connection) ConexaoDB.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setInt (1, produtos.getCategoria_id());
		stmt.setString (2, produtos.getNome());
		stmt.setString (3, produtos.getUnidade());
		stmt.setInt    (4, produtos.getId());
		
		int rowsUpdated = stmt.executeUpdate();
		
		if(rowsUpdated >0) {
			System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
		}	
		
	}catch(Exception e) {
		System.err.println("Erro ao atualizar produtos: "+e.toString());
	}
}	
}
