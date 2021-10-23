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
		
		String criarTbOrganizacoes = "CREATE TABLE organizacoes (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  userid int NOT NULL,\r\n"
				+ "  cidadeid int NOT NULL,\r\n"
				+ "  nome varchar(100) NOT NULL,\r\n"
				+ "  email varchar(100) NOT NULL,\r\n"
				+ "  cnpj varchar(100) NOT NULL,\r\n"
				+ "  celular varchar(100) NOT NULL,\r\n"
				+ "  endereco varchar(100) NOT NULL,\r\n"
				+ "  tipo varchar(100) NOT NULL,\r\n"
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
		
		String criarTbEscolas = "CREATE TABLE escolas (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  user_id bigint NOT NULL,\r\n"
				+ "  city_id bigint NOT NULL,\r\n"
				+ "  uuid uuid NOT NULL,\r\n"
				+ "  name varchar(255) NOT NULL,\r\n"
				+ "  email varchar(255) NOT NULL,\r\n"
				+ "  cnpj varchar(255) NOT NULL,\r\n"
				+ "  phone varchar(255) NOT NULL,\r\n"
				+ "  address varchar(255) NOT NULL\r\n"
				+ "  type varchar(255) NOT NULL\r\n"
				+ "  created_at timestamp NOT NULL\r\n"
				+ "  updated_at timestamp NOT NULL\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbAlunos);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela escolas.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela escolas: "+e.toString());
			}
		///////////////////////////////////////////////////////////////////a fazer
		String criarTbProducao = "CREATE TABLE producao (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  produto_id bigint NOT NULL,\r\n"
				+ "  usuario_id BIGINT NOT NULL, \r\n"
				+ "  organizacao_id bigint NOT NULL,\r\n"
				+ "  uuid uuid NOT NULL,\r\n"
				+ "  janeiro INTEGER NOT NULL,\r\n"
				+ "  fevereiro INTERGER NOT NULL,\r\n"
				+ "  marco INTERGER NOT NULL,\r\n"
				+ "  abril INTERGER NOT NULL,\r\n"
				+ "  maio INTERGER NOT NULL,\r\n"
				+ "  junho INTERGER NOT NULL,\r\n"
				+ "  julho INTERGER NOT NULL,\r\n"
				+ "  agosto INTERGER NOT NULL,\r\n"
				+ "  setembro INTERGER NOT NULL,\r\n"
				+ "  outubro INTERGER NOT NULL,\r\n"
				+ "  novembro INTERGER NOT NULL,\r\n"
				+ "  dezembro INTERGER NOT NULL,\r\n"
				+ "  ano VARCHAR(255) NOT NULL,\r\n"
				+ "  tipo VARCHAR(255) NOT NULL,\r\n"
				+ "  created_at TIMESTAMP, \r\n"
				+ "  updated_at TIMESTAMP, \r\n"
				+ "  deleted_at TIMESTAMP \r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbProducao);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela producao.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela producao: "+e.toString());
			}
		String criarTbDemandaEscola = "CREATE TABLE DemandaEscola (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL\r\n"
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
		String criarTbDemandaEscolas = "CREATE TABLE escolas (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL\r\n"
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
		String criarTbMapeamentoProdução = "CREATE TABLE escolas (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL,\r\n"
				+ "   NOT NULL\r\n"
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
