package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.DetalleVentaDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVenta extends ModelBase<DetalleVentaDto> {

    @ManyToOne
    private Venta venta;

    @ManyToOne
    private Maquinaria maquinaria;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Maquinaria getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }
}
