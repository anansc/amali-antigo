package com.projeti.amali.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AlimentosBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEntidadeExecutora() {
		return entidadeExecutora;
	}
	public void setEntidadeExecutora(String entidadeExecutora) {
		this.entidadeExecutora = entidadeExecutora;
	}
	public boolean isAgriculturaFamiliar() {
		return agriculturaFamiliar;
	}
	public void setAgriculturaFamiliar(boolean agriculturaFamiliar) {
		this.agriculturaFamiliar = agriculturaFamiliar;
	}
	public boolean isOrganico() {
		return organico;
	}
	public void setOrganico(boolean organico) {
		this.organico = organico;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getDocumentoDespesa() {
		return documentoDespesa;
	}
	public void setDocumentoDespesa(int documentoDespesa) {
		this.documentoDespesa = documentoDespesa;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public double getQtComprada() {
		return qtComprada;
	}
	public void setQtComprada(double qtComprada) {
		this.qtComprada = qtComprada;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlimentosBean other = (AlimentosBean) obj;
		return Objects.equals(id, other.id);
	}	
}
