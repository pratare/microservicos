package com.itau.cliente.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Cliente {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;
	
	private String numeroCartao;

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

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
}
