package com.itau.cliente.repository;

import com.itau.cliente.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
