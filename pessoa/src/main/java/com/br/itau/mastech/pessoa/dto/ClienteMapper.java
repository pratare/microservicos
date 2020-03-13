package com.br.itau.mastech.pessoa.dto;


import com.br.itau.mastech.pessoa.dto.request.ClienteRequest;
import com.br.itau.mastech.pessoa.dto.response.ClienteDetalheResponse;
import com.br.itau.mastech.pessoa.dto.response.ClienteResponse;
import com.br.itau.mastech.pessoa.models.Cliente;
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
