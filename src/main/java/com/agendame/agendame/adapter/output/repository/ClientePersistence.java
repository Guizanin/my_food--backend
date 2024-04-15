package com.agendame.agendame.adapter.output.repository;

import com.agendame.agendame.domain.models.cliente.Cliente;
import com.agendame.agendame.port.output.ClientePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientePersistence implements ClientePersistencePort {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente searchById(Long id) {
        var finded = this.clienteRepository.searchById(id);

        return finded.orElse(null);
    }
}
