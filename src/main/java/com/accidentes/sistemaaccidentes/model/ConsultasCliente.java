package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.ConsultasClienteDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ConsultasCliente extends ModelBase<ConsultasClienteDto> {

    private String descripcion;
    private String estado;

    @ManyToOne
    private Cliente cliente;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
