package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.TipoGastoDto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TipoGasto extends ModelBase<TipoGastoDto> {
    private String nombreTipoGasto;
    private String estado;

    @OneToMany(mappedBy = "tipoGasto", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<MaquinariaGasto> maquinariaGastos = new ArrayList<>();

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

    public List<MaquinariaGasto> getMaquinariaGastos() {
        return maquinariaGastos;
    }

    public void setMaquinariaGastos(List<MaquinariaGasto> maquinariaGastos) {
        this.maquinariaGastos = maquinariaGastos;
    }
}
