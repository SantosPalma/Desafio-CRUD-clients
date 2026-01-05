package com.estudo.desafio.service;

import com.estudo.desafio.dto.ClientDTO;
import com.estudo.desafio.entities.Client;
import com.estudo.desafio.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;


    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client client = obj.get();
        return new ClientDTO(client);


    }


    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clients = repository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));


    }



    @Transactional
    public ClientDTO insert(ClientDTO dto) {

        Client entity = new Client();
        copyDtoEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);

    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {

        Client entity = repository.getReferenceById(id);
        copyDtoEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);

    }





    private void copyDtoEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());

    }
}
