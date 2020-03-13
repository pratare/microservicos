package com.br.itau.mastech.pessoa.repository;

import com.br.itau.mastech.pessoa.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
