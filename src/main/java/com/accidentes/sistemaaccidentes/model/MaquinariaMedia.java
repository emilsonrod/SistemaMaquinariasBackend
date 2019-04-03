package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.MaquinariaMediaDto;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class MaquinariaMedia extends ModelBase<MaquinariaMediaDto>  {

    private String nombreMedia;
    @Lob
    private byte[] image;

    private String estado;

    @ManyToOne
    private Maquinaria maquinaria;

    public String getNombreMedia() {
        return nombreMedia;
    }

    public void setNombreMedia(String nombreMedia) {
        this.nombreMedia = nombreMedia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Maquinaria getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }
}
