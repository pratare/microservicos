package com.itau.fatura.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.fatura.dto.response.FaturaResponse;

@RestController
@RequestMapping("/fatura")
public class FaturaController {
	
	@GetMapping("/{client-id}/{cartao-id}")
	public FaturaResponse exibeFatura(@PathVariable Integer client-id, Integer cartao-id) {
		return null;
	}
	
	@PostMapping("/{cliente-id}/{cartao-id}/pagra")
	public FaturaResponse pagarFatura(@PathParam cliente-id, Integer cartao-id) {
		return null;
	}
	
}
