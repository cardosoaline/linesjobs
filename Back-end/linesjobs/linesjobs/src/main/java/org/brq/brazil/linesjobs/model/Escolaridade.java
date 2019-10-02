package org.brq.brazil.linesjobs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Escolaridade {
	
	@Id
	private Integer id;	
	private String nivel; //Superior técnico ou médio
	private String curso;
	private Boolean terminou;
	private Date dataDeInicio;
	private Date dataDeTermino;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Boolean getTerminou() {
		return terminou;
	}
	public void setTerminou(Boolean terminou) {
		this.terminou = terminou;
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
	
	
	
	

}
