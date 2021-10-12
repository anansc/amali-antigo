package bean;

public class AlimentosBean {
	
	
	protected int id;
	protected int ano;
	protected String estado;
	protected String municipio;
	protected String entidadeExecutora;
	protected boolean agriculturaFamiliar;
	protected boolean organico;
	protected String nomeProduto;
	protected int documentoDespesa;
	protected String unidadeMedida;
	protected double qtComprada;
	protected double valorUnitario;
	protected double valorTotal;
	
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
	public void setEntidadeExecutora(String entidade_executora) {
		this.entidadeExecutora = entidade_executora;
	}
	public String getEntidadeExecutora() {
		return entidadeExecutora;
	}
	public void setOrganico(boolean organico) {
		this.organico = organico;
	}
	public boolean getOrganico() {
		return organico;
	}
	public void setAgriculturaFamiliar(boolean agricultura_familiar) {
		this.agriculturaFamiliar = agricultura_familiar;
	}
	public boolean getAgriculturaFamiliar() {
		return agriculturaFamiliar;
	}
	public void setNomeProduto(String nome_produto) {
		this.nomeProduto = nome_produto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setDocumentoDespesa(int documento_despesa) {
		this.documentoDespesa = documento_despesa;
	}
	public int getDocumentoDespesa() {
		return documentoDespesa;
	}
	public void setUnidadeMedida(String unidade_medida) {
		this.unidadeMedida = unidade_medida;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setQtComprada(double qt_comprada) {
		this.qtComprada = qt_comprada;
	}
	public double getQtComprada() {
		return qtComprada;
	}
	public void setValorUnitario(double valor_unitario) {
		this.valorUnitario = valor_unitario;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorTotal(double valor_total) {
		this.valorTotal = valor_total;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	
	public AlimentosBean() {};
}
