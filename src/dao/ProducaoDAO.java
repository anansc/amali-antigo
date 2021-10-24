package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.ProducaoBean;

public class ProducaoDAO {

	
public static void adicionar(ProducaoBean producao) {
		
		String sql = "INSERT INTO producao (janeiro, fevereiro, marco, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro, ano, tipo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt (1, producao.getJaneiro());
			stmt.setInt (2, producao.getFevereiro());
			stmt.setInt (3, producao.getMarco());
			stmt.setInt (4, producao.getAbril());
			stmt.setInt	(5, producao.getMaio());
			stmt.setInt	(6, producao.getJunho());
			stmt.setInt (7, producao.getJulho());
			stmt.setInt (8, producao.getAgosto());
			stmt.setInt (9, producao.getSetembro());
			stmt.setInt (10, producao.getOutubro());
			stmt.setInt (11, producao.getNovembro());
			stmt.setInt (12, producao.getDezembro());
			stmt.setString (13, producao.getAno());
			stmt.setString (14, producao.getTipo());
			stmt.setInt    (15, producao.getId());
			stmt.execute();
			conexao.close();
			
		}catch(Exception e) {
			System.err.println("Erro ao adicionar producao: "+e.toString());
		}
		
	}
	
	public static ArrayList<ProducaoBean> listar(){
		
		ArrayList<ProducaoBean> producao = new ArrayList<>();
		
		String sql = "SELECT * FROM producao";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				ProducaoBean temporario = new ProducaoBean();
				
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
				
				producao.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de producao: "+e.toString());
		}
		
		return producao;
	}
	
	public static ProducaoBean mostraProducao(int id) {
		ProducaoBean producao = null;
		
		String sql = "SELECT * FROM producao WHERE id = ?";
		
		try {
			
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				producao = new ProducaoBean();
				
				producao.setId(registro.getInt("id"));
				producao.setJaneiro (registro.getInt("janeiro"));
				producao.setFevereiro (registro.getInt("fevereiro"));
				producao.setMarco (registro.getInt("marco"));
				producao.setAbril(registro.getInt("abril"));
				producao.setMaio (registro.getInt("maio"));
				producao.setJunho (registro.getInt("junho"));
				producao.setJulho (registro.getInt("julho"));
				producao.setAgosto (registro.getInt("agosto"));
				producao.setSetembro (registro.getInt("setembro"));
				producao.setOutubro (registro.getInt("Outubro"));
				producao.setNovembro (registro.getInt("novembro"));
				producao.setAno (registro.getString("ano"));
				producao.setTipo (registro.getString("tipo"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de producao: "+e.toString());
		}
		return producao;
	}
	
	
	public static void atualizar(ProducaoBean producao) {
		
		
		String sql = " UPDATE producao SET janeiro = ?, fevereiro = ?, marco = ?, abril = ?, maio = ?, junho = ?, julho = ?, agosto = ?, setembro = ?, outubro = ?, novembro = ?, dezembro = ?, ano = ?, tipo = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
		
			stmt.setInt (1, producao.getJaneiro());
			stmt.setInt (2, producao.getFevereiro());
			stmt.setInt (3, producao.getMarco());
			stmt.setInt (4, producao.getAbril());
			stmt.setInt	(5, producao.getMaio());
			stmt.setInt	(6, producao.getJunho());
			stmt.setInt (7, producao.getJulho());
			stmt.setInt (8, producao.getAgosto());
			stmt.setInt (9, producao.getSetembro());
			stmt.setInt (10, producao.getOutubro());
			stmt.setInt (11, producao.getNovembro());
			stmt.setInt (12, producao.getDezembro());
			stmt.setString (13, producao.getAno());
			stmt.setString (14, producao.getTipo());
			stmt.setInt    (15, producao.getId());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao atualizar producao: "+e.toString());
		}
	}
}
