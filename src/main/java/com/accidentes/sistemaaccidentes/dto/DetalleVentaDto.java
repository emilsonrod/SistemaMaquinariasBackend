package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.DetalleVenta;

import org.modelmapper.ModelMapper;

public class DetalleVentaDto extends DtoBase<DetalleVenta> {

    @Override
    public DetalleVentaDto toDto(DetalleVenta detalleVenta, ModelMapper mapper) {
        super.toDto(detalleVenta, mapper);
        return this;
    }
}
