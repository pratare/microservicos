package com.br.itau.mastech.porta.service;


import com.br.itau.mastech.porta.exception.PortaNotFoundException;
import com.br.itau.mastech.porta.models.Porta;
import com.br.itau.mastech.porta.repository.PortaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PortaService {
	
	@Autowired
	PortaRepository portaRepository;

	public Porta buscarPorta(Integer id) {
		Optional<Porta> user = portaRepository.findById(id);
		if(!user.isPresent()) {
			throw new PortaNotFoundException("id - "+id);
		}
		return user.get();
	}

	public Porta cadastrar(Porta porta) {

		porta = portaRepository.save(porta);

        return porta;
	}

}
