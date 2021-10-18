package dao;

import bean.RepasseBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RepasseDAO {

	public static void adicionar(RepasseBean repasse) {
		
		String sql = "INSERT INTO repasse (ano, estado, municipio, esferaGoverno, modalidadeEnsino, valorTotalEscolas) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt    (1, repasse.getAno());
			stmt.setString (2, repasse.getEstado());
			stmt.setString (3, repasse.getMunicipio());
			stmt.setString (4, repasse.getEsferaGoverno());
			stmt.setString (5, repasse.getModalidadeEnsino());
			stmt.setDouble (6, repasse.getValorTotalEscolas());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicioanr repasse: "+e.toString());
		}
		
	}
	
	public static ArrayList<RepasseBean> listar(){
		
		ArrayList<RepasseBean> repasse = new ArrayList<>();
		
		String sql = "SELECT * FROM repasse";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				RepasseBean temporario = new RepasseBean();
				
				temporario.setId(dados.getInt("id"));
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setEsferaGoverno (dados.getString("esferaGoverno"));
				temporario.setModalidadeEnsino (dados.getString("modalidadeEnsino"));
				temporario.setValorTotalEscolas (dados.getDouble("valorTotalEscolas"));
				
				repasse.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de repasse: "+e.toString());
		}
		
		return repasse;
	}
	
	public static RepasseBean mostraRepasse(int id) {
		RepasseBean repasse = null;
		
		String sql = "SELECT * FROM repasse WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				repasse = new RepasseBean();
			
				repasse.setId(registro.getInt("id"));
				repasse.setAno(registro.getInt("ano"));
				repasse.setEstado(registro.getString("estado"));
				repasse.setMunicipio(registro.getString("municipio"));
				repasse.setEsferaGoverno(registro.getString("esferaGoverno"));
				repasse.setModalidadeEnsino(registro.getString("modalidadeEnsino"));
				repasse.setValorTotalEscolas(registro.getInt("valorTotalEscolas"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de repasse: "+e.toString());
		}
		return repasse;
	}
	
	
	public static void atualizar(RepasseBean repasse) {
		
		
		String sql = " UPDATE repasse SET ano = ?, estado = ?, municipio = ?, esferaGoverno = ?, modalidadeEnsino = ?, valorTotalEscolas = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt   (1, repasse.getAno());
			stmt.setString(2, repasse.getEstado());
			stmt.setString(3, repasse.getMunicipio());
			stmt.setString(4, repasse.getEsferaGoverno());
			stmt.setString(5, repasse.getModalidadeEnsino());
			stmt.setDouble(6, repasse.getValorTotalEscolas());
			stmt.setInt(7, repasse.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar repasse: "+e.toString());
		}
	}
	
}
