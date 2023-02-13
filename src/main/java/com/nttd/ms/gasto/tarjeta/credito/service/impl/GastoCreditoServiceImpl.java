package com.nttd.ms.gasto.tarjeta.credito.service.impl;

import com.nttd.ms.gasto.tarjeta.credito.entity.GastoCredito;
import com.nttd.ms.gasto.tarjeta.credito.repository.GastoCreditoRepository;
import com.nttd.ms.gasto.tarjeta.credito.service.GastoCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
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

    @Override
    public void savePagoCuota(String numeroCredito, Integer cuota, Double monto) {

        List<GastoCredito> gastoCreditos = this.findAll();

        for (GastoCredito gastoCredito: gastoCreditos) {

            if(gastoCredito.getNumeroCredito().equals(numeroCredito)){

                if(gastoCredito.getCuotasAPagar() != gastoCredito.getCuotasPagadas()) {

                    Double montoAPagar = gastoCredito.getMontoGastado() / gastoCredito.getCuotasAPagar();
                    Double montoPagado = montoAPagar * gastoCredito.getCuotasPagadas();

                    gastoCredito.setMontoAPagar(gastoCredito.getMontoGastado() - (montoAPagar + montoPagado));
                    gastoCredito.setCuotasPagadas(gastoCredito.getCuotasPagadas() + cuota);

                    montoAPagar = monto - montoAPagar;

                }

            }

        }

    }
}
