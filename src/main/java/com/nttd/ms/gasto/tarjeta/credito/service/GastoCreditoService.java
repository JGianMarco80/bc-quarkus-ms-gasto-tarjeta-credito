package com.nttd.ms.gasto.tarjeta.credito.service;

import com.nttd.ms.gasto.tarjeta.credito.entity.GastoCredito;

import java.util.List;

public interface GastoCreditoService {

    List<GastoCredito> findAll();

    GastoCredito findById(Long id);

    void save(GastoCredito gastoCredito);

}