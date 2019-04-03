package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.Maquinaria;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.MaquinariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaquinariaServiceImpl extends GenericServiceImpl<Maquinaria> implements MaquinariaService {
    private final MaquinariaRepository repository;

    public MaquinariaServiceImpl(MaquinariaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Maquinaria> getRepository() {
        return repository;
    }

    @Override
    public List<Maquinaria> findAllByTipo(long id) {
        return this.repository.findAllByTipo(id);
    }

    @Override
    public List<Maquinaria> findAllByMarca(String marca) {
        return this.repository.findAllByMarca(marca);
    }
    @Override
    public List<Maquinaria> findAllByModelo(String modelo) {
        return this.repository.findAllByModelo(modelo);
    }
    @Override
    public List<Maquinaria> findAllByCapacidad(String capacidad) {
        return this.repository.findAllByCapacidad(capacidad);
    }
    @Override
    public List<Maquinaria> findAllByPrecio(Double precio) {
        return this.repository.findAllByPrecio(precio);
    }
}
