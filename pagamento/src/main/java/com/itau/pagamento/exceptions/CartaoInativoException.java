package com.itau.pagamento.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "Favor escolher um cartão ativo")
public class CartaoInativoException extends RuntimeException {

}
