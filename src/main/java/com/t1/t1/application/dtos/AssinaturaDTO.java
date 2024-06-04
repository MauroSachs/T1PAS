package com.t1.t1.application.dtos;

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
}

