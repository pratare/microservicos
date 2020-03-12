package com.itau.pagamento.exceptions;

public class CartaoInativoException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8340929093810538994L;
	private String mensagem;
	
	public CartaoInativoException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
