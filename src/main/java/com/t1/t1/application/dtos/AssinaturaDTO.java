package com.t1.t1.application.dtos;

import com.t1.t1.domain.entities.AssinaturaEntity;

import java.time.LocalDate;

public class AssinaturaDTO {
    private Long id;
    private Long idCliente;
    private Long idAplicativo;
    private LocalDate inicioVigencia;
    private LocalDate fimVigencia;

    public AssinaturaDTO() {
    }

    public AssinaturaDTO(Long id, Long idCliente, Long idAplicativo, LocalDate inicioVigencia, LocalDate fimVigencia) {
        this.id = id;
        this.idCliente = idCliente;
        this.idAplicativo = idAplicativo;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
    }

    public Long getId() {
        return id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public Long getIdAplicativo() {
        return idAplicativo;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public LocalDate getFimVigencia() {
        return fimVigencia;
    }

    public static AssinaturaDTO fromEntity(AssinaturaEntity assinatura) {
        return new AssinaturaDTO(
                assinatura.getId(),
                assinatura.getCliente().getId(),
                assinatura.getAplicativo().getId(),
                assinatura.getInicioVigencia(),
                assinatura.getFimVigencia()
        );
    }
}

