package com.crud.CrudClientes.services;

import com.crud.CrudClientes.dtos.ClientDTO;

import java.util.List;

public interface ClientService {
    public List<ClientDTO> getAllClients();
}
