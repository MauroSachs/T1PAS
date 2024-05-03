package com.t1.t1.domain.repositories;

import com.t1.t1.domain.entities.AssinaturaEntity;

import java.util.List;

public interface AssinaturaRepository {

    public AssinaturaEntity createAssinatura(AssinaturaEntity assinatura);
    public AssinaturaEntity updateAssinatura(AssinaturaEntity assinatura);
    public void deleteAssinatura(Long id);
    public AssinaturaEntity getAssinatura(Long id);
    public List<AssinaturaEntity> getAssinaturas();
    public List<AssinaturaEntity> findByCliente(Long clienteId);
    public List<AssinaturaEntity> findByAplicativo(Long aplicativoId);
}