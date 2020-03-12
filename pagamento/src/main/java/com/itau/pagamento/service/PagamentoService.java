package com.itau.pagamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.pagamento.models.Cartao;
import com.itau.pagamento.models.Pagamento;
import com.itau.pagamento.repository.PagamentoRepository;

@Component
public class PagamentoService {
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Autowired
	CartaoService cartaoService;
	
	public Pagamento criarPagamento(Pagamento pagamento) {
		Cartao cartao = cartaoService.buscarCartao(pagamento.getCartao().getId());
        pagamento.setCartao(cartao);

		return pagamentoRepository.save(pagamento);
		 
	}

	public List<Pagamento> listPagamentoByCartaoId(Integer id) {
        return pagamentoRepository.findAllByCartao_Id(id);
    }

	
}
