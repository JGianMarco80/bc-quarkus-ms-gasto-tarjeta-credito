package com.nttd.ms.gasto.tarjeta.credito.service.impl;

import com.nttd.ms.gasto.tarjeta.credito.entity.GastoCredito;
import com.nttd.ms.gasto.tarjeta.credito.repository.GastoCreditoRepository;
import com.nttd.ms.gasto.tarjeta.credito.service.GastoCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GastoCreditoServiceImpl implements GastoCreditoService {

    @Inject
    GastoCreditoRepository gastoCreditoRepository;

    @Override
    public List<GastoCredito> findAll() {
        return gastoCreditoRepository.listAll();
    }

    @Override
    public GastoCredito findById(Long id) {
        return gastoCreditoRepository.findById(id);
    }

    @Override
    public void save(GastoCredito gastoCredito) {
        gastoCreditoRepository.persist(gastoCredito);
    }
}
