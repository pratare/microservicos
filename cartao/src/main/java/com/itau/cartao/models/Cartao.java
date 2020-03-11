package com.itau.cartao.models;

import javax.persistence.*;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String numeroCartao;
	
	private boolean ativo;

	private Integer clienteId;
	
	public Cartao() {
		
	}

	public Cartao(String numeroCartao) {
		super();
		this.numeroCartao = numeroCartao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
}
