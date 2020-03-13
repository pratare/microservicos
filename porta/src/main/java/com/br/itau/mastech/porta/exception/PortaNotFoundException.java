package com.br.itau.mastech.porta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Porta não encontrada")
public class PortaNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PortaNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
