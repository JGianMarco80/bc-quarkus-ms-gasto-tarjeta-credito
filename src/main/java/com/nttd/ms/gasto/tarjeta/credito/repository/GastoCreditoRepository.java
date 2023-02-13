package com.nttd.ms.gasto.tarjeta.credito.repository;

import com.nttd.ms.gasto.tarjeta.credito.entity.GastoCredito;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GastoCreditoRepository implements PanacheRepository<GastoCredito> {
}
