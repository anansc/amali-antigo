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

import dao.CriandoBd;

@SuppressWarnings("unused")
public class Banco {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//caso você ainda não tenha criado o banco de dados, execute o codigo a seguir.
		//Primeiro, mude o nome do usuario e senha de acordo com o utilizado no seu
		//banco. Depois, siga os passos.
	
		//Primeiro você usa o metodo criarBd para criar o banco de dados.
		/*	CriandoBd bd = new CriandoBd();
			bd.criarBd();
		*/		
				
		//Depois de criado, você modificia em ConexaoDb a url do banco de
			 /* "jdbc:mysql://localhost:3306/" 
			 * para:
			 * "jdbc:mysql://localhost:3306/projeti"
			 * 
			 * E então é só executar o metodo a seguir.
			 */
				
		/*	bd.criarTabelas();
		*/	
		
			
			
	/*		
	//	Listar repasse
		ArrayList<RepasseBean> repasses = RepasseDAO.listar();
		for(RepasseBean repasse: repasses){
			System.out.println(repasse.getValorTotalEscolas()); 
			System.out.println(repasse.getAno());
			System.out.println(repasse.getEsferaGoverno());
		}
	
	*/
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
	
	

