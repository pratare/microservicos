package com.itau.cartao.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente")
public interface ClientCliente {

    @GetMapping("/cliente/{id}")
    ClienteDTO getClienteById(@PathVariable Integer id);

}
