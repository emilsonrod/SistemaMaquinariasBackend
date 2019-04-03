package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.Venta;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class VentaDto extends DtoBase<Venta> {

    private Date fechaVenta;
    private String estado;

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public VentaDto toDto(Venta venta, ModelMapper mapper) {
        super.toDto(venta, mapper);
        return this;
    }
}
