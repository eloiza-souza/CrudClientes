package com.crud.CrudClientes.services;

import com.crud.CrudClientes.dtos.ClientDTO;
import com.crud.CrudClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDTO> getAllClients(){
        return clientRepository.findAll().stream()
                .map(clientModel -> {
                    ClientDTO dto = new ClientDTO();
                    dto.setId(clientModel.getId());
                    dto.setName(clientModel.getName());
                    dto.setEmail(clientModel.getEmail());
                    dto.setPhone(clientModel.getPhone());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
