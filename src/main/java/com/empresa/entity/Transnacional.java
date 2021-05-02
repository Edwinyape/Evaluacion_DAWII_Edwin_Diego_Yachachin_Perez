package com.empresa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_transnacional")
public class Transnacional {
	@Column(name = "cod_transnacional")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_transnacional;
	
	@Column(name = "raz_social_transnacional")
	private String raz_social_transnacional;
	
	@Column(name = "dir_transnacional")
	private String dir_transnacional;
	
	@Column(name = "ruc_transnacional")
	private String ruc_transnacional;
	
	@Column(name = "fec_reg_transnaacional")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fec_reg_transnaacional;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_categoria")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getCod_transnacional() {
		return cod_transnacional;
	}

	public void setCod_transnacional(int cod_transnacional) {
		this.cod_transnacional = cod_transnacional;
	}

	public String getRaz_social_transnacional() {
		return raz_social_transnacional;
	}

	public void setRaz_social_transnacional(String raz_social_transnacional) {
		this.raz_social_transnacional = raz_social_transnacional;
	}

	public String getDir_transnacional() {
		return dir_transnacional;
	}

	public void setDir_transnacional(String dir_transnacional) {
		this.dir_transnacional = dir_transnacional;
	}

	public String getRuc_transnacional() {
		return ruc_transnacional;
	}

	public void setRuc_transnacional(String ruc_transnacional) {
		this.ruc_transnacional = ruc_transnacional;
	}

	public Date getFec_reg_transnaacional() {
		return fec_reg_transnaacional;
	}

	public void setFec_reg_transnaacional(Date fec_reg_transnaacional) {
		this.fec_reg_transnaacional = fec_reg_transnaacional;
	}
	
	
}
