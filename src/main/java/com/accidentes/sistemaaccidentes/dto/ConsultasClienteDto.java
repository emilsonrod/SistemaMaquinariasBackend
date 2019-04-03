package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.ConsultasCliente;

import org.modelmapper.ModelMapper;

public class ConsultasClienteDto extends DtoBase<ConsultasCliente> {

    private String descripcion;
    private String estado;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public ConsultasClienteDto toDto(ConsultasCliente consultasCliente, ModelMapper mapper) {
        super.toDto(consultasCliente, mapper);
        return this;
    }
}
