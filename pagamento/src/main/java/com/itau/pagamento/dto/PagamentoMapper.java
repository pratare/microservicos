package com.itau.pagamento.dto;

import org.springframework.stereotype.Component;

import com.itau.pagamento.dto.request.PagamentoRequest;
import com.itau.pagamento.dto.response.PagamentoResponse;
import com.itau.pagamento.dto.response.PagamentoSummaryInListResponse;
import com.itau.pagamento.models.Pagamento;

@Component
public class PagamentoMapper {
	
	public Pagamento toPagamento(PagamentoRequest pagamentoRequest) {
		Pagamento pagamento = new Pagamento();
		pagamento.setDescricao(pagamentoRequest.getDescricao());
		pagamento.setValor(pagamentoRequest.getValor());
		pagamento.setCartaoid(pagamentoRequest.getCartaoId());
		
		return pagamento;
	}

	public PagamentoResponse toPagamentoResponse(Pagamento pagamento) {
		PagamentoResponse pagamentoResponse = new PagamentoResponse();
		
		pagamentoResponse.setCartaoid(pagamento.getCartaoid());
		pagamentoResponse.setDescricao(pagamento.getDescricao());
		pagamentoResponse.setValor(pagamento.getValor());
		pagamentoResponse.setId(pagamento.getId());
		
		return pagamentoResponse;
		
	}
	
	public PagamentoSummaryInListResponse toPagamentoSummaryInListResponse(Pagamento pagamento) {
        PagamentoSummaryInListResponse pagamentoSummaryInListResponse = new PagamentoSummaryInListResponse();
        pagamentoSummaryInListResponse.setId(pagamento.getId());
        pagamentoSummaryInListResponse.setDescricao(pagamento.getDescricao());
        pagamentoSummaryInListResponse.setValor(pagamento.getValor());
        pagamentoSummaryInListResponse.setCartaoId(pagamento.getCartaoid());

        return pagamentoSummaryInListResponse;
    }

	
}
