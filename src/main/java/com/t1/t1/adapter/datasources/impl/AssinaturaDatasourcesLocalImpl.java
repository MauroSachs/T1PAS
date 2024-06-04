package com.t1.t1.adapter.datasources.impl;

import com.t1.t1.adapter.datasources.AssinaturaDatasourcesLocal;
import com.t1.t1.adapter.datasources.JpaAssinaturaRepository;
import com.t1.t1.adapter.models.AssinaturaModel;

import java.util.List;
import java.util.Optional;

public class AssinaturaDatasourcesLocalImpl implements AssinaturaDatasourcesLocal {

    final JpaAssinaturaRepository jpaAssinaturaRepository;

    public AssinaturaDatasourcesLocalImpl(JpaAssinaturaRepository jpaAssinaturaRepository) {
        this.jpaAssinaturaRepository = jpaAssinaturaRepository;
    }

    @Override
    public AssinaturaModel createAssinatura(AssinaturaModel assinaturaModel) {
        return jpaAssinaturaRepository.save(assinaturaModel);
    }

    @Override
    public void deleteAssinatura(Long id) {
        jpaAssinaturaRepository.deleteById(id);
    }

    @Override
    public AssinaturaModel getAssinatura(Long id) {
        Optional<AssinaturaModel> cliente = jpaAssinaturaRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public List<AssinaturaModel> getAssinaturas() {
        return jpaAssinaturaRepository.findAll();
    }

    @Override
    public AssinaturaModel updateAssinatura(AssinaturaModel assinaturaModel) {
        return jpaAssinaturaRepository.save(assinaturaModel);
    }

    @Override
    public List<AssinaturaModel> findByCliente(Long clienteId) {
        return jpaAssinaturaRepository.findAllByCliente_Id(clienteId);
    }

    @Override
    public List<AssinaturaModel> findByAplicativo(Long aplicativoId) {
        return jpaAssinaturaRepository.findAllByAplicativo_Id(aplicativoId);
    }


}
