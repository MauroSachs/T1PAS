package com.t1.t1.application.usecases.aplicativo;

import com.t1.t1.application.dtos.AplicativoDTO;
import com.t1.t1.application.dtos.AplicativoRequestDTO;
import com.t1.t1.domain.entities.AplicativoEntity;
import com.t1.t1.domain.services.AplicativoService;

public class CreateAplicativoUseCase {

    final AplicativoService aplicativoService;

    public CreateAplicativoUseCase(AplicativoService aplicativoService) {
        this.aplicativoService = aplicativoService;
    }

    public AplicativoDTO call(AplicativoRequestDTO aplicativo) {
        if (aplicativo.nome() == null || aplicativo.custoMensal() == null) {
            throw new IllegalArgumentException("Nome and custoMensal cannot be null");
        }

        AplicativoEntity aplicativoEntity = new AplicativoEntity();
        aplicativoEntity.setNome(aplicativo.nome());
        aplicativoEntity.setCustoMensal(aplicativo.custoMensal());

        aplicativoEntity = aplicativoService.createAplicativo(aplicativoEntity);
        return new AplicativoDTO(aplicativoEntity.getId(), aplicativoEntity.getNome(), aplicativoEntity.getCustoMensal());
    }
}
