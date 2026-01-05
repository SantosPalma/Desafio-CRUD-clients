package com.estudo.desafio.service;

import com.estudo.desafio.dto.ClientDTO;
import com.estudo.desafio.entities.Client;
import com.estudo.desafio.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private ClientRepository repository;


    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }


}
