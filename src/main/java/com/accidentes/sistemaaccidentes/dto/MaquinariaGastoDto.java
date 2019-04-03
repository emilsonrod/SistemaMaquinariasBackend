package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.MaquinariaGasto;

import org.modelmapper.ModelMapper;

public class MaquinariaGastoDto extends DtoBase<MaquinariaGasto> {
    private Double costo;
    private String estado;

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

    @Override
    public MaquinariaGastoDto toDto(MaquinariaGasto maquinariaGasto, ModelMapper mapper) {
        super.toDto(maquinariaGasto, mapper);
        return this;
    }
}
