package com.br.itau.mastech.pessoa.controller;


import com.br.itau.mastech.pessoa.dto.ClienteMapper;
import com.br.itau.mastech.pessoa.dto.request.ClienteRequest;
import com.br.itau.mastech.pessoa.dto.response.ClienteDetalheResponse;
import com.br.itau.mastech.pessoa.dto.response.ClienteResponse;
import com.br.itau.mastech.pessoa.models.Cliente;
import com.br.itau.mastech.pessoa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ClienteMapper clienteMapper;
	
	@GetMapping("/{id}")
	public ClienteDetalheResponse exibeCliente(@PathVariable int id) {
		Cliente clienteId = clienteService.buscarCliente(id);
        return clienteMapper.toClienteDetalheResponse(clienteId);

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteResponse cadastrarCliente(@RequestBody ClienteRequest clienteRequest) {
		Cliente cliente = clienteMapper.toCliente(clienteRequest);
		cliente = clienteService.cadastrar(cliente);
		return clienteMapper.toClienteResponse(cliente);
	}
	
}
