package com.br.itau.mastech.porta.models;

import javax.persistence.*;

@Entity
@Table
public class Porta {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String andar;

	@Column
	private String sala;

	public Porta() {
		
	}

	public Porta(String andar, String sala) {
		this.andar = andar;
		this.sala = sala;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
}
