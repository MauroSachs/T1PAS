package com.t1.t1.adapter.repositories;

import com.t1.t1.adapter.datasources.AssinaturaDatasourcesLocal;
import com.t1.t1.adapter.models.AssinaturaModel;
import com.t1.t1.domain.entities.AssinaturaEntity;
import com.t1.t1.domain.repositories.AssinaturaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AssinaturaRepositoryImpl implements AssinaturaRepository {

    final AssinaturaDatasourcesLocal datasourcesAssinaturaLocal;

    public AssinaturaRepositoryImpl(AssinaturaDatasourcesLocal datasourcesAssinaturaLocal) {
        this.datasourcesAssinaturaLocal = datasourcesAssinaturaLocal;
    }

    @Override
    public AssinaturaEntity createAssinatura(AssinaturaEntity assinatura) {
        AssinaturaModel assinaturaModel = new AssinaturaModel(assinatura);
        return datasourcesAssinaturaLocal.createAssinatura(assinaturaModel).toEntity();
    }

    @Override
    public AssinaturaEntity save(AssinaturaEntity assinatura) {
        AssinaturaModel assinaturaModel = new AssinaturaModel(assinatura);
        return datasourcesAssinaturaLocal.save(assinaturaModel).toEntity();
    }

    @Override
    public void deleteAssinatura(Long id) {
        datasourcesAssinaturaLocal.deleteAssinatura(id);
    }

    @Override
    public AssinaturaEntity getAssinatura(Long id) {
        return datasourcesAssinaturaLocal.getAssinatura(id).toEntity();
    }

    @Override
    public List<AssinaturaEntity> getAssinaturas() {
        return datasourcesAssinaturaLocal.getAssinaturas().stream().map(AssinaturaModel::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<AssinaturaEntity> findAllByCliente(Long clienteId) {
        return datasourcesAssinaturaLocal.findAllByAplicativo(clienteId).stream().map(AssinaturaModel::toEntity).collect(Collectors.toList());
    }

    @Override
    public AssinaturaEntity findByClienteAndAplicativo(Long clienteId, Long aplicativoId) {
        Optional<AssinaturaModel> assinaturaModel = datasourcesAssinaturaLocal.findByClienteAndAplicativo(clienteId, aplicativoId);
        return assinaturaModel.map(AssinaturaModel::toEntity).orElse(null);
    }

    @Override
    public List<AssinaturaEntity> findAllByAplicativo(Long aplicativoId) {
        return datasourcesAssinaturaLocal.findAllByAplicativo(aplicativoId).stream().map(AssinaturaModel::toEntity).collect(Collectors.toList());
    }

}