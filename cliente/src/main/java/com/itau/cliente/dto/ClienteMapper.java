package com.itau.cliente.dto;


import com.itau.cliente.dto.request.ClienteRequest;
import com.itau.cliente.dto.response.ClienteDetalheResponse;
import com.itau.cliente.dto.response.ClienteResponse;
import com.itau.cliente.models.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toCliente(ClienteRequest clienteRequest){
        Cliente cliente = new Cliente();
        cliente.setName(clienteRequest.getName());
        return cliente;
    }

    public ClienteResponse toClienteResponse(Cliente cliente) {
    	ClienteResponse clienteResponse = new ClienteResponse();
        clienteResponse.setId(cliente.getId());
        clienteResponse.setName(cliente.getName());
        return clienteResponse;
    }

    public ClienteDetalheResponse toClienteDetalheResponse(Cliente cliente) {
    	ClienteDetalheResponse clienteDetalheResponse = new ClienteDetalheResponse();
    	clienteDetalheResponse.setId(cliente.getId());
    	clienteDetalheResponse.setName(cliente.getName());
        return clienteDetalheResponse;
    }



}
