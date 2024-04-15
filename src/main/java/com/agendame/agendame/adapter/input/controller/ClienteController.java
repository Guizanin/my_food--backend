package com.agendame.agendame.adapter.input.controller;

import com.agendame.agendame.domain.models.cliente.Cliente;
import com.agendame.agendame.port.input.cliente.ClienteSwagger;
import com.agendame.agendame.port.input.cliente.ClienteUseCase;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController implements ClienteSwagger {
    private final ClienteUseCase clienteUseCase;
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> searchById(Long id){
        return ResponseEntity.ok().body(this.clienteUseCase.searchById(id));
    }
}
