package com.projeti.amali.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DemandaEscolasBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected int janeiro;
	protected int fevereiro;
	protected int marco;
	protected int abril;
	protected int maio;
	protected int junho;
	protected int julho;
	protected int agosto;
	protected int setembro;
	protected int outubro;
	protected int novembro;
	protected int dezembro;
	protected String ano;
	protected String tipo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getJaneiro() {
		return janeiro;
	}
	public void setJaneiro(int janeiro) {
		this.janeiro = janeiro;
	}
	public int getFevereiro() {
		return fevereiro;
	}
	public void setFevereiro(int fevereiro) {
		this.fevereiro = fevereiro;
	}
	public int getMarco() {
		return marco;
	}
	public void setMarco(int marco) {
		this.marco = marco;
	}
	public int getAbril() {
		return abril;
	}
	public void setAbril(int abril) {
		this.abril = abril;
	}
	public int getMaio() {
		return maio;
	}
	public void setMaio(int maio) {
		this.maio = maio;
	}
	public int getJunho() {
		return junho;
	}
	public void setJunho(int junho) {
		this.junho = junho;
	}
	public int getJulho() {
		return julho;
	}
	public void setJulho(int julho) {
		this.julho = julho;
	}
	public int getAgosto() {
		return agosto;
	}
	public void setAgosto(int agosto) {
		this.agosto = agosto;
	}
	public int getSetembro() {
		return setembro;
	}
	public void setSetembro(int setembro) {
		this.setembro = setembro;
	}
	public int getOutubro() {
		return outubro;
	}
	public void setOutubro(int outubro) {
		this.outubro = outubro;
	}
	public int getNovembro() {
		return novembro;
	}
	public void setNovembro(int novembro) {
		this.novembro = novembro;
	}
	public int getDezembro() {
		return dezembro;
	}
	public void setDezembro(int dezembro) {
		this.dezembro = dezembro;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		DemandaEscolasBean other = (DemandaEscolasBean) obj;
		return Objects.equals(id, other.id);
	}
	
}
