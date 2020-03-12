package com.itau.cartao.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClientCliente {

    @GetMapping("/cliente/{id}")
    ClienteDTO getClienteById(@PathVariable Integer id);

}
