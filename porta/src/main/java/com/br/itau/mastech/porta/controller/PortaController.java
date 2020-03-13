package com.br.itau.mastech.porta.controller;


import com.br.itau.mastech.porta.dto.PortaMapper;
import com.br.itau.mastech.porta.dto.request.PortaRequest;
import com.br.itau.mastech.porta.dto.response.PortaDetalheResponse;
import com.br.itau.mastech.porta.dto.response.PortaResponse;
import com.br.itau.mastech.porta.models.Porta;
import com.br.itau.mastech.porta.service.PortaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/porta")
public class PortaController {

	@Autowired
	private PortaService portaService;

	@Autowired
	private PortaMapper portaMapper;
	
	@GetMapping("/{id}")
	public PortaDetalheResponse exibePorta(@PathVariable int id) {
		Porta portaId = portaService.buscarPorta(id);
        return portaMapper.toPortaDetalheResponse(portaId);

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PortaResponse cadastrarCliente(@RequestBody PortaRequest portaRequest) {
		Porta porta = portaMapper.toPorta(portaRequest);
		porta = portaService.cadastrar(porta);
		return portaMapper.toPortaResponse(porta);
	}
	
}
