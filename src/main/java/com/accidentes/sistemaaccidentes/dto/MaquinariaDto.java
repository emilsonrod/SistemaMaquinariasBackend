package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.Maquinaria;

import com.accidentes.sistemaaccidentes.model.MaquinariaMedia;
import com.accidentes.sistemaaccidentes.model.Media;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class MaquinariaDto extends DtoBase<Maquinaria> {
    private String marca;
    private String modelo;
    private String capacidad;
    private String estadoStock;
    private String estado;
    private Double precio;
    private String image;
    private List<Media> images;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstadoStock() {
        return estadoStock;
    }

    public void setEstadoStock(String estadoStock) {
        this.estadoStock = estadoStock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public MaquinariaDto toDto(Maquinaria maquinaria, ModelMapper mapper) {
        super.toDto(maquinaria, mapper);
        int lista = maquinaria.getMaquinariaMedia().size();
        ArrayList<Media> medias = new ArrayList<Media>();
        if(maquinaria.getMaquinariaMedia().size() > 0)
        {
            //image = Base64.encodeBase64String(((MaquinariaMedia)maquinaria.getMaquinariaMedia().toArray()[0]).getImage());
            for (MaquinariaMedia maquinariaMedia: maquinaria.getMaquinariaMedia() ) {
                Media mediaFile = new Media();
                mediaFile.setNombreMedia(maquinariaMedia.getNombreMedia());
                mediaFile.setImage(Base64.encodeBase64String(maquinariaMedia.getImage()));
                mediaFile.setEstado(maquinariaMedia.getEstado());
                medias.add(mediaFile);
            }

            images = medias;
        }
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Media> getImages() {
        return images;
    }

    public void setImages(List<Media> images) {
        this.images = images;
    }
}
