package com.projeti.amali.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RepasseBean {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		protected Long    id;
		protected int    ano;
		protected String estado;
		protected String municipio;
		protected String esferaGoverno;
		protected String modalidadeEnsino;
		protected double valorTotalEscolas;
		
		
		public void setId(Long id) {
			this.id = id;
		}
		public Long getId() {
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
			RepasseBean other = (RepasseBean) obj;
			return Objects.equals(id, other.id);
		}	
}
