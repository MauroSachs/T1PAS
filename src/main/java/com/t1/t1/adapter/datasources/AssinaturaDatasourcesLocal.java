package com.t1.t1.adapter.datasources;

import com.t1.t1.adapter.models.AssinaturaModel;

import java.util.List;

public interface AssinaturaDatasourcesLocal {

    AssinaturaModel createAssinatura(AssinaturaModel assinatura);
    void deleteAssinatura(Long id);
    AssinaturaModel getAssinatura(Long id);
    AssinaturaModel updateAssinatura(AssinaturaModel assinatura);
    List<AssinaturaModel> getAssinaturas();
    List<AssinaturaModel> findByCliente(Long clienteId);
    List<AssinaturaModel> findByAplicativo(Long aplicativoId);
}
