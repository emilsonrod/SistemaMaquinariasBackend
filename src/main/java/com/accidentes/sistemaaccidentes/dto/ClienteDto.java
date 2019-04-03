package com.accidentes.sistemaaccidentes.dto;

import com.accidentes.sistemaaccidentes.model.Cliente;

import org.modelmapper.ModelMapper;

public class ClienteDto extends DtoBase<Cliente> {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String celular;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public ClienteDto toDto(Cliente cliente, ModelMapper mapper) {
        super.toDto(cliente, mapper);
        return this;
    }
}
