package com.crud.CrudClientes.services;

import ch.qos.logback.core.net.server.Client;
import com.crud.CrudClientes.models.ClientModel;

import java.util.List;

public interface ClientService {
    public List<ClientModel> getAllClients();
}
