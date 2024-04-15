package com.agendame.agendame.domain.service;

import com.agendame.agendame.domain.models.cliente.Cliente;
import com.agendame.agendame.port.input.cliente.ClienteUseCase;
import com.agendame.agendame.port.output.ClientePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService implements ClienteUseCase {

    private final ClientePersistencePort clientePersistencePort;

    @Override
    public Cliente searchById(Long id) {
        return clientePersistencePort.searchById(id);
    }
}
