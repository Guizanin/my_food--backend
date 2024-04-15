package com.agendame.agendame.port.output;

import com.agendame.agendame.domain.models.cliente.Cliente;

public interface ClientePersistencePort {

    Cliente searchById(Long id);
}
