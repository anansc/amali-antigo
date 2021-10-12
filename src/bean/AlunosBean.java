package bean;

public class AlunosBean {
	
	protected int id;
	protected int codAlunosAtendidos;
	protected int ano;
	protected String estado;
	protected String municipio;
	protected String regiao;
	protected String esferaGoverno;
	protected String etapaEnsino;
	protected int qtAlunos;
	
	public AlunosBean() {};
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setCodAlunosAtendidos(int cod_alunos_atendidos) {
		this.codAlunosAtendidos = cod_alunos_atendidos;
	}
	public int getCodAlunosAtendidos() {
		return codAlunosAtendidos;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setEsferaGoverno(String esfera_governo) {
		this.esferaGoverno = esfera_governo;
	}
	public String getEsferaGoverno() {
		return esferaGoverno;
	}
	public void setEtapaEnsino(String etapa_ensino) {
		this.etapaEnsino = etapa_ensino;
	}
	public String getEtapaEnsino() {
		return etapaEnsino;
	}
	public void setQtAlunos(int qt_alunos) {
		this.qtAlunos = qt_alunos;
	}
	public int getQtAlunos() {
		return qtAlunos;
	}
	
}
