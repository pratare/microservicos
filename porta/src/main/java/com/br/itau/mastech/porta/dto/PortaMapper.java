package com.br.itau.mastech.porta.dto;


import com.br.itau.mastech.porta.dto.request.PortaRequest;
import com.br.itau.mastech.porta.dto.response.PortaDetalheResponse;
import com.br.itau.mastech.porta.dto.response.PortaResponse;
import com.br.itau.mastech.porta.models.Porta;
import org.springframework.stereotype.Component;

@Component
public class PortaMapper {

    public Porta toPorta(PortaRequest portaRequest){
        Porta porta = new Porta();
//        porta.setName(portaRequest.getName());
        return porta;
    }

    public PortaResponse toPortaResponse(Porta porta) {
    	PortaResponse portaResponse = new PortaResponse();
//        portaResponse.setId(cliente.getId());
//        portaResponse.setName(cliente.getName());
        return portaResponse;
    }

    public PortaDetalheResponse toPortaDetalheResponse(Porta porta) {
        PortaDetalheResponse portaDetalheResponse = new PortaDetalheResponse();
//        portaDetalheResponse.setId(cliente.getId());
//        portaDetalheResponse.setName(cliente.getName());
        return portaDetalheResponse;
    }



}
