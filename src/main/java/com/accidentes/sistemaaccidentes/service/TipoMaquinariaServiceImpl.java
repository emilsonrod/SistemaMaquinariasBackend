package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.TipoMaquinaria;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.TipoMaquinariaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoMaquinariaServiceImpl extends GenericServiceImpl<TipoMaquinaria> implements TipoMaquinariaService {

    private final TipoMaquinariaRepository repository;

    public TipoMaquinariaServiceImpl(TipoMaquinariaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<TipoMaquinaria> getRepository() {
        return repository;
    }

}
