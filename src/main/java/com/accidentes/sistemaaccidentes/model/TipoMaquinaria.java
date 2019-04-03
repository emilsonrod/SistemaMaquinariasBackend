package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.TipoMaquinariaDto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TipoMaquinaria extends ModelBase<TipoMaquinariaDto> {

    private String nombreTipoMaquinaria;
    private String descripcionTipoMaquinaria;
    private String estado;
    @OneToMany(mappedBy = "tipoMaquinaria",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Maquinaria> maquinarias = new ArrayList<>();

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

    public List<Maquinaria> getMaquinarias() {
        return maquinarias;
    }

    public void setMaquinarias(List<Maquinaria> maquinarias) {
        this.maquinarias = maquinarias;
    }
}
