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
import org.springframework.stereotype.Service;

@Component
public class PagamentoService {
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Autowired
	ClientCartao clientCartao;
	
	public Pagamento criarPagamento(Pagamento pagamento) {
		CartaoDTO cartaoDTO = null;
		try {
			cartaoDTO = clientCartao.buscaById(pagamento.getCartaoid());
		} catch(FeignException.BadRequest e) {
			throw new CartaoNaoExisteException();
		}
		if(!cartaoDTO.getAtivo()) {
			throw new CartaoInativoException();
		}
        pagamento.setCartaoid(cartaoDTO.getId());

		return pagamentoRepository.save(pagamento);
		 
	}

	public List<Pagamento> listPagamentoByCartaoId(Integer id) {
        return pagamentoRepository.findAllByCartaoId(id);
    }

	
}
