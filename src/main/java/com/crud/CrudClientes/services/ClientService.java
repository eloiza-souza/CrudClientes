package com.crud.CrudClientes.services;

import com.crud.CrudClientes.models.ClientModel;
import com.crud.CrudClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients(){
        List<ClientModel> clients = clientRepository.findAll();
        return clients;
    }
}
