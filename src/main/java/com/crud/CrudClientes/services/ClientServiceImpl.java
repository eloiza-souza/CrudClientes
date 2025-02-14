package com.crud.CrudClientes.services;

import com.crud.CrudClientes.models.ClientModel;
import com.crud.CrudClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }
}
