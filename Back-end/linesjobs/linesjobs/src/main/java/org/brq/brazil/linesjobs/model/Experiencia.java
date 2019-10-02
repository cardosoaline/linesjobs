package org.brq.brazil.linesjobs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Experiencia {
	
	@Id
	private Integer id;
	private String cargo;
	private Boolean empregoAtual;
	private Date dataDeInicio;
	private Date dataDeTermino;
	private String descricao;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Boolean getEmpregoAtual() {
		return empregoAtual;
	}
	public void setEmpregoAtual(Boolean empregoAtual) {
		this.empregoAtual = empregoAtual;
	}
	public Date getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public Date getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataDeTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	

}
