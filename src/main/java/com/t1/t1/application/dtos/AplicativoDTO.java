package com.t1.t1.application.dtos;

public class AplicativoDTO {
    private long id;
    private String nome;
    private Double custoMensal;

    public AplicativoDTO() {
    }

    public AplicativoDTO(long id, String nome, Double custoMensal) {
        this.id = id;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getCustoMensal() {
        return custoMensal;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCustoMensal(Double custoMensal) {
        this.custoMensal = custoMensal;
    }
}