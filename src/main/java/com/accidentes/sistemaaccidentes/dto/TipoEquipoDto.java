package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.TipoEquipo;
import org.modelmapper.ModelMapper;

public class TipoEquipoDto extends DtoBase<TipoEquipo> {

    private String nombreTipoEquipo;

    public String getNombreTipoEquipo() {
        return nombreTipoEquipo;
    }

    public void setNombreTipoEquipo(String nombreTipoEquipo) {
        this.nombreTipoEquipo = nombreTipoEquipo;
    }

    @Override
    public TipoEquipoDto toDto(TipoEquipo tipoEquipo, ModelMapper mapper) {
        super.toDto(tipoEquipo, mapper);
        return this;
    }
}
