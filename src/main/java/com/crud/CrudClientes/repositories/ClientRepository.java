package com.crud.CrudClientes.repositories;

import com.crud.CrudClientes.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
