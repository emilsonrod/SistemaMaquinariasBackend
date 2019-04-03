package com.accidentes.sistemaaccidentes.repositories;

import com.accidentes.sistemaaccidentes.model.Maquinaria;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaquinariaRepository extends GenericRepository<Maquinaria> {
    @Query(value = "SELECT ma FROM Maquinaria ma WHERE ma.tipoMaquinaria.id = ?1")
    List<Maquinaria> findAllByTipo(long id);
    @Query(value = "SELECT ma FROM Maquinaria ma WHERE ma.marca = ?1")
    List<Maquinaria> findAllByMarca(String marca);
    @Query(value = "SELECT ma FROM Maquinaria ma WHERE ma.modelo = ?1")
    List<Maquinaria> findAllByModelo(String modelo);
    @Query(value = "SELECT ma FROM Maquinaria ma WHERE ma.capacidad = ?1")
    List<Maquinaria> findAllByCapacidad(String capacidad);
    @Query(value = "SELECT ma FROM Maquinaria ma WHERE ma.precio = ?1")
    List<Maquinaria> findAllByPrecio(Double precio);
}
