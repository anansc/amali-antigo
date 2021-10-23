package dao;

import bean.AlimentosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlimentosDAO {

	public static void adicionar(AlimentosBean alimentos) {
		
		String sql = "INSERT INTO alimentos (ano, estado, municipio, entidadeExecutora, agriculturaFamiliar, organico, nomeProduto, documentoDespesa, unidadeMedida, qtComprada, valorUnitario, valorTotal) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt    (1, alimentos.getAno());
			stmt.setString (2, alimentos.getEstado());
			stmt.setString (3, alimentos.getMunicipio());
			stmt.setString (4, alimentos.getEntidadeExecutora());
			stmt.setBoolean(5, alimentos.getAgriculturaFamiliar());
			stmt.setBoolean(6, alimentos.getOrganico());
			stmt.setString (7, alimentos.getNomeProduto());
			stmt.setInt    (8, alimentos.getDocumentoDespesa());
			stmt.setString (9, alimentos.getUnidadeMedida());
			stmt.setDouble (10, alimentos.getQtComprada());
			stmt.setDouble (11, alimentos.getValorUnitario());
			stmt.setDouble (12, alimentos.getValorTotal());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicionar alimentos: "+e.toString());
		}
		
	}
	
	public static ArrayList<AlimentosBean> listar(){
		
		ArrayList<AlimentosBean> alimentos = new ArrayList<>();
		
		String sql = "SELECT * FROM alimentos";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				AlimentosBean temporario = new AlimentosBean();
				
				temporario.setId(dados.getInt("id"));
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setEntidadeExecutora(dados.getString("entidadeExecutora"));
				temporario.setAgriculturaFamiliar (dados.getBoolean("agriculturaFamiliar"));
				temporario.setOrganico (dados.getBoolean("organico"));
				temporario.setNomeProduto (dados.getString("nomeProduto"));
				temporario.setDocumentoDespesa (dados.getInt("documentoDespesa"));
				temporario.setUnidadeMedida (dados.getString("unidadeMedida"));
				temporario.setQtComprada (dados.getDouble("QtComprada"));
				temporario.setValorUnitario (dados.getDouble("valorUnitario"));
				temporario.setValorTotal (dados.getDouble("valorTotal"));
				
				alimentos.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de alimentos: "+e.toString());
		}
		
		return alimentos;
	}
	
	public static AlimentosBean mostraAlimentos(int id) {
		AlimentosBean alimentos = null;
		
		String sql = "SELECT * FROM alimentos WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				alimentos = new AlimentosBean();
				
				alimentos.setId(registro.getInt("id"));
				alimentos.setAno (registro.getInt("ano"));
				alimentos.setEstado (registro.getString("estado"));
				alimentos.setMunicipio (registro.getString("municipio"));
				alimentos.setEntidadeExecutora(registro.getString("entidadeExecutora"));
				alimentos.setAgriculturaFamiliar (registro.getBoolean("agriculturaFamiliar"));
				alimentos.setOrganico (registro.getBoolean("organico"));
				alimentos.setNomeProduto (registro.getString("nomeProduto"));
				alimentos.setDocumentoDespesa (registro.getInt("documentoDespesa"));
				alimentos.setUnidadeMedida (registro.getString("unidadeMedida"));
				alimentos.setQtComprada (registro.getDouble("QtComprada"));
				alimentos.setValorUnitario (registro.getDouble("valorUnitario"));
				alimentos.setValorTotal (registro.getDouble("valorTotal"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de alimentos: "+e.toString());
		}
		return alimentos;
	}
	
	
	public static void atualizar(AlimentosBean alimentos) {
		
		
		String sql = " UPDATE alimentos SET ano = ?, estado = ?, municipio = ?, entidadeExecutora = ?, agriculturaFamiliar = ?, organico = ?, nomeProduto = ?, documentoDespesa = ?, unidadeMedida = ?, qtComprada = ?, valorUnitario = ?, valorTotal = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
		//	******************************
			stmt.setInt    (1, alimentos.getAno());
			stmt.setString (2, alimentos.getEstado());
			stmt.setString (3, alimentos.getMunicipio());
			stmt.setString (4, alimentos.getEntidadeExecutora());
			stmt.setBoolean(5, alimentos.getAgriculturaFamiliar());
			stmt.setBoolean(6, alimentos.getOrganico());
			stmt.setString (7, alimentos.getNomeProduto());
			stmt.setInt    (8, alimentos.getDocumentoDespesa());
			stmt.setString (9, alimentos.getUnidadeMedida());
			stmt.setDouble (10, alimentos.getQtComprada());
			stmt.setDouble (11, alimentos.getValorUnitario());
			stmt.setDouble (12, alimentos.getValorTotal());
			stmt.setInt    (13, alimentos.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar alimentos: "+e.toString());
		}
	}
	
}
