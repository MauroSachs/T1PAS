package com.t1.t1.domain.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AssinaturaEntity {

    private Long id;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;
    private AplicativoEntity aplicativo;
    private List<PagamentoEntity> pagamentos;
    private ClienteEntity cliente;

    public AssinaturaEntity() {
    }

    public AssinaturaEntity(Long id, LocalDateTime inicioVigencia, LocalDateTime fimVigencia, AplicativoEntity aplicativo, ClienteEntity cliente) {
        this.id = id;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.aplicativo = aplicativo;
        this.cliente = cliente;
        this.pagamentos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDateTime inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalDateTime getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(LocalDateTime fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public AplicativoEntity getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(AplicativoEntity aplicativo) {
        this.aplicativo = aplicativo;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public List<PagamentoEntity> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PagamentoEntity> pagamentos) {
        this.pagamentos = pagamentos;
    }
}