package com.agendame.agendame.port.input.cliente;

import com.agendame.agendame.domain.models.cliente.Cliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;


public interface ClienteSwagger {
    ResponseEntity<Cliente> searchById(@PathVariable Long id) throws JsonProcessingException;
}
