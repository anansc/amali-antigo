package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.ConexaoDB;

import java.sql.SQLException;

@SuppressWarnings("unused")
public class CriandoBd {

	public void criarBd() throws SQLException{
		
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
	}
	
	public void criarTabelas() throws SQLException{
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
	}
}
