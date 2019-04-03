package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.MaquinariaGastoDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class MaquinariaGasto extends ModelBase<MaquinariaGastoDto> {

    private Double costo;
    private String estado;

    @ManyToOne
    private Maquinaria maquinaria;

    @ManyToOne
    private TipoGasto tipoGasto;

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Maquinaria getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(TipoGasto tipoGasto) {
        this.tipoGasto = tipoGasto;
    }
}
