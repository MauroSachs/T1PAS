package com.t1.t1.application.usecases.assinaturas;

import com.t1.t1.application.dtos.AssinaturaDTO;
import com.t1.t1.application.dtos.AssinaturaTipoRequestDTO;
import com.t1.t1.domain.services.AssinaturaService;

import java.util.List;

public class ListarAssinaturasUseCase {

    final AssinaturaService assinaturaService;

    public ListarAssinaturasUseCase(AssinaturaService assinaturaService) {
        this.assinaturaService = assinaturaService;
    }

    public List<AssinaturaDTO> call(AssinaturaTipoRequestDTO tipo) {
        switch (tipo) {
            case TODAS:
                return assinaturaService.listAssinaturas().stream()
                        .map(assinaturaEntity -> new AssinaturaDTO(assinaturaEntity.getId(), assinaturaEntity.getCliente().getId(), assinaturaEntity.getAplicativo().getId(), assinaturaEntity.getInicioVigencia(), assinaturaEntity.getFimVigencia()))
                        .toList();
            case ATIVAS:
                return assinaturaService.listAssinaturasAtivas().stream()
                        .map(assinaturaEntity -> new AssinaturaDTO(assinaturaEntity.getId(), assinaturaEntity.getCliente().getId(), assinaturaEntity.getAplicativo().getId(), assinaturaEntity.getInicioVigencia(), assinaturaEntity.getFimVigencia()))
                        .toList();
            case CANCELADAS:
                return assinaturaService.listAssinaturasCanceladas().stream()
                        .map(assinaturaEntity -> new AssinaturaDTO(assinaturaEntity.getId(), assinaturaEntity.getCliente().getId(), assinaturaEntity.getAplicativo().getId(), assinaturaEntity.getInicioVigencia(), assinaturaEntity.getFimVigencia()))
                        .toList();
            default:
                throw new IllegalArgumentException("Tipo de assinatura inválido");
        }
    }
}
