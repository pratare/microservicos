package com.itau.cartao.client;


import com.itau.cartao.dto.ClienteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClientCliente {

    @GetMapping("/cliente/{id}")
    ClienteDTO getClienteById(@PathVariable Integer id);

}
