package com.br.itau.mastech.pessoa.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClienteRequest {

    @NotBlank
    @Size(min = 3)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
