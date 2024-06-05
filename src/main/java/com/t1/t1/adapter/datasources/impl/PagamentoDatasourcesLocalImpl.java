package com.t1.t1.adapter.datasources.impl;

import com.t1.t1.adapter.datasources.JpaPagamentoRepository;
import com.t1.t1.adapter.datasources.PagamentoDatasourcesLocal;
import com.t1.t1.adapter.models.PagamentoModel;

public class PagamentoDatasourcesLocalImpl implements PagamentoDatasourcesLocal{

    final JpaPagamentoRepository jpaPagamentoRepository;

    public PagamentoDatasourcesLocalImpl(JpaPagamentoRepository jpaPagamentoRepository) {
        this.jpaPagamentoRepository = jpaPagamentoRepository;
    }

    @Override
    public PagamentoModel save(PagamentoModel pagamentoModel) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public PagamentoModel findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
