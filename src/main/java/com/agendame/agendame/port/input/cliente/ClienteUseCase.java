package com.agendame.agendame.port.input.cliente;

import com.agendame.agendame.domain.models.cliente.Cliente;

public interface ClienteUseCase {
    Cliente searchById(Long id);
}
