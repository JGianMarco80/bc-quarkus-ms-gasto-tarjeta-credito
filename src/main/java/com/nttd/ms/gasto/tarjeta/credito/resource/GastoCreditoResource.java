package com.nttd.ms.gasto.tarjeta.credito.resource;

import com.nttd.ms.gasto.tarjeta.credito.entity.GastoCredito;
import com.nttd.ms.gasto.tarjeta.credito.service.GastoCreditoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/gasto-tarjeta-credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GastoCreditoResource {

    @Inject
    GastoCreditoService gastoCreditoService;

    @GET
    public List<GastoCredito> findAll() {
        return gastoCreditoService.findAll();
    }

    @GET
    @Path("/{id}")
    public GastoCredito findAll(@PathParam("id") Long id) {
        return gastoCreditoService.findById(id);
    }

    @POST
    @Transactional
    public void save(GastoCredito gastoCredito){
        gastoCreditoService.save(gastoCredito);
    }
}
