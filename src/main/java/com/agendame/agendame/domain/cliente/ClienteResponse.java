package com.agendame.agendame.domain.cliente;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","nome","cpf","email","telefone"})
public record ClienteResponse(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email
) {
}
