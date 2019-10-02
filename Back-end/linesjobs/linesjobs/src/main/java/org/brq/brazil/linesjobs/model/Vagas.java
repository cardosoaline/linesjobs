package org.brq.brazil.linesjobs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vagas {
	
	@Id
	  private Integer id;
	  private String cargo;
	  private String descricao;
	  private String requisitos;
	  private Float salario;
	  
	  
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	  
	  

}
