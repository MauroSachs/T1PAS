package com.t1.t1.adapter.repositories;

import com.t1.t1.adapter.datasources.PagamentoDatasourcesLocal;
import com.t1.t1.adapter.models.PagamentoModel;
import com.t1.t1.domain.entities.PagamentoEntity;
import com.t1.t1.domain.repositories.PagamentoRepository;

public class PagamentoRepositoryImpl implements PagamentoRepository {

    final PagamentoDatasourcesLocal datasourcesPagamentoLocal;

    public PagamentoRepositoryImpl(PagamentoDatasourcesLocal datasourcesPagamentoLocal) {

        this.datasourcesPagamentoLocal = datasourcesPagamentoLocal;
    }

    @Override
    public PagamentoEntity save(PagamentoEntity pagamentoEntity) {
        PagamentoModel pagamentoModel = new PagamentoModel(pagamentoEntity);
        return datasourcesPagamentoLocal.save(pagamentoModel).toEntity();
    }

    @Override
    public PagamentoEntity findById(Long id) {
        return datasourcesPagamentoLocal.findById(id).toEntity();
    }
    
}
