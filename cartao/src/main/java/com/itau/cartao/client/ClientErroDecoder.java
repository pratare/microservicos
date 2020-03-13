package com.itau.cartao.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ClientErroDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        if(response.status() == 404){
            return new ClienteNotFoundException();
        }
        return null;
    }
}
