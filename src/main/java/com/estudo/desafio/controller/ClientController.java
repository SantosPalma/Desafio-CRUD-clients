package com.estudo.desafio.controller;

import com.estudo.desafio.dto.ClientDTO;
import com.estudo.desafio.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {


    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
     ClientDTO clientDTO = service.findById(id);
     return clientDTO;

    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable  pageable ) {
        return service.findAll(pageable);

    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto) {
        return service.insert(dto);
        //URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
       // return ResponseEntity.created(uri).body(dto);

    }
}
