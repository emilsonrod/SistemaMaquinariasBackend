package com.accidentes.sistemaaccidentes.service;

import com.accidentes.sistemaaccidentes.model.TipoEquipo;
import com.accidentes.sistemaaccidentes.repositories.GenericRepository;
import com.accidentes.sistemaaccidentes.repositories.TipoEquipoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoEquipoServiceImpl extends GenericServiceImpl<TipoEquipo> implements TipoEquipoService {

    private final TipoEquipoRepository repository;

    public TipoEquipoServiceImpl(TipoEquipoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<TipoEquipo> getRepository() {
        return null;
    }
}
