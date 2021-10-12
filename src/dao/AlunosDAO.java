package dao;

import bean.AlunosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AlunosDAO {

	public static void adicionar(AlunosBean alunos) {
		
		String sql = "INSERT INTO alunos (codAlunosAtendidos, ano, estado, municipio, regiao, esferaGoverno, etapaEnsino, qtAlunos) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Connection conexao = ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt    (1, alunos.getCodAlunosAtendidos());
			stmt.setInt    (2, alunos.getAno());
			stmt.setString (3, alunos.getEstado());
			stmt.setString (4, alunos.getMunicipio());
			stmt.setString (5, alunos.getRegiao());
			stmt.setString (6, alunos.getEsferaGoverno());
			stmt.setString (7, alunos.getEtapaEnsino());
			stmt.setInt    (8, alunos.getQtAlunos());
			stmt.execute();
			conexao.close();
		
		}catch(Exception e) {
			System.err.println("Erro ao adicionar alunos: "+e.toString());
		}		
	}
	
	public static ArrayList<AlunosBean> listar(){
		
		ArrayList<AlunosBean> alunos = new ArrayList<>();
		
		String sql = "SELECT * FROM alunos";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet dados = stmt.executeQuery();
			
			while(dados.next()) {
				AlunosBean temporario = new AlunosBean();
				
				temporario.setId(dados.getInt("id"));
				temporario.setCodAlunosAtendidos (dados.getInt("codAlunosAtendidos"));
				temporario.setAno (dados.getInt("ano"));
				temporario.setEstado (dados.getString("estado"));
				temporario.setMunicipio (dados.getString("municipio"));
				temporario.setRegiao(dados.getString("região"));
				temporario.setEsferaGoverno (dados.getString("esferaGoverno"));
				temporario.setEtapaEnsino (dados.getString("etapaEnsino"));
				
				alunos.add(temporario);
			}
		}catch(Exception e) {
			System.err.println("Erro no listar de alunos: "+e.toString());
		}
		
		return alunos;
	}
	
	public static AlunosBean mostraAlunos(int id) {
		AlunosBean alunos = null;
		
		String sql = "SELECT * FROM alunos WHERE id = ?";
		
		try {
			
			Connection conexao = ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet registro = stmt.executeQuery();
			
			while (registro.next()) {
				alunos = new AlunosBean();
				
				alunos.setId(registro.getInt("id"));
				alunos.setCodAlunosAtendidos(registro.getInt("codAlunosAtendidos"));
				alunos.setAno(registro.getInt("ano"));
				alunos.setEstado(registro.getString("estado"));
				alunos.setMunicipio(registro.getString("municipio"));
				alunos.setRegiao(registro.getString("regiao"));
				alunos.setEsferaGoverno(registro.getString("esferaGoverno"));
				alunos.setEtapaEnsino(registro.getString("etapaEnsino"));
				alunos.setQtAlunos(registro.getInt("qtAlunos"));
			}
			
		}catch(Exception e) {
			System.err.println("Erro na consulta de alunos: "+e.toString());
		}
		
		return alunos;
	}
	
	
	
	public static void atualizar(AlunosBean alunos) {
		
		String sql = " UPDATE alunos SET codAlunosAtendidos = ?, ano = ?, estado = ?, municipio = ?, regiao = ?, esferaGoverno = ?, etapaEnsino = ?, qtAlunos = ? WHERE id = ?";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt	  (1, alunos.getCodAlunosAtendidos());
			stmt.setInt	  (2, alunos.getAno());
			stmt.setString(3, alunos.getEstado());
			stmt.setString(4, alunos.getMunicipio());
			stmt.setString(5, alunos.getRegiao());
			stmt.setString(6, alunos.getEsferaGoverno());
			stmt.setString(7, alunos.getEtapaEnsino());
			stmt.setInt   (8, alunos.getQtAlunos());
			
			int rowsUpdated = stmt.executeUpdate();
			
			if(rowsUpdated >0) {
				System.out.println(rowsUpdated+" Linhas foram alteradas com sucesso!");
			}
			
		}catch(Exception e) {
			System.err.println("Erro ao Editar alunos: "+e.toString());
		}
	}
	
}
