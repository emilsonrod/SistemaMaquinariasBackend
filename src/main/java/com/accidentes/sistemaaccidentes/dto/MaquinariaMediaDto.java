package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.MaquinariaMedia;

import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

public class MaquinariaMediaDto extends DtoBase<MaquinariaMedia> {
    private String nombreMedia;
    private String image;
    private String estado;

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

    @Override
    public MaquinariaMediaDto toDto(MaquinariaMedia maquinariaMedia, ModelMapper mapper) {
        super.toDto(maquinariaMedia, mapper);
        if (maquinariaMedia.getImage() != null) {
            byte[] bytes = new byte[maquinariaMedia.getImage().length];
            for (int i = 0; i < maquinariaMedia.getImage().length; i++) {
                bytes[i] = maquinariaMedia.getImage()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            setImage(imageStr);
        }
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
