package com.itau.pagamento.exceptions;

public class CartaoNaoExisteException {

	/**
	 * 
	 */
	private String mensagem;
	
	private static final long serialVersionUID = 5341392302871870379L;
	
	public CartaoNaoExisteException (String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return this.mensagem;
	}

}
