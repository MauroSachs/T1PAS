package com.t1.t1.adapter.models;

import com.t1.t1.domain.entities.AssinaturaEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Entity
@Data
public class AssinaturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate inicioVigencia;
    private LocalDate fimVigencia;

    @OneToOne
    private AplicativoModel aplicativo;

    @OneToOne
    private ClienteModel cliente;

    @OneToMany
    private List<PagamentoModel> pagamentos;


    public AssinaturaModel() {
    }

    public AssinaturaModel(AssinaturaEntity assinatura) {
        this.id = assinatura.getId();
        this.inicioVigencia = assinatura.getInicioVigencia();
        this.fimVigencia = assinatura.getFimVigencia();
        this.aplicativo = new AplicativoModel(assinatura.getAplicativo());
        this.cliente = new ClienteModel(assinatura.getCliente());
    }

    public AssinaturaEntity toEntity() {
        return new AssinaturaEntity(this.id, this.inicioVigencia, this.fimVigencia, this.aplicativo.toEntity(), this.cliente.toEntity());
    }
}
