package com.t1.t1.adapter.models;

import com.t1.t1.domain.entities.ClienteEntity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;

    public ClienteModel() {
    }

    public ClienteModel(ClienteEntity Cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
    }

    public ClienteEntity toEntity() {
        return new ClienteEntity(this.id, this.nome, this.email);
    }

}
