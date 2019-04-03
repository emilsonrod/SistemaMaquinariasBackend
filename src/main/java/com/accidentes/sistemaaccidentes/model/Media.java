package com.accidentes.sistemaaccidentes.model;

public class Media {
    private String nombreMedia;
    private String image;
    private String estado;
    private Maquinaria maquinaria;

    public String getNombreMedia() {
        return nombreMedia;
    }

    public void setNombreMedia(String nombreMedia) {
        this.nombreMedia = nombreMedia;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
}
