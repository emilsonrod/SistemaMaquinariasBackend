package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.TipoEquipoDto;

import javax.persistence.Entity;

@Entity
public class TipoEquipo extends ModelBase<TipoEquipoDto> {

    private String nombreTipoEquipo;

    public String getNombreTipoEquipo() {
        return nombreTipoEquipo;
    }

    public void setNombreTipoEquipo(String nombreTipoEquipo) {
        this.nombreTipoEquipo = nombreTipoEquipo;
    }
}
