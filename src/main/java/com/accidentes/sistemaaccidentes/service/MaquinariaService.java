package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.Maquinaria;

import java.util.List;

public interface MaquinariaService extends GenericService<Maquinaria> {
    List<Maquinaria> findAllByTipo(long id);
    List<Maquinaria> findAllByMarca(String marca);
    List<Maquinaria> findAllByModelo(String modelo);
    List<Maquinaria> findAllByCapacidad(String capacidad);
    List<Maquinaria> findAllByPrecio(Double precio);
}
