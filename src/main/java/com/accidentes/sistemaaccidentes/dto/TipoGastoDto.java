package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.TipoEquipo;
import com.accidentes.sistemaaccidentes.model.TipoGasto;
import org.modelmapper.ModelMapper;

public class TipoGastoDto extends DtoBase<TipoGasto> {
    private String nombreTipoGasto;
    private String estado;

    public String getNombreTipoGasto() {
        return nombreTipoGasto;
    }

    public void setNombreTipoGasto(String nombreTipoGasto) {
        this.nombreTipoGasto = nombreTipoGasto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public TipoGastoDto toDto(TipoGasto tipoGasto, ModelMapper mapper) {
        super.toDto(tipoGasto, mapper);
        return this;
    }
}
