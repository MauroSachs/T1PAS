package com.t1.t1.domain.services;

import com.t1.t1.domain.entities.AplicativoEntity;
import com.t1.t1.domain.entities.AssinaturaEntity;
import com.t1.t1.domain.entities.ClienteEntity;
import com.t1.t1.domain.repositories.AssinaturaRepository;

import java.time.LocalDateTime;
import java.util.List;

public class AssinaturaService {

     final AssinaturaRepository assinaturaRepository;

        public AssinaturaService(AssinaturaRepository assinaturaRepository) {
            this.assinaturaRepository = assinaturaRepository;
        }

        public AssinaturaEntity getAssinatura(Long id) {
            return assinaturaRepository.getAssinatura(id);
        }

        public AssinaturaEntity findByClienteAndAplicativo(Long clienteId, Long aplicativoId) {
            return assinaturaRepository.findByClienteAndAplicativo(clienteId, aplicativoId);
        }

        public List<AssinaturaEntity> findAllByCliente(Long clienteId) {
            return assinaturaRepository.findAllByCliente(clienteId);
        }

        public List<AssinaturaEntity> findAllByAplicativo(Long aplicativoId) {
            return assinaturaRepository.findAllByAplicativo(aplicativoId);
        }

        public AssinaturaEntity createAssinatura(ClienteEntity cliente, AplicativoEntity aplicativo) {
            AssinaturaEntity assinatura = new AssinaturaEntity();
            assinatura.setCliente(cliente);
            assinatura.setAplicativo(aplicativo);
            assinatura.setInicioVigencia(LocalDateTime.now());
            assinatura.setFimVigencia(LocalDateTime.now().plusDays(7));
            return assinaturaRepository.createAssinatura(assinatura);
        }

        public List<AssinaturaEntity> listAssinaturas() {
            return assinaturaRepository.getAssinaturas();
        }

        public AssinaturaEntity saveAssinatura(AssinaturaEntity assinatura) {
            return assinaturaRepository.updateAssinatura(assinatura);
        }

    public List<AssinaturaEntity> listAssinaturasAtivas() {
        return assinaturaRepository.getAssinaturas().stream()
                .filter(assinatura -> assinatura.getFimVigencia().isAfter(LocalDateTime.now()))
                .toList();
    }

    public List<AssinaturaEntity> listAssinaturasCanceladas() {
        return assinaturaRepository.getAssinaturas().stream()
                .filter(assinatura -> assinatura.getFimVigencia().isBefore(LocalDateTime.now()))
                .toList();
    }

    public Boolean isValid(Long idAssinatura) {
            AssinaturaEntity assinatura = getAssinatura(idAssinatura);

            return assinatura != null && assinatura.getFimVigencia().isAfter(LocalDateTime.now());
    }

    public Boolean isValid(Long idCliente, Long idAplicativo) {
            AssinaturaEntity assinatura = findByClienteAndAplicativo(idCliente, idAplicativo);

            return assinatura != null && assinatura.getFimVigencia().isAfter(LocalDateTime.now());
    }
}
