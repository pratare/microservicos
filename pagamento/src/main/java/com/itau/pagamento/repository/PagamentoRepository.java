package com.itau.pagamento.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.itau.pagamento.models.Pagamento;

public interface PagamentoRepository extends CrudRepository<Pagamento, Integer>{


	 List<Pagamento> findAllByCartaoId(Integer cartaoId);
	 
}
