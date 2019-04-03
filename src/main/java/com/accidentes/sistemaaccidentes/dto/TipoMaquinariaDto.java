package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.TipoMaquinaria;
import org.modelmapper.ModelMapper;

public class TipoMaquinariaDto extends DtoBase<TipoMaquinaria> {

    private String nombreTipoMaquinaria;
    private String descripcionTipoMaquinaria;
    private String estado;

    public String getNombreTipoMaquinaria() {
        return nombreTipoMaquinaria;
    }

    public void setNombreTipoMaquinaria(String nombreTipoMaquinaria) {
        this.nombreTipoMaquinaria = nombreTipoMaquinaria;
    }

    public String getDescripcionTipoMaquinaria() {
        return descripcionTipoMaquinaria;
    }

    public void setDescripcionTipoMaquinaria(String descripcionTipoMaquinaria) {
        this.descripcionTipoMaquinaria = descripcionTipoMaquinaria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public TipoMaquinariaDto toDto(TipoMaquinaria tipoMaquinaria, ModelMapper mapper) {
        super.toDto(tipoMaquinaria, mapper);
        return this;
    }
}
