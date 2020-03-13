package com.itau.cartao.controller;


import com.itau.cartao.dto.CartaoMapper;
import com.itau.cartao.dto.request.CartaoAtivoRequest;
import com.itau.cartao.dto.request.CartaoRequest;
import com.itau.cartao.dto.response.CartaoAtivoResponse;
import com.itau.cartao.dto.response.CartaoDetalheResponse;
import com.itau.cartao.dto.response.CartaoResponse;
import com.itau.cartao.models.Cartao;
import com.itau.cartao.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

	@Autowired
	private CartaoService cartaoService;
	
	@Autowired
	private CartaoMapper cartaoMapper;
	
	@GetMapping("/{numero}")
	public CartaoDetalheResponse exibeCartao(@PathVariable String numero) {
        Cartao cartao = cartaoService.mostrarCartao(numero);
        return cartaoMapper.toCartaoDetalheResponse(cartao);

	}
	
	@GetMapping("/cartoes/{id}")
	public CartaoDetalheResponse exibeCartaoId(@PathVariable Integer id) {
        Cartao cartao = cartaoService.mostrarCartaoId(id);
        return cartaoMapper.toCartaoDetalheResponse(cartao);

	}

	@PostMapping
	public CartaoResponse cadastrarNovoCartao(@Valid @RequestBody CartaoRequest cartaoRequest){
		Cartao cartao = cartaoMapper.toCartao(cartaoRequest);
		cartao = cartaoService.criarCartao(cartao);
		return cartaoMapper.toCartaoResponse(cartao);
	}
	
	@PatchMapping("/{numero}")
    public CartaoAtivoResponse ativarCartao(@PathVariable String numero, @Valid  @RequestBody CartaoAtivoRequest cartaoAtivoRequest) {
        Cartao cartao = cartaoService.ativar(numero, cartaoAtivoRequest.getAtivo());
        return cartaoMapper.toCartaoAtivoResponse(cartao);
    }


}
