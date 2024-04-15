package com.agendame.agendame.domain.models.cliente;

import lombok.Builder;

@Builder
public record Cliente(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email
) {
}
