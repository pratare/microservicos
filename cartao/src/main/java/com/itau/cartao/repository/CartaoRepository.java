package com.itau.cartao.repository;


import com.itau.cartao.models.Cartao;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartaoRepository extends CrudRepository<Cartao, Integer> {
	
	Optional<Cartao> getByNumeroCartao(String numero);

}
