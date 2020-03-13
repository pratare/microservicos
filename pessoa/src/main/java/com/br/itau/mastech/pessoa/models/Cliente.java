package com.br.itau.mastech.pessoa.models;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;
	
	public Cliente() {
		
	}
	
	public Cliente(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
