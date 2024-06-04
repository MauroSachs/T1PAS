package com.t1.t1.adapter.models;

import com.t1.t1.domain.entities.PagamentoEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private AssinaturaModel assinatura;

    private double valorPago;
    private LocalDate dataPagamento;
    private String promocao;

    public PagamentoModel() {
    }

    public PagamentoModel(PagamentoEntity pagamentoEntity) {
        this.id = pagamentoEntity.getId();
        this.assinatura = new AssinaturaModel(pagamentoEntity.getAssinatura());
        this.valorPago = pagamentoEntity.getValorPago();
        this.dataPagamento = pagamentoEntity.getDataPagamento();
        this.promocao = pagamentoEntity.getPromocao();
    }

    public PagamentoEntity toEntity() {
        return new PagamentoEntity(this.id, this.assinatura.toEntity(), this.valorPago, this.dataPagamento, this.promocao);
    }
}
