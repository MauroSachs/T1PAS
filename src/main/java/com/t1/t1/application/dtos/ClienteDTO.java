package com.t1.t1.cliente.dtos;

public class ClienteDTO {
    private long id;
    private String nome;
    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}