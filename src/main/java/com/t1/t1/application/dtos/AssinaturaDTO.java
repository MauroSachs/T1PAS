package com.t1.t1.application.dtos;

import com.t1.t1.domain.entities.AssinaturaEntity;

import java.time.LocalDateTime;

public class AssinaturaDTO {
    private Long id;
    private Long idCliente;
    private Long idAplicativo;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;

    public AssinaturaDTO() {
    }

    public AssinaturaDTO(Long id, Long idCliente, Long idAplicativo, LocalDateTime inicioVigencia, LocalDateTime fimVigencia) {
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

    public LocalDateTime getInicioVigencia() {
        return inicioVigencia;
    }

    public LocalDateTime getFimVigencia() {
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

