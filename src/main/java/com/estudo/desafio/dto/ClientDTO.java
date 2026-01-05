package com.estudo.desafio.dto;

import com.estudo.desafio.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 100, message = "Nome precisa ter de 3 a 100 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 11, message = "CPF precisa ter no minimo 11 caracteres")
    @NotBlank(message = "Campo requerido")
    private String cpf;
    private Double income;

    @NotNull(message = "A data não pode ser nula")
    @Past(message = "A data do evento deve ser no passado")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO() {

    }
    public ClientDTO(Long id, String name, Double income, LocalDate birthDate, Integer children, String cpf) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
        this.cpf = cpf;
    }

    public ClientDTO(Client entity) {

        id = entity.getId();
        name = entity.getName();
        children = entity.getChildren();
        birthDate = entity.getBirthDate();
        income = entity.getIncome();
        cpf =  entity.getCpf();

    }
    public Long getId() {
        return id;
    }

    public Integer getChildren() {
        return children;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Double getIncome() {
        return income;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}
