package com.itau.pagamento.client;

import org.springframework.web.bind.annotation.GetMapping;

public interface ClientCartao {
	
	@GetMapping("/{id}")
	public CartaoDTO buscaById(Integer id);

}
