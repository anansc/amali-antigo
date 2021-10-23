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
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbAlimentos = "CREATE TABLE alimentos (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  ano int NOT NULL,\r\n"
				+ "  estado varchar(100) NOT NULL,\r\n"
				+ "  municipio varchar(100) NOT NULL,\r\n"
				+ "  entidadeExecutora varchar(100) NOT NULL,\r\n"
				+ "  agriculturaFamiliar varchar(100) NOT NULL,\r\n"
				+ "  organico varchar(100) NOT NULL,\r\n"
				+ "  nomeProduto varchar(100)  NOT NULL,\r\n"
				+ "  documentoDespesa varchar(100) NOT NULL,\r\n"
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
		//////////////////////////////////////////////////////////////////////////////////////////////
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
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbEscolas = "CREATE TABLE escolas (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  usuario_id bigint,\r\n"
				+ "  cidade_id bigint,\r\n"
				+ "  uuid uuid,\r\n"
				+ "  nome varchar(255) NOT NULL,\r\n"
				+ "  email varchar(255) NOT NULL,\r\n"
				+ "  cnpj varchar(255) NOT NULL,\r\n"
				+ "  telefone varchar(255) NOT NULL,\r\n"
				+ "  endereco varchar(255) NOT NULL\r\n"
				+ "  tipo varchar(255) NOT NULL\r\n"
				+ "  created_at timestamp NOT NULL\r\n"
				+ "  updated_at timestamp NOT NULL\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbEscolas);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela escolas.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela escolas: "+e.toString());
			}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbMDEscolas = "CREATE TABLE MapeamentoDemandasEscolas (\r\n"
				+ "  id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  produto_id BIGINT NOT NULL,\r\n"
				+ "  usuario_id BIGINT NOT NULL,\r\n"
				+ "  instituicao_id BIGINT NOT NULL,\r\n"
				+ "  uuid UUID NOT NULL,\r\n"
				+ "  janeiro INTERGER NOT NULL,\r\n"
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
				+ "  ano varchar(100) NOT NULL,\r\n"
				+ "  tipo varchar(100) NOT NULL,\r\n"
				+ "  created_at TIMESTAMP, \r\n"
				+ "  updated_at TIMESTAMP \r\n"
				+ "  deleted_at TIMESTAMP \r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
				
		try {
				Connection conexao = (Connection) ConexaoDB.getConnection();
				PreparedStatement stmt = conexao.prepareStatement(criarTbMDEscolas);
				stmt.execute();
				conexao.close();
					System.out.println("Foi criada a tabela MDEscolas.");
				}catch(Exception e) {
					System.err.println("Erro ao criar a tabela MDEscolas: "+e.toString());
				}
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbProducao = "CREATE TABLE producao (\r\n"
				+ "  id bigint AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  produto_id bigint,\r\n"
				+ "  usuario_id BIGINT, \r\n"
				+ "  organizacao_id bigint,\r\n"
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
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbProdutos = "CREATE TABLE produtos (\r\n"
				+ "  id int AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  categoria_id BIGINT, \r\n"
				+ "  uuid UUID ,\r\n"
				+ "  nome varchar(100) NOT NULL,\r\n"
				+ "  unidade varchar(100) NOT NULL,\r\n"
				+ "  created_at TIMESTAMP,\r\n"
				+ "  updated_at TIMESTAMP,\r\n"
				+ "  deleted_at TIMESTAMP\r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbProdutos);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela produtos.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela produtos: "+e.toString());
			}
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		String criarTbOrganizacoes = "CREATE TABLE organizacoes (\r\n"
				+ "  id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,\r\n"
				+ "  usuario_id BIGINT,\r\n"
				+ "  cidade_id BIGINT,\r\n"
				+ "  uuid UUID NOT NULL,\r\n"
				+ "  nome varchar(100) NOT NULL,\r\n"
				+ "  email varchar(100) NOT NULL,\r\n"
				+ "  cnpj varchar(100) NOT NULL,\r\n"
				+ "  telefone varchar(100) NOT NULL,\r\n"
				+ "  endereco varchar(100) NOT NULL,\r\n"
				+ "  tipo varchar(100) NOT NULL,\r\n"
				+ "  created_at TIMESTAMP, \r\n"
				+ "  updated_at TIMESTAMP \r\n"
				+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
		
		try {
			Connection conexao = (Connection) ConexaoDB.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(criarTbOrganizacoes);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela organizaçoes.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela organizações: "+e.toString());
			}
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		String criarTbRepasse = "CREATE TABLE repasse (\r\n"
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
			PreparedStatement stmt = conexao.prepareStatement(criarTbRepasse);
			stmt.execute();
			conexao.close();
			System.out.println("Foi criada a tabela repasse.");
			}catch(Exception e) {
				System.err.println("Erro ao criar a tabela repasse: "+e.toString());
			}
		
		
		
		

	}
}
