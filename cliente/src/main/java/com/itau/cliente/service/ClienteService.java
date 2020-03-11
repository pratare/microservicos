package com.itau.cliente.service;


import com.itau.cliente.exception.UserNotFoundException;
import com.itau.cliente.models.Cliente;
import com.itau.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente buscarCliente(Integer id) {
		Optional<Cliente> user = clienteRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("id - "+id);
		}
		return user.get();
	}

	public Cliente cadastrar(Cliente cliente) {

		cliente = clienteRepository.save(cliente);

        return cliente;
	}

}
