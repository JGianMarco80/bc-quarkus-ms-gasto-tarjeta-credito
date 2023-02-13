package com.nttd.ms.gasto.tarjeta.credito.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "g_credito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GastoCredito {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_credito")
    private String numeroCredito;

    @Column(name = "cuotas_a_pagar")
    private Integer cuotasAPagar;

    @Column(name = "cuotas_pagadas")
    private Integer cuotasPagadas;

    @Column(name = "monto_gastado")
    private Double montoGastado;

    @Column(name = "monto_a_pagar")
    private Double montoAPagar;

    @Column(name = "fecha")
    private LocalDate fecha;
}
