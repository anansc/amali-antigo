package bean;

public class RepasseBean {
	
	protected int    id;
	protected int    ano;
	protected String estado;
	protected String municipio;
	protected String esferaGoverno;
	protected String modalidadeEnsino;
	protected double valorTotalEscolas;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
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
	
	public void setEsferaGoverno(String esfera_governo) {
		this.esferaGoverno = esfera_governo;
	}
	public String getEsferaGoverno() {
		return esferaGoverno;
	}
	public void setModalidadeEnsino(String modalidade_ensino) {
		this.modalidadeEnsino = modalidade_ensino;
	}
	public String getModalidadeEnsino() {
		return modalidadeEnsino;
	}
	public void setValorTotalEscolas(double valor_total_escolas) {
		this.valorTotalEscolas = valor_total_escolas;
	}
	public double getValorTotalEscolas() {
		return valorTotalEscolas;
	}
	
	public RepasseBean() {};
	
}
