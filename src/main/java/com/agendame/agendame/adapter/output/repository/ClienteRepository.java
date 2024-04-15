package com.agendame.agendame.adapter.output.repository;

import com.agendame.agendame.adapter.output.entity.ClienteEntity;
import com.agendame.agendame.domain.models.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    Optional<Cliente> searchById(Long id);
}
