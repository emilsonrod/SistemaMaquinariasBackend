package com.accidentes.sistemaaccidentes.model;

import com.accidentes.sistemaaccidentes.dto.MaquinariaDto;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Maquinaria extends ModelBase<MaquinariaDto> {

    private String marca;
    private String modelo;
    private String capacidad;
    private String estadoStock;
    private String estado;
    private Double precio;
    @ManyToOne
    private TipoMaquinaria tipoMaquinaria;

    @OneToMany(mappedBy = "maquinaria", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<MaquinariaGasto> maquinariaGastos = new ArrayList<>();

    @OneToMany(mappedBy = "maquinaria", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<MaquinariaMedia> maquinariaMedia = new ArrayList<>();

    @OneToMany(mappedBy = "maquinaria", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<DetalleVenta> detalles = new ArrayList<>();

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

    public TipoMaquinaria getTipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void setTipoMaquinaria(TipoMaquinaria tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }

    public List<MaquinariaGasto> getMaquinariaGastos() {
        return maquinariaGastos;
    }

    public void setMaquinariaGastos(List<MaquinariaGasto> maquinariaGastos) {
        this.maquinariaGastos = maquinariaGastos;
    }

    public List<MaquinariaMedia> getMaquinariaMedia() {
        return maquinariaMedia;
    }

    public void setMaquinariaMedia(List<MaquinariaMedia> maquinariaMedia) {
        this.maquinariaMedia = maquinariaMedia;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}
