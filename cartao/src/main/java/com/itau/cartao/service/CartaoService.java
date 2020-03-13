package com.itau.cartao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itau.cartao.client.ClientCliente;
import com.itau.cartao.client.ClienteDTO;
import com.itau.cartao.client.ClienteNotFoundException;
import com.itau.cartao.exception.CartaoNotFoundException;
import com.itau.cartao.models.Cartao;
import com.itau.cartao.repository.CartaoRepository;

import feign.FeignException;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private ClientCliente clientService;


    public Cartao mostrarCartao(String numero) {
    	Optional<Cartao> cartaoOptional = cartaoRepository.getByNumeroCartao(numero);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();

    }
    
    public Cartao mostrarCartaoId(Integer id) {
    	Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();

    }
    
    public Cartao criarCartao(Cartao cartao) {
        ClienteDTO byId = null;
        
        try {
            byId = clientService.getClienteById(cartao.getClienteId());
        } catch (FeignException.BadRequest  e){
            throw new ClienteNotFoundException();
        }
        cartao.setAtivo(false);
        
        return cartaoRepository.save(cartao);
    }

    public Cartao ativar(String numero, boolean ativo) {
    	
    	Cartao cartao = mostrarCartao(numero);
        cartao.setAtivo(ativo);
    	
        return cartaoRepository.save(cartao);
    }
    
    public Cartao buscarCartao(Integer id) {
        Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }

}
