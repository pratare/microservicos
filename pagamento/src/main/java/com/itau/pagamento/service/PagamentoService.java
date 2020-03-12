package com.itau.pagamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.pagamento.client.CartaoDTO;
import com.itau.pagamento.client.ClientCartao;
import com.itau.pagamento.exceptions.CartaoInativoException;
import com.itau.pagamento.exceptions.CartaoNaoExisteException;
import com.itau.pagamento.models.Pagamento;
import com.itau.pagamento.repository.PagamentoRepository;

import feign.FeignException;
import feign.FeignException.FeignClientException;

@Component
public class PagamentoService {
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Autowired
	ClientCartao cartaoService;
	
	public Pagamento criarPagamento(Pagamento pagamento) {
		CartaoDTO cartaoDTO = null;
		try {
			cartaoDTO = cartaoService.buscaById(pagamento.getCartaoid());
		} catch(FeignException.BadRequest e) {
			throw new CartaoNaoExisteException("Escolha um cartão existente");
		}
		if(!cartaoDTO.getAtivo()) {
			throw new CartaoInativoException("Favor escolher um cartão ativo");
		}
        pagamento.setCartaoid(cartaoDTO.getId());

		return pagamentoRepository.save(pagamento);
		 
	}

	public List<Pagamento> listPagamentoByCartaoId(Integer id) {
        return pagamentoRepository.findAllByCartao_Id(id);
    }

	
}
