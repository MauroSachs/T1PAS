package com.t1.t1.domain.entities;

import java.time.LocalDate;

public class PagamentoEntity {
    private long id;
    private AssinaturaEntity assinatura;
    private double valorPago;
    private LocalDate dataPagamento;
    private String promocao;

    public PagamentoEntity() {
    }

    public PagamentoEntity(long id , AssinaturaEntity assinatura, double valorPago, LocalDate dataPagamento, String promocao) {
        this.id = id;
        this.assinatura = assinatura;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.promocao = promocao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AssinaturaEntity getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaEntity assinatura) {
        this.assinatura = assinatura;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

}
