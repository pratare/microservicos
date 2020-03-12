package com.itau.cartao.dto;


import com.itau.cartao.dto.request.CartaoRequest;
import com.itau.cartao.dto.response.CartaoAtivoResponse;
import com.itau.cartao.dto.response.CartaoDetalheResponse;
import com.itau.cartao.dto.response.CartaoResponse;
import com.itau.cartao.models.Cartao;
import org.springframework.stereotype.Component;

@Component
public class CartaoMapper {
	
	public Cartao toCartao(CartaoRequest cartaoRequest){
		Cartao cartao = new Cartao();
		cartao.setNumeroCartao(cartaoRequest.getNumero());

        return cartao;
    }
	
	public CartaoResponse toCartaoResponse(Cartao cartao) {
		CartaoResponse cartaoResponse = new CartaoResponse();
		cartaoResponse.setId(cartao.getId());
		cartaoResponse.setNumero(cartao.getNumeroCartao());
		cartaoResponse.setAtivo(false);
        return cartaoResponse;
    }
	
	public CartaoDetalheResponse toCartaoDetalheResponse(Cartao cartao) {
		CartaoDetalheResponse cartaoDetalheResponse = new CartaoDetalheResponse();
		cartaoDetalheResponse.setId(cartao.getId());
		cartaoDetalheResponse.setNumero(cartao.getNumeroCartao());
		cartaoDetalheResponse.setAtivo(cartao.getAtivo());
        return cartaoDetalheResponse;
    }
	
	public CartaoAtivoResponse toCartaoAtivoResponse(Cartao cartao) {
        CartaoAtivoResponse cartaoAtivoResponse = new CartaoAtivoResponse();

        cartaoAtivoResponse.setId(cartao.getId());
        cartaoAtivoResponse.setNumero(cartao.getNumeroCartao());
        cartaoAtivoResponse.setAtivo(cartao.getAtivo());
        cartaoAtivoResponse.setClienteId(cartao.getClienteId());

        return cartaoAtivoResponse;
    }


}
