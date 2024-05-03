package com.t1.t1.adapter.repositories;

import java.util.List;
import java.util.stream.Collectors;

import com.t1.t1.adapter.datasources.ClienteDatasourcesLocal;

import com.t1.t1.adapter.models.ClienteModel;
import com.t1.t1.domain.entities.ClienteEntity;
import com.t1.t1.domain.repositories.ClienteRepository;

public class ClienteRepositoryImpl implements ClienteRepository {

    final ClienteDatasourcesLocal datasourcesAlbumLocal;

    public ClienteRepositoryImpl(ClienteDatasourcesLocal datasourcesAlbumLocal) {

        this.datasourcesAlbumLocal = datasourcesAlbumLocal;
    }

    @Override
    public ClienteEntity createCliente(ClienteEntity cliente) {
        ClienteModel clienteModel = new ClienteModel(cliente);
        return datasourcesAlbumLocal.createCliente(clienteModel).toEntity();
    }

    @Override
    public ClienteEntity updateCliente(ClienteEntity cliente) {
        ClienteModel clienteModel = new ClienteModel(cliente);
        return datasourcesAlbumLocal.updateCliente(clienteModel).toEntity();
    }

    @Override
    public void deleteCliente(Long id) {
        datasourcesAlbumLocal.deleteCliente(id);
    }

    @Override
    public ClienteEntity getCliente(Long id) {
        return datasourcesAlbumLocal.getCliente(id).toEntity();
    }

    @Override
    public List<ClienteEntity> getClientes() {
        return datasourcesAlbumLocal.getClientes().stream().map(ClienteModel::toEntity).collect(Collectors.toList());
    }
}