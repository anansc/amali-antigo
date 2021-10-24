package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.MdEscolasBean;

public class MdEscolasDAO {

	
	public static void adicionar(MdEscolasBean mdEscolas) {
		
		String sql = "INSERT INTO mdEscolas (janeiro, fevereiro, marco, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro, ano, tipo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt (1, mdEscolas.getJaneiro());
			stmt.setInt (2, mdEscolas.getFevereiro());
			stmt.setInt (3, mdEscolas.getMarco());
			stmt.setInt (4, mdEscolas.getAbril());
			stmt.setInt	(5, mdEscolas.getMaio());
			stmt.setInt	(6, mdEscolas.getJunho());
			stmt.setInt (7, mdEscolas.getJulho());
			stmt.setInt (8, mdEscolas.getAgosto());
			stmt.setInt (9, mdEscolas.getSetembro());
			stmt.setInt (10, mdEscolas.getOutubro());
			stmt.setInt (11, mdEscolas.getNovembro());
			stmt.setInt (12, mdEscolas.getDezembro());
			stmt.setString (13, mdEscolas.getAno());
			stmt.setString (14, mdEscolas.getTipo());
			stmt.setInt    (15, mdEscolas.getId());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicionar mdEscolas: "+e.toString());
		}
		
	}
	
	public static ArrayList<MdEscolasBean> listar(){
		
		ArrayList<MdEscolasBean> mdEscolas = new ArrayList<>();
		
		String sql = "SELECT * FROM mdEscolas";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				MdEscolasBean temporario = new MdEscolasBean();
				
				temporario.setId(dados.getInt("id"));
				temporario.setJaneiro (dados.getInt("janeiro"));
				temporario.setFevereiro (dados.getInt("fevereiro"));
				temporario.setMarco (dados.getInt("marco"));
				temporario.setAbril(dados.getInt("abril"));
				temporario.setMaio (dados.getInt("maio"));
				temporario.setJunho (dados.getInt("junho"));
				temporario.setJulho (dados.getInt("julho"));
				temporario.setAgosto (dados.getInt("agosto"));
				temporario.setSetembro (dados.getInt("setembro"));
				temporario.setOutubro (dados.getInt("Outubro"));
				temporario.setNovembro (dados.getInt("novembro"));
				temporario.setDezembro (dados.getInt("dezembro"));
				temporario.setAno (dados.getString("ano"));
				temporario.setTipo (dados.getString("tipo"));
				
				mdEscolas.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de mdEscolas: "+e.toString());
		}
		
		return mdEscolas;
	}
	
	public static MdEscolasBean mostraMDEscolas(int id) {
		MdEscolasBean mdEscolas = null;
		
		String sql = "SELECT * FROM mdEscolas WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				mdEscolas = new MdEscolasBean();
				
				mdEscolas.setId(registro.getInt("id"));
				mdEscolas.setJaneiro (registro.getInt("janeiro"));
				mdEscolas.setFevereiro (registro.getInt("fevereiro"));
				mdEscolas.setMarco (registro.getInt("marco"));
				mdEscolas.setAbril(registro.getInt("abril"));
				mdEscolas.setMaio (registro.getInt("maio"));
				mdEscolas.setJunho (registro.getInt("junho"));
				mdEscolas.setJulho (registro.getInt("julho"));
				mdEscolas.setAgosto (registro.getInt("agosto"));
				mdEscolas.setSetembro (registro.getInt("setembro"));
				mdEscolas.setOutubro (registro.getInt("Outubro"));
				mdEscolas.setNovembro (registro.getInt("novembro"));
				mdEscolas.setAno (registro.getString("ano"));
				mdEscolas.setTipo (registro.getString("tipo"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de mdEscolas: "+e.toString());
		}
		return mdEscolas;
	}
	
	
	public static void atualizar(MdEscolasBean mdEscolas) {
		
		
		String sql = " UPDATE mdEscolas SET janeiro = ?, fevereiro = ?, marco = ?, abril = ?, maio = ?, junho = ?, julho = ?, agosto = ?, setembro = ?, outubro = ?, novembro = ?, dezembro = ?, ano = ?, tipo = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
		
			stmt.setInt (1, mdEscolas.getJaneiro());
			stmt.setInt (2, mdEscolas.getFevereiro());
			stmt.setInt (3, mdEscolas.getMarco());
			stmt.setInt (4, mdEscolas.getAbril());
			stmt.setInt	(5, mdEscolas.getMaio());
			stmt.setInt	(6, mdEscolas.getJunho());
			stmt.setInt (7, mdEscolas.getJulho());
			stmt.setInt (8, mdEscolas.getAgosto());
			stmt.setInt (9, mdEscolas.getSetembro());
			stmt.setInt (10, mdEscolas.getOutubro());
			stmt.setInt (11, mdEscolas.getNovembro());
			stmt.setInt (12, mdEscolas.getDezembro());
			stmt.setString (13, mdEscolas.getAno());
			stmt.setString (14, mdEscolas.getTipo());
			stmt.setInt    (15, mdEscolas.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar mdEscolas: "+e.toString());
		}
	}
}
