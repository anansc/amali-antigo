package banco;

import java.sql.SQLException;
import java.util.ArrayList;

import bean.AlunosBean;
import bean.RepasseBean;
import bean.AlimentosBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.AlunosDAO;
import dao.RepasseDAO;
import dao.AlimentosDAO;
import dao.ConexaoDB;



@SuppressWarnings("unused")
public class Banco {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//caso você ainda não tenha criado o banco de dados, execute o codigo a seguir.
		/*
		String criarBdProjeti = "CREATE DATABASE projeti";
		try {
		Connection conexao = (Connection) ConexaoDB.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(criarBdProjeti);
		stmt.execute();
		conexao.close();
		System.out.println("Foi criado o banco de dados 'projeti'.");
		}catch(Exception e) {
			System.err.println("Erro ao criar o banco de dados: "+e.toString());
		}
		
		
		//criando a tabela alimentos
		String criarTbAlimentos = "CREATE TABLE alimentos (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  ano int NOT NULL,\r\n"
				+ "  estado varchar(100) NOT NULL,\r\n"
				+ "  municipio varchar(100) NOT NULL,\r\n"
				+ "  entidadeExecutora varchar(100) NOT NULL,\r\n"
				+ "  agriculturaFamiliar tinyint(1) NOT NULL,\r\n"
				+ "  organico tinyint(1) NOT NULL,\r\n"
				+ "  nomeProduto varchar(100)  NOT NULL,\r\n"
				+ "  documentoDespesa int NOT NULL,\r\n"
				+ "  uMedida varchar(100)  NOT NULL,\r\n"
				+ "  qtComprada float NOT NULL,\r\n"
				+ "  valorUnitario float NOT NULL,\r\n"
				+ "  valorTotal float NOT NULL\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbAlimentos);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela alimentos.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela alimentos: "+e.toString());
			}
		*/
		
		
		//criando a tabela repasse
		/*
		String criarTabRepasse = "CREATE TABLE repasse (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  ano int NOT NULL,\r\n"
				+ "  estado varchar(100) NOT NULL,\r\n"
				+ "  municipio varchar(100) NOT NULL,\r\n"
				+ "  esferaGoverno varchar(100) NOT NULL,\r\n"
				+ "  modalidadeEnsino varchar(100) NOT NULL,\r\n"
				+ "  valorTotalEscolas varchar(100) NOT NULL\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTabRepasse);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela repasse.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela repasse: "+e.toString());
			}
		*/
		
		//criando a tabela alunos
		/*
		String criarTbAlunos = "CREATE TABLE alunos (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  codAlunosAtendidos int NOT NULL,\r\n"
				+ "  ano int NOT NULL,\r\n"
				+ "  estado varchar(100) NOT NULL,\r\n"
				+ "  municipio varchar(100) NOT NULL,\r\n"
				+ "  regiao varchar(100) NOT NULL,\r\n"
				+ "  esferaGoverno varchar(100)  NOT NULL,\r\n"
				+ "  etapaEnsino varchar(100)  NOT NULL,\r\n"
				+ "  qtAlunos int NOT NULL\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbAlunos);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela alunos.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela alunos: "+e.toString());
			}
		*/	
			
			
	//	Listar repasse
		ArrayList<RepasseBean> repasses = RepasseDAO.listar();
		for(RepasseBean repasse: repasses){
			System.out.println(repasse.getValorTotalEscolas()); 
			System.out.println(repasse.getAno());
			System.out.println(repasse.getEsferaGoverno());
		}
	
	
	//	Adicionar repasse
	/*	RepasseBean repasses = new RepasseBean();
		repasses.setAno(2018);
		repasses.setEstado("AP");
		repasses.setMunicipio("MACAPA");
		repasses.setEsferaGoverno("MUN");
		repasses.setModalidadeEnsino("EJA");
		repasses.setValorTotalEscolas(4);
		RepasseDAO.adicionar(repasses);
	*/
		
	//  Mostragem por ID
	/*	RepasseBean repasse = RepasseDAO.mostraRepasse(1);
		System.out.printf("Os dados sï¿½o: %s, %s, %s, %s, %s, %s.", repasse.getAno(), repasse.getEsferaGoverno(), repasse.getMunicipio(), repasse.getEsferaGoverno(), repasse.getModalidadeEnsino(), repasse.getValorTotalEscolas());
	*/	
		
	//  Atualizar repasse
	/*	RepasseBean repasses = new RepasseBean();
		repasses.setAno(2018);
		repasses.setEstado("AP");
		repasses.setMunicipio("MACAPA");
		repasses.setEsferaGoverno("MUN");
		repasses.setModalidadeEnsino("EJA");
		repasses.setValorTotalEscolas(4);
		repasses.setId(3);
		RepasseDAO.atualizar(repasses);
	*/	
		
		
	}	
}
	
	

